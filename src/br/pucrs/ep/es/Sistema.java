package br.pucrs.ep.es;

import java.util.ArrayList;

public class Sistema {
    private ArrayList<Fila> clientePrioritario;
    private ArrayList<Fila> cliente;

    public Sistema(){
        this.cliente = new ArrayList<Fila>();
        this.clientePrioritario = new ArrayList<Fila>();
    }

    public void colocarClienteNaFila(Cliente cl, int pos){
        Fila fila = new Fila(pos, cl);
        if(cl.getIdade() >=65){
            clientePrioritario.add(fila);
        }else{
            cliente.add(fila);
        }

    }

    public void atenderClienteNormal(){


    }



    public ArrayList<Fila> listar(){
        return new ArrayList<>(cliente);
    }
}
