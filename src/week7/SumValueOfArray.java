package week7;//  Write a Java program to sum values of an array.

public class SumValueOfArray {
    public static void main(String[] args)
    {
        int a[] = {10,30,35,25,50};
        int  sum =0;

        for(int i : a)
        {
            sum=sum+i;
        }
        System.out.println("sum of array value is:"+sum);



    }
}
