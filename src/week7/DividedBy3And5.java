package week7;

/*
Write a java program to print the numbers between 1 to 100 which can be divided by 3
and 5 separately.

 */
public class DividedBy3And5 {
    public void divided() {

        System.out.println("Below number divided by 3: ");
        for (int i = 1; i < 100; i++)
            if (i % 3 == 0) {
                System.out.println(i + ", ");
            }

        System.out.println("Below number divided by 5: ");
        for (int i = 1; i < 100; i++) {
            if (i % 5 == 0)
                System.out.println(i + ", ");
        }

        System.out.println("Below number Divided by 3 & 5: ");
        for (int i = 1; i < 100; i++) {
            if (i % 3 == 0 && i % 5 == 0)
                System.out.print(i +", ");
        }

    }

    public static void main(String[] args) {
          DividedBy3And5 obj= new DividedBy3And5();
          obj.divided();
    }
    }
