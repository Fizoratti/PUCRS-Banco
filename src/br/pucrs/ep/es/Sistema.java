package br.pucrs.ep.es;

import java.util.ArrayList;

public class Sistema {
    private ArrayList<Cliente> clientes;

    public Sistema(){
        clientes = new ArrayList<Cliente>();
    }

    public void registrarCliente(Cliente cliente){
        clientes.add(cliente);
    }

    public ArrayList<Cliente> listar(){
        return new ArrayList<>(clientes);
    }
}
