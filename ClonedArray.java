package com.Assem.Lap2;

import java.util.Arrays;
import java.util.Scanner;

public class ClonedArray {
    int x[];
    int backup[];
    public ClonedArray(){
        x = new int[5];
        backup = new int[5];
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ClonedArray u = new ClonedArray();
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter the element number " + (i+1) + " in the array:");
            u.x[i] = in.nextInt();
        }

        for (int i = 0; i < 5; i++) {
            u.backup[i]  = u.x[i];
        }
        System.out.println("Array has cloned successfully");
        System.out.println(Arrays.toString(u.x));
        System.out.println(Arrays.toString(u.backup));
    }


}
