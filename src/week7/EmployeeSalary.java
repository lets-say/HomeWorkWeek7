package week7;/*
. WAP to input employee id, name, basic salary then find HRA, TA, DA, PF and Gross
salary
 HRA = basic salary 10%
 DA = Basic salary 8%
 TA = Basic salary 9%
 PF= Basic salary 20%
 Gross salary = basic salary + HRA + TA + DA –PF
Print in following format
_______________________________
| Salary Slip |
|______________________________|
| Employee Id : 2564 |
| Employee Name : Jay |
|______________________________|
| Basic Salary : 25000.0 |
| HRA 10% : 2500.0 |
| TA 8% : 2250.0 |
| DA 9% : 2000.0 |
| PF - 20& : 5000.0 |
|______________________________|
| Gross Salary : 26750.0 |
|===========================|
 */


import java.util.Scanner;

public class EmployeeSalary {

    public static void main(String[] args) {
        long EmployeeID;
        String EmployeeName;
        float BasicSalary;
        float HRA, TA, DA, PF;

        System.out.println("__________________________________");
        System.out.println("|        Salary Slip             |");
        System.out.println("|________________________________|");
        Scanner scan = new Scanner(System.in);
        System.out.println("| Employee_Id :                  |");
        EmployeeID = scan.nextLong();
        System.out.println("| Employee_Name :                |");
        EmployeeName = scan.next();
        System.out.println("|________________________________|");
        System.out.println("| Basic_Salary :                 |");
        BasicSalary = scan.nextFloat();
        System.out.println("| HRA 10% :                      |");

        HRA = (BasicSalary*10/100);
        System.out.println(HRA);
        System.out.println("| TA 8% :                        |");
        TA = (BasicSalary*8 / 100);
        System.out.println(TA);

        System.out.println("| DA 9% :                        |");
        DA = (BasicSalary*9 / 100);
        System.out.println(DA);

        System.out.println("| PF -20& :                      |");
        PF = (BasicSalary*-20 / 100);
        System.out.println(PF);
        System.out.println("|________________________________|");
        System.out.println("| Gross_Salary :                 |");
        float Gross_Salary = (BasicSalary + HRA + TA + DA - (-PF));
        System.out.println(Gross_Salary);

        System.out.println("|================================|");
    }

}
