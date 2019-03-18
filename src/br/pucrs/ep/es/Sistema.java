package br.pucrs.ep.es;

import java.util.ArrayList;

public class Sistema {
    private ArrayList<String> clientesNormal;
    private ArrayList<String> clientesPrioritarios;
    private CadastroContas cadastro;
    private Banco banco;



    public Sistema(CadastroContas cc, Banco banco){
        this.clientesNormal= new ArrayList<String>();
        this.clientesPrioritarios= new ArrayList<String>();
        this.cadastro = cc;
        this.banco = banco;

    }

    public void colocarClienteNaFila(String nome){
        if(cadastro.pesquisarConta(nome).getCliente().getIdade()>=65) {
            clientesPrioritarios.add(nome);
        }else if(cadastro.pesquisarConta(nome).getCliente().getIdade()<65){
            clientesNormal.add(nome);
        }else{
            System.out.println("não há cliente cadastrado");
        }

    }
    public String pegarClienteNormal(){
       return clientesNormal.get(0);
    }

    public String pegarClientePrioritario(){
        return clientesPrioritarios.get(0);
    }

    public void removerClienteNormal(){
        if(!clientesNormal.isEmpty()) {

            clientesNormal.remove(0);
        }else{
            System.out.println("Não há clientes na fila");
        }
    }

    public void removerClientePrioritario(){
        if(!clientesPrioritarios.isEmpty()) {

            clientesPrioritarios.remove(0);
        }else{
            System.out.println("Não há clientes na fila");
        }
    }


    public void atenderClienteDaFilal(int numeroCaixa){
        if(numeroCaixa == 6) {
            banco.menu(cadastro.pesquisarConta(pegarClienteNormal()));
            removerClienteNormal();
        }else if(numeroCaixa >=1 && numeroCaixa<6){
            banco.menu(cadastro.pesquisarConta(pegarClientePrioritario()));
            removerClientePrioritario();
        }else{
            System.out.println("não há clientes na fila.");
        }
    }

}

