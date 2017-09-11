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

    }
}
