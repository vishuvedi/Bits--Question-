package com.company;
import java.util.Scanner;
import java.util.Arrays;
class band{
   private int arr[] = new int[20];
   public void ar2(int a1[])
   {

     Arrays.sort(a1);
     int count=1;
     int m=0;
     int i=0;
     for(i=0;i< a1.length-1;i++)
     {
         if(a1[i+1]-a1[i]==1)
         {
             count++;

         }
         else
         {
             arr[m]=count;
             count=1;
             m++;

         }

     }
       int max;
       max =0;

     for(i=0;i< arr.length;i++)
     {

         if(max<arr[i])
         {
             max=arr[i];

         }
     }
     System.out.println(max);
   }
}
public class largest_band {
    public static void main(String[] args) {
int arr[]={1,9,3,0,18,5,2,4,10,7,12,6};//0,1,2,3,4,5,6,7,9,10,18
band b1 = new band();
b1.ar2(arr);




    }
}
