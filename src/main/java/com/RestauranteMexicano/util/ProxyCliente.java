package com.RestauranteMexicano.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;


/**
    Diseño y arquitectura de software
    @author
        Santiago Sánchez Cárdenas - 0000271976
        Sergio Gabriel Nieto Meneses - 0000246107
        Mauricio Andres Valderrama Acosta - 0000251802

 */

import com.RestauranteMexicano.modelos.Cliente;
import com.RestauranteMexicano.modelos.Pedido;
import com.RestauranteMexicano.modelos.Producto;

public class ProxyCliente implements ClientePedido{
    private Cliente cliente;
    private boolean esPremium;

    public static SqlSessionFactory getSqlSessionFactory() {
        SqlSessionFactory sqlSessionFactory = null;
        if (sqlSessionFactory == null) {
            InputStream inputStream;
            try {
                inputStream = Resources.getResourceAsStream("mybatis-config.xml");
                sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
            } catch (IOException e) {
                throw new RuntimeException(e.getCause());
            }
        }
        return sqlSessionFactory;
    }
    

    public ProxyCliente(Cliente cliente){
        this.cliente = cliente;
        this.esPremium = LicenciaValida();
    }
    private boolean LicenciaValida() {
       // if(cliente.getLicencia() in Licencias)
        return true; //Hay que cambiar esto cuando se implemente persistencia de datos
    }
    public void TraeInventario(){
        SqlSessionFactory session = getSqlSessionFactory();
        Pedido p = new Pedido();
        List<Producto> ProductosDisponibles = p.TraeInventario(esPremium, session);
        if(!ProductosDisponibles.isEmpty()){
            System.out.println("--------------------------------------");
            System.out.println("Listado de productos disponibles:");
            System.out.println("--------------------------------------");
        }
        for(Producto producto : ProductosDisponibles){
            System.out.println();
            System.out.println("Nombre producto: "+producto.getNombre());
            System.out.println("Cantidad: "+producto.getCantidad());
            System.out.println("Precio "+producto.getPrecio());
        }
        System.out.println("--------------------------------------");
    }
    @Override
    public Pedido HacePedido(List<Producto> productos) {
        Pedido pedido = new Pedido(1,cliente, productos, esPremium);//con la persistencia se elimina el id y se deja autoincrement
        return pedido;
    }
}
