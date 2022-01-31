package com.Assem.Lap2;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
    int x[];
    int y[];
    public ReverseArray(){
        x = new int[5];
        y = new int[5];
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ReverseArray u = new ReverseArray();
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter the element number " + (i+1) + " in the array:");
            u.x[i] = in.nextInt();
        }
        System.out.println("Array before reverse:");
        System.out.println(Arrays.toString(u.x));
        int j = 4;
        for (int i = 0; i < 5; i++) {
            u.y[i]  = u.x[j];
            j--;
        }
        System.out.println("Array after reverse: ");
        System.out.println(Arrays.toString(u.y));
    }
}
