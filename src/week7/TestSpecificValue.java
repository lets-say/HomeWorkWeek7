package week7;
//  Write a Java program to test if an array contains a specific value.
import java.util.Scanner;

public class TestSpecificValue {
    public void array() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter any value: ");
        int value[] = {1, 2, 3, 4, 5};
        int number=scanner.nextInt();

        for (int i = 0; i < value.length; i++) {
            if (number == value[i]) {
                System.out.println("Array contains the given value");
            }
            else{
                System.out.println("Array is not contains the given value");
            }


        }
    }

    public static void main(String[] args) {
        TestSpecificValue obj=new TestSpecificValue();
        obj.array();
    }
}
