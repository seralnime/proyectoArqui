package com.RestauranteMexicano.adaptor;

import java.util.List;

import com.RestauranteMexicano.modelos.*;
/**
    Diseño y arquitectura de software
    @author
        Santiago Sánchez Cárdenas - 0000271976
        Sergio Gabriel Nieto Meneses - 0000246107
        Mauricio Andres Valderrama Acosta - 0000251802

 */ 
public class adaptadordeapp<pedido> implements app {

    pedido app;

    public adaptadordeapp(pedido app) {
        this.app = app;
    }

    public void orden(Cliente cliente, List<Producto> productos, boolean esPremium) {
        //this.app.pedido(cliente, productos, esPremium);
    }

    public void stop() {
        //this.app.stop();
    }

}
