package br.pucrs.ep.es;

import java.util.ArrayList;

public class Sistema {
    private ArrayList<Cliente> clientePrioritario;
    private ArrayList<Cliente> cliente;

    public Sistema(){
        this.cliente = new ArrayList<Cliente>();
        this.clientePrioritario = new ArrayList<Cliente>();
    }

    public void colocarClienteNaFila(Cliente cl){

        if(cl.getIdade() >=65){
            clientePrioritario.add(cl);
        }else{
            cliente.add(cl);
        }

    }

    public void removerCliente(){
        cliente.remove(0);
    }

    public void removerClientePrioritario(){
        clientePrioritario.remove(0);
    }
    public void atenderClienteNormal(){


    }



    public ArrayList<Cliente> listar(){
        return new ArrayList<>(cliente);
    }
}
