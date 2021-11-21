package com.company;

public class insertion_sort {
    public static void main(String[] args) {
        int[] arr = {2,5,6,1,3,9,0};
        int i,j;

        int index ;
        int key;
        int temp;
        for(i=0;i<arr.length-1;i++)
        {
           key = i+1;
             int n =0;
             while(n!=key)
             {
                 if(arr[key]<arr[n]){
                     temp = arr[n];
                     arr[n]= arr[key];
                     arr[key]=temp;
                 }
                 n++;
             }
        }
        for(i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }
}
