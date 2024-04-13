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
    private float Precio;
    private List<String> Ingredientes;
    
    public Producto() {
    }

    public Producto(String nombre, String descripcion, float precio, List<String> ingredientes) {
        this.Nombre = nombre;
        this.Descripcion = descripcion;
        this.Precio = precio;
        this.Ingredientes = ingredientes;
    }

    public String getNombre() {
        return this.Nombre;
    }

    public String getDescripcion() {
        return this.Descripcion;
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
}

