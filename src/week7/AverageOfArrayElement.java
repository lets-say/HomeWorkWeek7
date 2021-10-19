package week7;/*
       Write a Java program to calculate the average value of array elements.
 */

public class AverageOfArrayElement {
    public static void main(String[] args) {
        int[] array = new int[]{10,20,30,40};
        int sum =0;   // sum of array element
        for(int i=0; i< array.length; i++){
            sum=sum + array[i];
            double average =  sum/ array.length; //average value
            System.out.println("Average value of array element is : "+ average);
        }


    }

}
