
/*
 * Write a java program to input student Name, roll No, and three subjects Math, Science and
 * English marks (marks is between 0 to 100 and if it is out of range print error message “Invalid
 * Input, Marks should between 0 to 100”) and find out total, percentage and result.
 * If he is pass or fail on basis of percentage (pass>=35) and also give them grade if %> = 80 A+,
 * %> = 60 A, %> = 50 B, %> = 35 C And print Mark Sheet in following format
 * _______________________________
 * | |
 * | Mark Sheet |
 * |_______________________________|
 * | Name : Jay |
 * | Roll No: 08 |
 * |_______________________________|
 * | Subjects : Marks |
 * |_______________________________|
 * | Math : 98 |
 * | Science : 90 |
 * | English : 85 |
 * |_______________________________|
 * | Total : 273 |
 * |_______________________________|
 * | Percentage : 91.0 |
 * | Result : Pass |
 * | Grade : A+ |
 * |_______________________________

 */
package week7;

import java.util.Scanner;

public class PrintMarkSheet {
    public void mark() {
        int Math, Science, English;
        int marks = 100;
        float Percentage, Total;
        //   boolean Result;
        // char Grade;

        System.out.println(" -----------------------------------");
        System.out.println("|                                   |");
        System.out.println("| Mark Sheet                        |");
        System.out.println("|___________________________________|");
        Scanner scan = new Scanner(System.in);
        System.out.println("|Enter your Name:                   |");
        String name = scan.next();
        System.out.println("|Enter your Roll No:                |");
        int RollNo = scan.nextInt();
        System.out.println("|___________________________________|");
        System.out.println("| Subjects : Mark                   |");
        System.out.println("|___________________________________|");
        System.out.println("|Enter mark of Math :               |");
        Math = scan.nextInt();
        System.out.println("|Enter mark of Science :            |");
        Science = scan.nextInt();
        System.out.println("|Enter mark of  English :           |");
        English = scan.nextInt();
        System.out.println("|___________________________________|");
        System.out.println("|Enter your Total :                 |");
        Total = Math + Science + English;
        System.out.println(Total);
        System.out.println("|___________________________________|");
        System.out.println("| Percentage :                      |");
        Percentage = Total / 3;
        System.out.println(Percentage);
        System.out.println("| Result :                          |");

        if (Math > 100 || Science > 100 || English > 100 || Math < 0 || English < 0 || Science < 0) {
            System.out.println(" invalid input");
        } else if(Math<35||Science<35||English<35){
            System.out.println("Fail");
        }else {
            if (Percentage < 35) {
                System.out.println("Fail");
            } else if (Percentage > 35) {
                System.out.println("Pass");

                System.out.println("| Grade :                           |");
                if (Percentage >= 80) {
                    System.out.println(" A+ ");
                } else if (Percentage >= 60) {
                    System.out.println(" A ");
                } else if (Percentage >= 50) {
                    System.out.println(" B ");
                } else if (Percentage >= 35) {
                    System.out.println(" C ");
                }

                System.out.println("|___________________________________|");
            }

        }



    }

    public static void main(String[] args) {
        PrintMarkSheet obj = new PrintMarkSheet();
        obj.mark();
    }
}







