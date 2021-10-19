package week7;/*
Write a program that tells us input value is number or an alphabet or symbol.
 */
import java.util.Scanner;

public class NumberAlphabetOrSymbol {

    public void input(){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Please enter any character,number,symbol : ");
        char ch=scanner.next().charAt(0);
        if(ch >= '0' && ch<= '9'){
            System.out.println("This is value ");
        }else if((ch >= 'a' && ch <= 'z')) {
            System.out.println("This is alphabet ");
        }else{
            System.out.println("This is symbol");
        }

    }

    public static void main(String[] args) {
        NumberAlphabetOrSymbol obj=new NumberAlphabetOrSymbol();
        obj.input();
    }


















}
