package br.pucrs.ep.es;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        CadastroContas cadastro = new CadastroContas();
        Banco banco = new Banco(cadastro);
        Sistema sistema = new Sistema(cadastro,banco);



        Scanner ler = new Scanner(System.in);
        int opc;


        do {
            System.out.println("1 - Registrar Cliente");
            System.out.println("2 - Remover Cliente");
            System.out.println("3 - Atender Cliente direto");
            System.out.println("4 - enviar cliente para fila");
            System.out.println("5 - escolher caixa para o atendimento");
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
                    System.out.println("Digite nome do cliente: ");
                    String nomeCliente = ler.next();
                    cadastro.removerConta(nomeCliente);
                    break;
                case 3:
                    System.out.println("Digite o nome do titular da conta: ");
                    String s = ler.next();
                    if(cadastro.pesquisarConta(s)!=null) {
                        banco.menu(cadastro.pesquisarConta(s));
                    }else{
                        System.out.println("Conta não cadastrada!");
                        cadastro.listarContas();
                    }
                    break;
                case 4:
                    System.out.println("Digite o nome do cliente: ");
                    String cliente = ler.next();
                    sistema.colocarClienteNaFila(cliente);
                    break;
                case 5:
                    System.out.println("Escolha o caixa para o atendimento de 1 a 6 :");
                    int escolhaCaixa = ler.nextInt();
                    sistema.atenderClienteDaFilal(escolhaCaixa);
                    break;
            }
        }while(opc != 0);
    }
}
