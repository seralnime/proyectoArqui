package com.RestauranteMexicano.JavaMappers;

import java.util.List;

import com.RestauranteMexicano.modelos.Cliente;


/**
    Diseño y arquitectura de software
    @author
        Santiago Sánchez Cárdenas - 0000271976
        Sergio Gabriel Nieto Meneses - 0000246107
        Mauricio Andres Valderrama Acosta - 0000251802

 */  
public interface ClienteMapper {

    public List<Cliente> consultarClientes();

    public Cliente consultarCliente(int id);

    public void insertarCliente(Cliente cli);

}
