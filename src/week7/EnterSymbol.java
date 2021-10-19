package week7;/*
Write a java program to input any two number and ask user to enter their symbol (+, -,
/, *) find addition, Subtraction, multiplication and division according to their symbol
(using if else)

 */
import java.util.Scanner;

public class EnterSymbol {
    int a,b;
    char ch;
    public void method(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any value of A :  ");
        a= scanner.nextInt();
        System.out.println("Enter any value of B :  ");
        b= scanner.nextInt();
        System.out.println("Enter the Symbol (+, -, *, /) : ");
        char ch= scanner.next().charAt(0);
        if (ch == '+'){
            System.out.println(a+b);
        }else if (ch == '-'){
            System.out.println(a-b);
        }else if(ch == '*'){
            System.out.println(a*b);
        }else if(ch == '/'){
            System.out.println(a/b);
        }else{
            System.out.println();
        }


    }

    public static void main(String[] args) {
        EnterSymbol obj=new EnterSymbol();
        obj.method();
    }
}
