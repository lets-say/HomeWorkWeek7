package week7;//Write a java program to input any number and find out if it’s odd or even

import java.util.Scanner;

public class OddOrEvenNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        if (number % 2 == 0)
            System.out.println(number + " is even");
        else {
            System.out.println(number + " is odd");
        }
    }
}