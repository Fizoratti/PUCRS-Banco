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

            // Scanner ler = new Scanner(System.in);
            opc = ler.nextInt();


            switch (opc) {
                case 1:
                    System.out.println("Digite seu nome: ");
                    String nome = ler.next();
                    System.out.println("Digite sua idade: ");
                    int idade = ler.nextInt();


                    sistema.colocarClienteNaFila(new Cliente(nome, idade), cont);

                    System.out.println("Cliente registrado");
                    System.out.println(sistema.listar());
                    cont++;
                    break;
                case 2:
                    sistema.atenderClienteNormal();
                    //System.out.println("selecione o caixa:");
                    //int caixa = ler.nextInt();

            }
        }while(opc != 0);
    }
}
