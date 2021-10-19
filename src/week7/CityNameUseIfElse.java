package week7;/*
Input any alphabet from “A" to “F” and print their city name accordingly (use if else) if
any other alphabet should be invalid entry
 */

import java.util.Scanner;

public class CityNameUseIfElse {

    public void AtoF() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter any alphabet from 'A To F' : ");
        char ch = scanner.next().charAt(0);
        if (ch == 'A') {
            System.out.println("Amersham");
        } else if (ch == 'B') {
            System.out.println("Birmingham");
        } else if (ch == 'C') {
            System.out.println("Cambridge");
        } else if (ch == 'D') {
            System.out.println("Dorchester");
        } else if (ch == 'E') {
            System.out.println("Ealing");
        } else if (ch == 'F') {
            System.out.println("Farnborough");
        } else {
            System.out.println("Enter any other alphabet should be invalid ");
        }
    }


    public static void main(String[] args) {
            CityNameUseIfElse city = new CityNameUseIfElse();
            city.AtoF();
    }
}