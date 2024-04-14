package com.RestauranteMexicano.JavaMappers;

import java.util.List;

import com.RestauranteMexicano.modelos.Cliente;

/**
    Santiago Sánchez Cárdenas
    Sergio Gabriel Nieto Meneses
    Mauricio Andres Valderrama Acosta
 */
public interface ClienteMapper {

    public List<Cliente> consultarClientes();

    public Cliente consultarCliente(int id);

    public void insertarCliente(Cliente cli);

}
