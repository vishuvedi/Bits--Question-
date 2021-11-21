package com.company;
import java.util.Scanner;
public class select_array {
    public static void main(String[] args) {
       int[] arr ={5,4,2,1,89,78};
       int i,j;
    int min;

       int temp;
       for(i=0;i<arr.length-1;i++)
       {min = i;
           for(j=i+1;j<arr.length;j++)
           {
               if(arr[min]>arr[j])
               {
                   min = j;


               }

           }
           temp = arr[i];
        arr[i]=arr[min];
       arr[min]=temp;


       }


       for(i=0;i<arr.length;i++)
       {
           System.out.println(arr[i]);
       }

    }
}
