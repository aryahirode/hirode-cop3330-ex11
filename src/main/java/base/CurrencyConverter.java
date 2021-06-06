/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Arya Hirode
 */

package base;

import java.util.Scanner;

public class CurrencyConverter {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        CurrencyConverter myApp = new CurrencyConverter();
        myApp.output();
    }

    private int euroPrompt() {
        System.out.print("How many euros are you exchanging? ");
        return Integer.parseInt(in.nextLine());
    }

    private double ratePrompt() {
        System.out.print("What is the exchange rate? ");
        return Double.parseDouble(in.nextLine());
    }

    private void output() {
        int euros = euroPrompt();
        double rate = ratePrompt();
        double dollars = euros * rate;
        System.out.printf("%d euros at an exchange rate of %.4f is\n%.2f U.S. dollars.", euros, rate, dollars);
    }
}
