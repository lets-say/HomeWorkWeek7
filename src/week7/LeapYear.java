package week7;/*
Write a java program to input any year like (ex.2007) and find out if it is leap year or
 not?
 */

import java.util.Scanner;

public class LeapYear {   // this is class
    // main method
    public static void main(String[] args) {
        int year;
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter any Year : :");
         year = scanner.nextInt();
        if(((year % 4 == 0 ) && (year % 100!=0)) || (year%400 == 0)){
            System.out.println("This is a leap year");

        }else{
            System.out.println("This is not a leap year ");

        }


    }
}
