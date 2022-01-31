package com.Assem.Lap2;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayOperation2 {
    int []x;
    int numOfElements;
    public ArrayOperation2(){
        x = new int[5];
        numOfElements = 0;
    }
    public int delete(){
        if (numOfElements > 0){
            x[numOfElements - 1] = -1;
            numOfElements--;
            return 0;
        }
        return -1;
    }
    //insertion sort
    public int addSortedElement (int e){
        if (numOfElements < x.length){
            int i = numOfElements;
            while (i > 0 && e < x[i - 1]) {
                x [i] = x [i - 1];
                i--;
            }
            x [i] = e;
            numOfElements++;
            return 0;
        }
        return -1;
    }
    public int add (int e){
        if (numOfElements < x.length){
            x[numOfElements] = e;
            numOfElements++;
            return 0;
        }
        return -1;
    }

    public static void main(String[] args) {
        ArrayOperation2 test = new ArrayOperation2();
        Scanner in = new Scanner(System.in);
        System.out.println(" Input elements:");
        for (int i = 0; i < 7; i++) {
            if (test.add(in.nextInt()) == 0){
                System.out.println("Added successfully");
            }
            else{
                System.out.println("array is full");
            }
            System.out.println(Arrays.toString(test.x));

        }
        for (int i = 0; i < 7; i++) {
            if (test.delete() == 0) {
                System.out.println("Deleted successfully");
            }
            else{
                System.out.println("Array is empty");

            }
            System.out.println(Arrays.toString(test.x));
        }
    }

}
