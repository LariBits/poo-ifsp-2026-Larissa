package aula02;
import java.util.Scanner;

// Java Stdin and Stdout I

public class StdinStdout1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int valor1 = scan.nextInt();
        int valor2 = scan.nextInt();
        int valor3 = scan.nextInt();

        System.out.println("" + valor1);
        System.out.println("" + valor2);
        System.out.println("" + valor3);

    }
}
