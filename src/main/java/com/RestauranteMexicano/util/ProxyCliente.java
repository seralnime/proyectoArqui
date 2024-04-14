package main.java.com.RestauranteMexicano.util;

import java.util.List;

/**
    Santiago Sánchez Cárdenas
    Sergio Gabriel Nieto Meneses
    Mauricio Andres Valderrama Acosta
 */

import main.java.com.RestauranteMexicano.modelos.Cliente;
import main.java.com.RestauranteMexicano.modelos.Pedido;
import main.java.com.RestauranteMexicano.modelos.Producto;

public class ProxyCliente implements ClientePedido{
    private Cliente cliente;
    private boolean esPremium;

    public ProxyCliente(Cliente cliente){
        this.cliente = cliente;
        this.esPremium = LicenciaValida();
    }
    private boolean LicenciaValida() {
       // if(cliente.getLicencia() in Licencias)
        return true; //Hay que cambiar esto cuando se implemente persistencia de datos
    }
    public void TraeInventario(){
        Pedido p = new Pedido();
        List<Producto> ProductosDisponibles = p.TraeInventario(esPremium);
        if(!ProductosDisponibles.isEmpty()){
            System.out.println("--------------------------------------");
            System.out.println("Listado de productos disponibles:");
            System.out.println("--------------------------------------");
        }
        for(Producto producto : ProductosDisponibles){
            System.out.println();
            System.out.println("Nombre producto: "+producto.getNombre());
            System.out.println("Cantidad: "+producto.getCantidad());
            System.out.println("Precio "+producto.getPrecio());
        }
        System.out.println("--------------------------------------");
    }
    @Override
    public Pedido HacePedido(List<Producto> productos) {
        Pedido pedido = new Pedido(cliente, productos, esPremium);
        return pedido;
    }
}
