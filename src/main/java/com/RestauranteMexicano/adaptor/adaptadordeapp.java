package src.main.java.com.RestauranteMexicano.adaptor;

import java.util.List;

import src.main.java.com.RestauranteMexicano.modelos.*;

public class adaptadordeapp<pedido> implements app {

    pedido app;

    public adaptadordeapp(pedido app) {
        this.app = app;
    }

    public void orden(Cliente cliente, List<Producto> productos, boolean esPremium) {
        this.app.pedido(cliente, productos, esPremium);
    }

    public void stop() {
        this.app.stop();
    }

}
