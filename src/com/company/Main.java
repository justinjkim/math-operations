package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a number: ");
        String input1 = input.nextLine();

        System.out.printf("You have chosen %s. ", input1);

        System.out.println("Please enter a second number: ");
        String input2 = input.nextLine();
        System.out.printf("You have chosen %s.", input2);

        Double operand1 = Double.parseDouble(input1);
        Double operand2 = Double.parseDouble(input2);

        double sum = operand1 + operand2;
        double difference = operand1 - operand2;
        double division = operand1 / operand2;
        double multiplication = operand1 * operand2;
        double remainder = operand1 % operand2;

        showResults(sum, difference, division, multiplication, remainder);
    }  // end of public static void main

    // actual showResults method
    public static void showResults(double sum, double difference, double division, double multiplication, double remainder) {
        System.out.println("The sum is " + sum);
        System.out.println("The difference is " + difference);
        System.out.println("The quotient is " + division);
        System.out.println("The product is " + multiplication);
        System.out.println("The remainder is " + remainder);
    }
}
