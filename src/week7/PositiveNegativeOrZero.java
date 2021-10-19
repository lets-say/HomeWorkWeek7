package week7;
// Write the java program to check if enter number is “POSITIVE”, “NEGATIVE” or "ZERO"

import java.util.Scanner;

public class PositiveNegativeOrZero {
    public void number() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter number: ");
        int tve = scan.nextInt();

        if (tve > 0) {
            System.out.println("This is positive number");
        } else if (tve < 0)
        {
            System.out.println("This is negative number");
        }
        else if (tve==0)
        {
            System.out.println("This is zero number");
        }
        else
        {
            System.out.println("number is invalid");
        }

    }

    public static void main(String[] args) {
        PositiveNegativeOrZero obj=new PositiveNegativeOrZero();
        obj.number();
    }

}

