package com.company;
import java.lang.Math;
public class subset {
    public static void main(String[] args) {
    int[] arr = {10,12,15,4,1,6};
    int value = 16;
    int a = arr.length;
    subset(arr,a,value);
    }

    static int count = 0;
    static int value = 0;
    static int i = 0;

    static void subset(int arr[] , int n,int val)
    {
        if(value==n)
        {
            System.out.println(count);
            return;
        }


        int j = i+1;
        while(j<n) {
            if (arr[i] + arr[j] == val) {
                count++;

            }
            j++;
        }
        i++;
        value++;
        subset(arr,n,val);


    }

}
