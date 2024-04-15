package com.RestauranteMexicano.util;

import java.util.List;

import com.RestauranteMexicano.modelos.Pedido;
import com.RestauranteMexicano.modelos.Producto;

/**
    Santiago Sánchez Cárdenas
    Sergio Gabriel Nieto Meneses
    Mauricio Andres Valderrama Acosta
 */

public interface ClientePedido {
    Pedido HacePedido(List<Producto> productos);
    void TraeInventario();
}
    