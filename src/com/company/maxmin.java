package com.company;

public class maxmin {
    public static void main(String[] args) {
        int arr[] = { 3,6,12,67,110};
        int min = arr[0];
        int max = 0;
        int i;
        for(i=0;i<arr.length;i++)
        {
            if(arr[i]<=min)
            {
            }
            else if(arr[i]>max)
            {
                max = arr[i];
            }
        }
        System.out.println(min );
        System.out.println(max );

    }
}
