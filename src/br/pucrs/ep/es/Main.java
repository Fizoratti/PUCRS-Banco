package br.pucrs.ep.es;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Sistema sistema = new Sistema();
        int cont = 0;
        Scanner ler = new Scanner(System.in);
        int opc;
        do {
            System.out.println("1 - Registrar Cliente");
            System.out.println("2 - Escolher caixa");
            System.out.print("Digite sua opção: ");

            // Scanner ler = new Scanner(System.in);
            opc = ler.nextInt();


            switch (opc) {
                case 1:
                    System.out.println("Digite seu nome: ");
                    String nome = ler.next();
                    System.out.println("Digite sua idade: ");
                    int idade = ler.nextInt();


                    sistema.colocarClienteNaFila(new Cliente(nome, idade));

                    System.out.println("Cliente registrado");
                    System.out.println(sistema.listar());
                    cont++;
                    break;
                case 2:
                    System.out.println("Caixa 1, Caixa 2, Caixa 3, Caixa 4, Caixa 5, Caixa 6");

                    System.out.print("Escolha o caixa para o atendimento: ");

                   int caixa = ler.nextInt();


                    switch (caixa) {
                        case 1:
                            sistema.removerClientePrioritario();
                            break;
                        case 2:
                            sistema.removerClientePrioritario();
                            break;
                        case 3:
                            sistema.removerClientePrioritario();
                            break;
                        case 4:
                            sistema.removerClientePrioritario();
                            break;
                        case 5:
                            sistema.removerClientePrioritario();
                            break;
                        case 6:
                            sistema.removerCliente();
                            break;
                    }

            }
        }while(opc != 0);
    }
}
