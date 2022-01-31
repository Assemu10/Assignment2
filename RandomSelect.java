package com.Assem.Lap2;

import java.util.Arrays;
import java.util.Scanner;

public class RandomSelect {
    int x[];
    int numOfElements;
    public RandomSelect(){
        x = new int[5];
    }
    public int delete(){
        if (numOfElements >= 0){
            if (numOfElements == 4){
                x[3] = 0;
            }
            else if(numOfElements == 3){
                x[4] = 0;
            }
            else if(numOfElements == 2){
                x[0] = 0;
            }
            else if(numOfElements == 1){
                x[2] = 0;
            }
            else if(numOfElements == 0){
                x[1] = 0;
            }
            numOfElements--;
            return 0;
        }
        return -1;
    }

    public int add (int e){
        if (numOfElements < x.length){
            if (numOfElements == 0){
                x[3] = e;
            }
            else if(numOfElements == 1){
                x[4] = e;
            }
            else if(numOfElements == 2){
                x[0] = e;
            }
            else if(numOfElements == 3){
                x[2] = e;
            }
            else if(numOfElements == 4){
                x[1] = e;
            }
            numOfElements++;
            return 0;
        }
        return -1;
    }
    public static void main(String[] args) {
        RandomSelect u = new RandomSelect();
        Scanner in = new Scanner(System.in);
        System.out.println(" Input elements:");
        for (int i = 0; i < 7; i++) {
            if (u.add(in.nextInt()) == 0){
                System.out.println("Added successfully");
            }
            else{
                System.out.println("array is full");
            }
            System.out.println(Arrays.toString(u.x));

        }
        for (int i = 0; i < 7; i++) {
            if (u.delete() == 0) {
                System.out.println("Deleted successfully");
            }
            else{
                System.out.println("Array is empty");

            }
            System.out.println(Arrays.toString(u.x));
        }
    }
}
