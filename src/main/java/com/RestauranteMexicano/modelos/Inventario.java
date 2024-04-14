package main.java.com.RestauranteMexicano.modelos;

import java.util.List;

/**
    Santiago Sánchez Cárdenas
    Sergio Gabriel Nieto Meneses
    Mauricio Andres Valderrama Acosta
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
