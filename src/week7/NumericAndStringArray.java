package week7;/*
Write a Java program to sort a numeric array and a string array.
 */

import java.util.Arrays;


public class NumericAndStringArray {
    public static void main(String[] args)
    {
        int[] num = {22,20,10,2,50,100,60,25,35,};
        System.out.println("This is original numeric array : ");
        for (int i:num)
        {
            System.out.println(i + " ");
        }
        System.out.println("This is sorted numeric array: ");
        Arrays.sort(num);
        System.out.println(Arrays.toString(num));

        String[] name ={"London","Birmingham","Manchester","Cambridge","Derby"};
        System.out.println("This is orginal string array : ");
        for(String i:name)         //for each loop to print array elements
        {
            System.out.println(i + " ");
        }
        System.out.println("This is sorted string array: ");
        Arrays.sort(name);
        System.out.println(Arrays.toString(name));
    }
}
