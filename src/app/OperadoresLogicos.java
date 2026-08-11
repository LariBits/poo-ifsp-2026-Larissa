package app;

public class OperadoresLogicos {
    public OperadoresLogicos() {
    }

    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        System.out.println("10 é maior que 5? " + (a > b));
        System.out.println("10 é menor que 5? " + (a < b));
        System.out.println("10 é maior ou igual a 5? " + (a >= b));
        System.out.println("5 é menor ou igual a 10? " + (b <= a));
        System.out.println("10 é igual a 5? " + (a == b));
    }
}
