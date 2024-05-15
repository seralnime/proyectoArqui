package com.RestauranteMexicano.modelos;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.RestauranteMexicano.JavaMappers.ProductoMapper;



/**
    Diseño y arquitectura de software
    @author
        Santiago Sánchez Cárdenas - 0000271976
        Sergio Gabriel Nieto Meneses - 0000246107
        Mauricio Andres Valderrama Acosta - 0000251802

 */


public class Pedido {
    private Cliente cliente;
    private List<Producto> productos;
    private float total;
    private boolean PagoHecho;
    private float tarifaDomicilio;

    public Pedido(Cliente cliente, List<Producto> productos,boolean esPremium) {
        if(!esPremium){
            this.tarifaDomicilio = 3500;
        } else {
            this.tarifaDomicilio = 0;
        }
        this.cliente = cliente;
        this.productos = productos;
        this.calculaPago(esPremium);
    }
    public Pedido(){}
    
    public void calculaPago(boolean esPremium){
        float totalP = 0;
        for (Producto producto : this.productos) {
            totalP += producto.getPrecio() * producto.getCantidad();
        }
        totalP += this.tarifaDomicilio;
        this.setTotal(totalP);
    }
    public List<Producto> TraeInventario(boolean esPremium, SqlSessionFactory session){
        SqlSession sqlss = session.openSession();
        ProductoMapper pm = sqlss.getMapper(ProductoMapper.class);
        List<Producto> productos = pm.consultarProductos();
        Inventario inventario = new Inventario(productos);
        return inventario.getListadoProductos(esPremium);
    }

    public float getTarifaDomicilio() {
        return tarifaDomicilio;
    }
    public void setTarifaDomicilio(float tarifaDomicilio) {
        this.tarifaDomicilio = tarifaDomicilio;
    }
    public Cliente getCliente() {
        return this.cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<Producto> getProductos() {
        return this.productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }

    public float getTotal() {
        return this.total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public float getTarifa() {
        return this.tarifaDomicilio;
    }

    public void setTarifa(float tarifa) {
        this.tarifaDomicilio = tarifa;
    }

    public boolean isPagoHecho() {
        return this.PagoHecho;
    }

    public void setPagoHecho(boolean pagoHecho) {
        this.PagoHecho = pagoHecho;
    }

}
