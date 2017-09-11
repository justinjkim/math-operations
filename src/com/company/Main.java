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
        System.out.println(sum);

        double difference = operand1 - operand2;
        System.out.println(difference);

        double division = operand1 / operand2;
        System.out.println(division);

        double multiplication = operand1 * operand2;
        System.out.println(multiplication);

        double remainder = operand1 % operand2;
        System.out.println(remainder);

    }
}
