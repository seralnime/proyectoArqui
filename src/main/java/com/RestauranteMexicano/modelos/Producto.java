package main.java.com.RestauranteMexicano.modelos;

import java.util.List;

/**
    Santiago Sánchez Cárdenas
    Sergio Gabriel Nieto Meneses
    Mauricio Andres Valderrama Acosta
 */

public class Producto {
    private String Nombre;
    private String Descripcion;
    private int Cantidad;

    private float Precio;
    private List<String> Ingredientes;
    private boolean TieneDescuento;

    public Producto() {
    }

    public Producto(String nombre, String descripcion, int Cantidad, float precio, List<String> ingredientes, boolean TieneDescuento) {
        this.Nombre = nombre;
        this.Descripcion = descripcion;
        this.Cantidad = Cantidad;
        this.Precio = precio;
        this.Ingredientes = ingredientes;
        this.TieneDescuento = TieneDescuento;
    }

    public String getNombre() {
        return this.Nombre;
    }

    public String getDescripcion() {
        return this.Descripcion;
    }

    public int getCantidad() {
        return this.Cantidad;
    }

    public void setCantidad(int cantidad) {
        this.Cantidad = cantidad;
    }

    public float getPrecio() {
        return this.Precio;
    }

    public List<String> getIngredientes() {
        return this.Ingredientes;
    }

    public void setNombre(String nombre) {
        this.Nombre = nombre;
    }

    public void setDescripcion(String descripcion) {
        this.Descripcion = descripcion;
    }

    public void setPrecio(float precio) {
        this.Precio = precio;
    }

    public void setIngredientes(List<String> ingredientes) {
        this.Ingredientes = ingredientes;
    }
    
    public boolean TieneDescuento() {
        return TieneDescuento;
    }

    public void setTieneDescuento(boolean tieneDescuento) {
        TieneDescuento = tieneDescuento;
    }
}
