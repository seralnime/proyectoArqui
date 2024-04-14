package main.java.com.RestauranteMexicano.modelos;

import java.util.ArrayList;
import java.util.List;

/**
 * Santiago Sánchez Cárdenas
 * Sergio Gabriel Nieto Meneses
 * Mauricio Andres Valderrama Acosta
 */
public class Pedido {
    private Cliente cliente;
    private List<Producto> productos;
    private float total;
    private boolean PagoHecho;
    private float tarifaDomicilio;

    public Pedido(Cliente cliente, List<Producto> productos, boolean esPremium) {
        if (!esPremium) {
            this.tarifaDomicilio = 3500;
        } else {
            this.tarifaDomicilio = 0;
        }
        this.cliente = cliente;
        this.productos = productos;
        this.calculaPago(esPremium);
    }
    public Pedido(){

    }
    public void calculaPago(boolean esPremium){
        float totalP = 0;
        for (Producto producto : this.productos) {
            totalP += producto.getPrecio() * producto.getCantidad();
        }
        totalP += this.tarifaDomicilio;
        this.setTotal(totalP);
    }
    public List<Producto> TraeInventario(boolean esPremium){
        List<Producto> productos = new ArrayList<Producto>();

        Producto enchiladas = new Producto(1,"Enchiladas", "Deliciosas enchiladas mexicanas", 10, 25000f, 
                List.of("Tortillas de maíz", "Pollo", "Salsa roja", "Queso", "Crema"), true);
        Producto tacos = new Producto(2,"Tacos", "Auténticos tacos mexicanos", 15, 18000f, 
                List.of("Tortillas de maíz", "Carne asada", "Cilantro", "Cebolla", "Salsa verde"), true);
        Producto limonada = new Producto(3,"Limonada", "Refrescante limonada natural", 20, 4500f, 
                List.of("Limón", "Agua", "Azúcar"), true);

        productos.add(enchiladas);
        productos.add(tacos);
        productos.add(limonada);

        Inventario inventario = new Inventario(productos);

        return inventario.getListadoProductos(esPremium);
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
