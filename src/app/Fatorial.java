package app;

import java.util.Scanner;

public class Fatorial {
    public static void main (String [] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("=== Fatorial ===");
        System.out.println("Digite um numero: ");

        Integer valor = scan.nextInt();
        long resultado = valor;

        System.out.printf(valor + "! = 4");

        for(int i = valor - 1; i >= 1; i--){
            resultado *= i;

            System.out.printf(" * " + i);
        }

        System.out.printf(" = " + resultado);
    }
}
