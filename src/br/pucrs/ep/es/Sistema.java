package br.pucrs.ep.es;

import java.util.ArrayList;

public class Sistema {
    private ArrayList<String> clientes;



    public Sistema(){
        this.clientes = new ArrayList<String>();

    }

    public void colocarClienteNaFila(String nome){
        clientes.add(nome);


    }
    public String pegarCliente(){
       return clientes.get(0);
    }

    public void removerCliente(){
        if(!clientes.isEmpty()) {

        clientes.remove(0);
    }else{
        System.out.println("Não há clientes na fila");
    }
    }


    public ArrayList<String> listar(){
        return new ArrayList<>(clientes);

    }
}

