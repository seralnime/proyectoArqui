package main.java.com.RestauranteMexicano;

import java.util.ArrayList;
import java.util.List;

import main.java.com.RestauranteMexicano.modelos.Cliente;
import main.java.com.RestauranteMexicano.modelos.Inventario;
import main.java.com.RestauranteMexicano.modelos.Pedido;
import main.java.com.RestauranteMexicano.modelos.Producto;
import main.java.com.RestauranteMexicano.util.ProxyCliente;

/**
    Santiago Sánchez Cárdenas
    Sergio Gabriel Nieto Meneses
    Mauricio Andres Valderrama Acosta
 */

public class RestauranteMexicano{
    public static void main(String[] args){
        proxyPrueba();
        
    }
    public static void proxyPrueba(){
        List<Producto> productos = new ArrayList<Producto>();

        Producto enchiladas = new Producto("Enchiladas", "Deliciosas enchiladas mexicanas", 10, 25000f, 
                List.of("Tortillas de maíz", "Pollo", "Salsa roja", "Queso", "Crema"), true);
        Producto tacos = new Producto("Tacos", "Auténticos tacos mexicanos", 15, 18000f, 
                List.of("Tortillas de maíz", "Carne asada", "Cilantro", "Cebolla", "Salsa verde"), true);
        Producto limonada = new Producto("Limonada", "Refrescante limonada natural", 20, 4500f, 
                List.of("Limón", "Agua", "Azúcar"), true);

        productos.add(enchiladas);
        productos.add(tacos);
        productos.add(limonada);

        Inventario inventario = new Inventario(productos);

        Cliente Santi = new Cliente("Santiago Sánchez", 0, "2501", "Cra 2 45b");
        ProxyCliente pc = new ProxyCliente(Santi, inventario);
        pc.TraeInventario();
        List<Producto> productosPedido = new ArrayList<Producto>();
        
        enchiladas.setCantidad(2);
        tacos.setCantidad(3);
        limonada.setCantidad(5);
        
        productosPedido.add(enchiladas);
        productosPedido.add(tacos);
        productosPedido.add(limonada);
        Pedido p = pc.HacePedido(productosPedido);
        System.out.println("--------------------------------------");
        System.out.println("Información pedido:");
        for(Producto producto:p.getProductos()){
                System.out.println("  Nombre producto: "+producto.getNombre());
                System.out.println("  Descripcion: "+producto.getDescripcion());
                System.out.println("  Cantidad: "+producto.getCantidad());
                System.out.println("  Precio: "+producto.getPrecio());
                System.out.println("  Subtotal: "+producto.getCantidad()*producto.getPrecio());
        }
        System.out.println("Tarifa domicilio: "+p.getTarifa());
        System.out.println("Total: "+p.getTotal());
        System.out.println("--------------------------------------");
    }
}