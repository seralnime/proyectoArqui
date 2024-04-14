package com.RestauranteMexicano;

import java.util.ArrayList;
import java.util.List;

import com.RestauranteMexicano.modelos.Cliente;
import com.RestauranteMexicano.modelos.Pedido;
import com.RestauranteMexicano.modelos.Producto;
import com.RestauranteMexicano.util.ProxyCliente;

/**
    Santiago Sánchez Cárdenas
    Sergio Gabriel Nieto Meneses
    Mauricio Andres Valderrama Acosta
 */

public class Restaurante{
    public static void main(String[] args){
        System.out.println("Estamos dentro");
        proxyPrueba();
    }
    public static void proxyPrueba(){

        Cliente Santi = new Cliente("Santiago Sánchez", 0, "2501", "Cra 2 45b");
        ProxyCliente pc = new ProxyCliente(Santi);
        pc.TraeInventario();
        List<Producto> productosPedido = new ArrayList<Producto>();
        Pedido p = pc.HacePedido(productosPedido);
        System.out.println("--------------------------------------");
        System.out.println("Información pedido:");
        for(Producto producto:p.getProductos()){
                System.out.println("  Nombre producto: "+producto.getNombre());
                System.out.println("  Descripcion: "+producto.getDescripcion());
                System.out.println("  Cantidad: "+producto.getCantidad());
                System.out.println("  Precio: "+producto.getPrecio());
                System.out.println("  Subtotal: "+producto.getCantidad()*producto.getPrecio());
        }
        System.out.println("Tarifa domicilio: "+p.getTarifa());
        System.out.println("Total: "+p.getTotal());
        System.out.println("--------------------------------------");
    }
}