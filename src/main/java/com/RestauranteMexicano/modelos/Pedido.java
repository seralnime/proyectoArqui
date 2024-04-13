package main.java.com.RestauranteMexicano.modelos;

import java.util.List;

/**
    Santiago Sánchez Cárdenas
    Sergio Gabriel Nieto Meneses
    Mauricio Andres Valderrama Acosta
 */
public class Pedido {
    private Cliente cliente;
    private List<Producto> productos; 
    private float total;
    private boolean PagoHecho;
    
    public Pedido(Cliente cliente, List<Producto> productos) {
        this.cliente = cliente;
        this.productos = productos;
        calculaPago();
    }
    public void calculaPago(){
        float total = 0;
        for(Producto producto : this.productos){
            total += producto.getPrecio()*producto.getCantidad();
        }
        this.total = total;
    }
    public Cliente getCliente() {
        return cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public List<Producto> getProductos() {
        return productos;
    }
    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }
    public float getTotal() {
        return total;
    }
    public void setTotal(float total) {
        this.total = total;
    }
    public boolean isPagoHecho() {
        return PagoHecho;
    }
    public void setPagoHecho(boolean pagoHecho) {
        PagoHecho = pagoHecho;
    }

    
}
