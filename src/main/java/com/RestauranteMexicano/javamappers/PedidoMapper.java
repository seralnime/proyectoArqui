package com.RestauranteMexicano.JavaMappers;

import com.RestauranteMexicano.modelos.Pedido;
import com.RestauranteMexicano.modelos.Producto;

import java.util.List;


/**
    Diseño y arquitectura de software
    @author
        Santiago Sánchez Cárdenas - 0000271976
        Sergio Gabriel Nieto Meneses - 0000246107
        Mauricio Andres Valderrama Acosta - 0000251802

 */
public interface PedidoMapper {

    public List<Pedido> consultarPedidos();

    public Pedido consultarPedido(int id);

    public void insertarPedido(Pedido pedido);
    
    public List<Producto> consultarProductosPorPedido(int idPedido);

}
