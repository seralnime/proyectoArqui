package com.RestauranteMexicano.JavaMappers;

import java.util.List;
import com.RestauranteMexicano.modelos.Producto;
//import org.apache.ibatis.annotations.Param;


/**
    Diseño y arquitectura de software
    @author
        Santiago Sánchez Cárdenas - 0000271976
        Sergio Gabriel Nieto Meneses - 0000246107
        Mauricio Andres Valderrama Acosta - 0000251802

 */
public interface ProductoMapper {

    public List<Producto> consultarProductos();

    public Producto consultarProducto(int id); 

    public void insertarProducto(Producto pr);

   // public void restarStock(@Param("idProducto") int idProducto, @Param("cantidadComprada") int cantidadComprada);
    
}
