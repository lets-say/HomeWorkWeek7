package week7;/*
Input any alphabet from “A" to “F” and print their city name accordingly (use switch statement) if
any other alphabet should be invalid entry
 */
import java.util.Scanner;

public class CityNameUseSwitchStatement {
    public void cityName() {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any alphabet starts with 'A TO F' : ");
        char city = scan.next().charAt(0);

        switch (city) {
            case 'A':
                System.out.println("Amersham");
                break;
            case 'B':
                System.out.println("Birmingham");
                break;
            case 'C':
                System.out.println("Cambridge");
                break;
            case 'D':
                System.out.println("Dorchester");
                break;
            case 'E':
                System.out.println("Ealing");
                break;
            case 'F':
                System.out.println("Farnbrough");
                break;

            default:
                System.out.print("Enter anyother Cityname is Invalid");

        }
    }

    public static void main(String[] args) {
        CityNameUseSwitchStatement obj= new CityNameUseSwitchStatement();
        obj.cityName();
    }
    }
