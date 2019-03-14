package br.pucrs.ep.es;

public class Banco {
    private CadastroContas contas;


    public Banco() {
        this.contas = new CadastroContas();
    }

    //fazer um menu
    public void menu(int opcao){
        switch(opcao){

        }
    }

    public void criarConta(String nome, int idade){
        Conta c = new Conta(nome, idade);
        contas.inserirConta(c);
    }
    //criar uma conta;
    //depositar dinheiro em uma conta;
    //sacar dinheiro em uma contar;
    //consultar o saldo de uma conta;
    //encerrar uma conta.
}
