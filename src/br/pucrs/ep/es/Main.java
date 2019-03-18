package br.pucrs.ep.es;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Sistema sistema = new Sistema();
        CadastroContas cadastro = new CadastroContas();
        Banco banco = new Banco(cadastro);


        Scanner ler = new Scanner(System.in);
        int opc;
        int dos;
        double retirada, deposito;

        do {
            System.out.println("1 - Registrar Cliente");
            System.out.println("2 - Atender Cliente direto");
            System.out.println("3 - enviar cliente para fila");
            System.out.println("4 - escolher caixa para o atendimento");
            System.out.println("0 - sair");
            System.out.print("Digite sua opção: ");

            // Scanner ler = new Scanner(System.in);
            opc = ler.nextInt();


            switch (opc) {
                case 1:
                    System.out.println("Digite nome: ");
                    String nome = ler.next();
                    System.out.println("Digite idade: ");
                    int idade = ler.nextInt();
                    banco.criarConta(nome,idade);
                    System.out.println(cadastro.listarContas());
                    break;
                case 2:
                    System.out.println("Digite o nome do titular da conta: ");
                    String s = ler.next();
                    if(cadastro.pesquisarConta(s)!=null) {
                        banco.menu(cadastro.pesquisarConta(s));
                    }else{
                        System.out.println("Conta não cadastrada!");
                        cadastro.listarContas();
                    }
                    break;


            }
        }while(opc != 0);
    }
}
