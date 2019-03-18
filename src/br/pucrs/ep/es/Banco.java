package br.pucrs.ep.es;

import java.util.Scanner;

public class Banco {
    private CadastroContas contas;
    private Conta conta;


    public Banco(CadastroContas contas) {

        this.contas = contas;
    }

    //fazer um menu
    public void menu(Conta c){
        int opcao;

        do {
            Scanner ler = new Scanner(System.in);
            //System.out.println("1 - Registrar Cliente");
            System.out.println("1 - Sacar");
            System.out.println("2 - depositar");
            System.out.println("3 - consultar saldo");
            System.out.println("0 - sair ");
            System.out.print("Diite sua opção: ");
            opcao = ler.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println("Digite a quantidade para sacar: ");
                    double sacar = ler.nextDouble();
                    sacarDinheiro(sacar, c);
                    System.out.println("seu novo saldo é: " + c.getSaldo());
                    break;

                case 2:
                    System.out.println("Digite a quantidade para deposito: ");
                    double deposito = ler.nextDouble();
                    depositarDinheiro(deposito, c);
                    System.out.println("seu novo saldo é: " + c.getSaldo());
                    break;
                case 3:
                    System.out.println("seu saldo é: " + c.getSaldo());
                    break;
                case 4:

                    break;
            }
        }while(opcao!=0);
    }
    //criar uma conta;
    public void criarConta(String nome, int idade){
        Conta c = new Conta(nome, idade);
        contas.inserirConta(c);
        System.out.println("Conta criada!");

    }
    //depositar dinheiro em uma conta;
    public void depositarDinheiro(double valor, Conta c){
        c.depositar(valor);
    }

    //sacar dinheiro em uma contar;

    public void sacarDinheiro(double valor, Conta c){
        c.retirada(valor);
    }
    //consultar o saldo de uma conta;
    public void consultarSaldo(String nomeTitular){
        conta.getSaldo();
    }
    //encerrar uma conta.
}
