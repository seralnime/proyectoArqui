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
    private float tarifaDomicilio;
    
    public Pedido(Cliente cliente, List<Producto> productos,boolean esPremium) {
        if(!esPremium){
            this.tarifaDomicilio = 3500;
        }else{
            this.tarifaDomicilio = 0;
        }
        this.cliente = cliente;
        this.productos = productos;
        this.calculaPago(esPremium);
    }
    public void calculaPago(boolean esPremium){
        float totalP = 0;
        for(Producto producto : this.productos){
            totalP += producto.getPrecio()*producto.getCantidad();
        }
        totalP += this.tarifaDomicilio;
        this.setTotal(totalP); 
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
    public float getTarifa() {
        return this.tarifaDomicilio;
    }
    public void setTarifa(float tarifa) {
        this.tarifaDomicilio = tarifa;
    }
    public boolean isPagoHecho() {
        return PagoHecho;
    }
    public void setPagoHecho(boolean pagoHecho) {
        PagoHecho = pagoHecho;
    }

    
}
