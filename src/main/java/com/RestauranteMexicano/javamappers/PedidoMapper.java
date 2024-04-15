package com.RestauranteMexicano.JavaMappers;

import com.RestauranteMexicano.modelos.Pedido;
import com.RestauranteMexicano.modelos.Producto;

import java.util.List;

/**
    Santiago Sánchez Cárdenas
    Sergio Gabriel Nieto Meneses
    Mauricio Andres Valderrama Acosta
 */
public interface PedidoMapper {

    public List<Pedido> consultarPedidos();

    public Pedido consultarPedido(int id);

    public void insertarPedido(Pedido pedido);
    
    public List<Producto> consultarProductosPorPedido(int idPedido);

}
