package main.java.com.RestauranteMexicano.javamappers;

import java.util.List;
import main.java.com.RestauranteMexicano.modelos.Producto;

/**
    Santiago Sánchez Cárdenas
    Sergio Gabriel Nieto Meneses
    Mauricio Andres Valderrama Acosta
 */
public interface Productomapper {

    public List<Producto> consultarProductos();

    public Producto consultarProducto(int id);

    public void insertarProducto(Producto pr);

}
