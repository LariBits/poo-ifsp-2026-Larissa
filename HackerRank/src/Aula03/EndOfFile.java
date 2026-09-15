package Aula03;

import java.util.Scanner;

public class EndOfFile {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int contador = 1;

        while(scanner.hasNext()){

            String linha = scanner.nextLine();
            System.out.println(contador + " " + linha);
            contador ++;
        }

    }
}
