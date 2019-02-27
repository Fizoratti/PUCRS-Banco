package br.pucrs.ep.es;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Sistema sistema = new Sistema();
	    System.out.println("1 - Registrar Cliente");
        System.out.println("2 - ");

        Scanner ler = new Scanner(System.in);
        int opc = ler.nextInt();
        switch(opc) {
            case 1:
                System.out.println("Digite seu nome: ");
                String nome = ler.next();
                System.out.println("Digite sua idade: ");
                int idade = ler.nextInt();
                //

                sistema.registrarCliente(new Cliente(nome, idade));

                System.out.println("Cliente registrado");
                System.out.println(sistema.listar());
                break;
        }
    }
}
