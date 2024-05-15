package com.RestauranteMexicano.modelos;

import java.util.List;


/**
    Diseño y arquitectura de software
    @author
        Santiago Sánchez Cárdenas - 0000271976
        Sergio Gabriel Nieto Meneses - 0000246107
        Mauricio Andres Valderrama Acosta - 0000251802

 */
public class Inventario {
    private List<Producto> ListadoProductos;

    public Inventario(){

    }

    public Inventario(List<Producto> ListadoProductos){
        this.ListadoProductos = ListadoProductos;
    }
    
    public List<Producto> getListadoProductos(boolean esPremium) {
        if(esPremium){
            for (Producto producto : this.ListadoProductos){
                if(producto.getTieneDescuento()){
                    float precioNuevo = producto.getPrecio() * 0.9f;
                    producto.setPrecio(precioNuevo);
                }
            }
        }
        return this.ListadoProductos;
    }

    public void setListadoProductos(List<Producto> listadoProductos) {
        this.ListadoProductos = listadoProductos;
    }
}
