package main.java.com.RestauranteMexicano.util;

/**
    Santiago Sánchez Cárdenas
    Sergio Gabriel Nieto Meneses
    Mauricio Andres Valderrama Acosta
 */

import main.java.com.RestauranteMexicano.modelos.Cliente;

public class ProxyCliente implements ClientePedido{
    private Cliente cliente;

    public ProxyCliente(Cliente cliente){
        this.cliente = cliente;
    }
    private boolean LicenciaValida() {


        return true;
    }
    public void TraeInventario(boolean esPremium){
        if(LicenciaValida()){

        }
    }
    @Override
    public void HacePedido(boolean esPremium) {
        if(LicenciaValida()){
            
        }
        
    }
}
