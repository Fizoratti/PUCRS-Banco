package br.pucrs.ep.es;

import java.util.ArrayList;

public class CadastroContas {

    private ArrayList<Conta> contas;

    public CadastroContas() {

        this.contas = new ArrayList<Conta>();
    }

    public void inserirConta(Conta c){
        contas.add(c);
    }

    public void removerConta(String nomeTitular){
        for(Conta c : contas){
            if(c.getCliente().getNome().equals(nomeTitular)){
                contas.remove(c);
            }
        }

    }

    public Conta pesquisarConta(String nomeTitular){
        for(Conta c : contas){
            if(c.getCliente().getNome().equals(nomeTitular)){
                return c;
            }
        }
            return null;
    }

    public ArrayList<Conta> getContas() {
        return contas;
    }

    public ArrayList<Conta> listarContas(){
        return new ArrayList<>(contas);
    }
}
