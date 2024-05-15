package com.RestauranteMexicano.modelos;



/**
    Diseño y arquitectura de software
    @author
        Santiago Sánchez Cárdenas - 0000271976
        Sergio Gabriel Nieto Meneses - 0000246107
        Mauricio Andres Valderrama Acosta - 0000251802

 */

public class Producto {
    private int Id;
    private String Nombre;
    private String Descripcion;
    private int Cantidad;

    private float Precio;
    private String Ingredientes;
    private boolean TieneDescuento;

    public Producto() {
    }

    public Producto(int id, String nombre, String descripcion, int Cantidad, float precio, String ingredientes, boolean TieneDescuento) {
        this.Id = id;
        this.Nombre = nombre;
        this.Descripcion = descripcion;
        this.Cantidad = Cantidad;
        this.Precio = precio;
        this.Ingredientes = ingredientes;
        this.TieneDescuento = TieneDescuento;
    }
    
    public int getID() {
        return this.Id;
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

    public float getPrecio() {
        return this.Precio;
    }

    public String getIngredientes() {
        return this.Ingredientes;
    }

    public boolean getTieneDescuento() {
        return TieneDescuento;
    }

    public void setId(int id) {
        this.Id = id;
    }

    public void setNombre(String nombre) {
        this.Nombre = nombre;
    }

    public void setDescripcion(String descripcion) {
        this.Descripcion = descripcion;
    }

    public void setCantidad(int cantidad) {
        this.Cantidad = cantidad;
    }

    public void setPrecio(float precio) {
        this.Precio = precio;
    }

    public void setIngredientes(String ingredientes) {
        this.Ingredientes = ingredientes;
    }

    public void setTieneDescuento(boolean tieneDescuento) {
        TieneDescuento = tieneDescuento;
    }

    public int getId() {
        return Id;
    }
}