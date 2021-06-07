/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Gracie Bliss
 */
import java.util.*;
public class apps {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int nums[]=new int[3];

        System.out.print("Enter the first number: ");
        nums[0]=in.nextInt();

        System.out.print("Enter the second number: ");
        nums[1]=in.nextInt();

        System.out.print("Enter the third number: ");
        nums[2]=in.nextInt();

        int biggest=0;
        for(int i=0; i<3; i++){
            if(nums[i]>biggest)
                biggest=nums[i];
        }

        System.out.print("The largest number is "+biggest+".");
    }
}
