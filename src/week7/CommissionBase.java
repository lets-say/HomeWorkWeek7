package week7;
/*
Write a java program input sales id, seller's name, sales amount, and salary basic and
then fined this sales
Commission
 Sales amount >= 50,000 35%
 Sales amount >= 30,000 20%
>= 20,000 10%
>= 10,000 5%
< 10,000 2%
 */
import java.util.Scanner;

public class CommissionBase {
    public static void main(String[] args) {
      String name;
        int Id, Saleamount, salary;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter sale id : ");
        int id = scanner.nextInt();
        System.out.println("Please enter Name : ");
         name = scanner.next();
        System.out.println("Please enter sale amount : ");
        int saleamount = scanner.nextInt();
        System.out.println("Please enter salary : ");
         salary = scanner.nextInt();
        if (saleamount >= 50000) {
            System.out.println(saleamount * 35/100);

        }else if(saleamount>=30000 && saleamount<50000){
            System.out.println(saleamount * 20/100);
        }else if(saleamount>= 20000 && saleamount < 30000){
            System.out.println(saleamount *10/100);
        }else if(saleamount>=10000 && saleamount < 30000){
            System.out.println(saleamount *5/100);
        }else{
            System.out.println(saleamount *2/100);
        }
    }


}
