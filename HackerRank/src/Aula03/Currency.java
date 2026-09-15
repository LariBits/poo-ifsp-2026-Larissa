package Aula03;

import java.util.*;
import java.text.*;

public class Currency {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        Locale indiaLocale = new Locale("en", "IN");

        NumberFormat usFormatter = NumberFormat.getCurrencyInstance(Locale.US);
        String us = usFormatter.format(payment);

        NumberFormat chinaFormatter = NumberFormat.getCurrencyInstance(Locale.CHINA);
        String china = chinaFormatter.format(payment);

        NumberFormat franceFormatter = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        String france = franceFormatter.format(payment);

        NumberFormat indiaFormatter = NumberFormat.getCurrencyInstance(indiaLocale);
        String india = indiaFormatter.format(payment);

        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}
