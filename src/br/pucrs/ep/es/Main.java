package br.pucrs.ep.es;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Sistema sistema = new Sistema();

        Scanner ler = new Scanner(System.in);
        int opc;
        int dos;
        double retirada, deposito;

        do {
            System.out.println("1 - Registrar Cliente");
            System.out.println("2 - Escolher caixa");
            System.out.println("3 - Listar todos clientes já atendidos");
            System.out.println("0 - sair");
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


                    break;
                case 2:
                    System.out.println("Caixa 1, Caixa 2, Caixa 3, Caixa 4, Caixa 5, Caixa 6");

                    System.out.print("Escolha o caixa para o atendimento: ");

                   int caixa = ler.nextInt();

                    if(caixa > 0 && caixa <7 ) {
                        switch (caixa) {
                            case 6:
                                System.out.println("1 - Depositar");
                                System.out.println("2 - Sacar");
                                System.out.print("Digite sua opção: ");
                                dos = ler.nextInt();
                                switch (dos) {
                                    case 1:
                                        System.out.println("Digite o valor: ");
                                        deposito = ler.nextDouble();
                                        sistema.pegarCliente().getConta().depositar(deposito);
                                        break;
                                    case 2:
                                        System.out.println("Digite o valor: ");
                                        retirada = ler.nextDouble();
                                        sistema.pegarCliente().getConta().retirada(retirada);
                                        break;
                                }
                                sistema.removerCliente();
                                break;
                            default:
                                System.out.println("1 - Depositar");
                                System.out.println("2 - Sacar");
                                System.out.print("Digite sua opção: ");
                                dos = ler.nextInt();
                                 switch (dos) {
                                     case 1:
                                         System.out.println("Digite o valor: ");
                                         deposito = ler.nextDouble();
                                         sistema.pegarCliente().getConta().depositar(deposito);
                                         break;
                                     case 2:
                                         System.out.println("Digite o valor: ");
                                         retirada = ler.nextDouble();
                                         sistema.pegarCliente().getConta().retirada(retirada);
                                         break;



                                 }
                                sistema.removerClientePrioritario();
                                 break;
                                }



                    }else{
                        System.out.println("Caixa invalido");
                    }
                    break;

                case 3:
                    sistema.listar();
                    break;
            }
        }while(opc != 0);
    }
}
