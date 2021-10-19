package week7;//Write a java program that tells us that Input number is odd or even?
// HINT: use ternary operator (? :)

import java.util.Scanner;

public class TernaryOperator {  // this is class
       // main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter number:  ");
        int number = scanner.nextInt();
        String evenodd = (number % 2 == 0)? "even" : "odd";
        System.out.println(number + " is " + evenodd);
    }


}
