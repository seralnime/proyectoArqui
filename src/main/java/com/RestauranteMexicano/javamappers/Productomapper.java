package com.RestauranteMexicano.JavaMappers;

import java.util.List;
import com.RestauranteMexicano.modelos.Producto;
//import org.apache.ibatis.annotations.Param;

/**
    Santiago Sánchez Cárdenas
    Sergio Gabriel Nieto Meneses
    Mauricio Andres Valderrama Acosta
 */
public interface ProductoMapper {

    public List<Producto> consultarProductos();

    public Producto consultarProducto(int id); 

    public void insertarProducto(Producto pr);

   // public void restarStock(@Param("idProducto") int idProducto, @Param("cantidadComprada") int cantidadComprada);
    
}
