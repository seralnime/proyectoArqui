package com.RestauranteMexicano.util;

import java.util.List;

import com.RestauranteMexicano.modelos.Pedido;
import com.RestauranteMexicano.modelos.Producto;


/**
    Diseño y arquitectura de software
    @author
        Santiago Sánchez Cárdenas - 0000271976
        Sergio Gabriel Nieto Meneses - 0000246107
        Mauricio Andres Valderrama Acosta - 0000251802

 */

public interface ClientePedido {
    Pedido HacePedido(List<Producto> productos);
    void TraeInventario();
}
    