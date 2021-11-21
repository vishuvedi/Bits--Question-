package com.company;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Vector;
class root{
    public int sqr(int[] arr ,int s , int e , int find)
    {int num =0;
        while(s<=e)
        {
            int mid = (s+e)/2;
            if(arr[mid]*arr[mid]>find)
            {
             e=mid-1;
             num = e;
            }
            else {
                s=mid+1;
            }
        }
        return arr[num];
    }

}
public class square {
    public static void main(String[] args) {
        int data;
        Scanner sc = new Scanner(System.in);
        int value;
        value = sc.nextInt();
        int[] arr = new int[value];
        int i;
        for(i=0;i<value;i++)
        {
            arr[i]=i;
        }
        root o1 = new root();
        int start = 0;
        int end = arr.length-1;
        int find = value;
         int num = o1.sqr(arr,start,end,find);
System.out.println(num);
float inc =0.1f;
float point = num+inc;
for(i=0;i<3;i++)
{
 while(point*point<find)
    {
        point =point+inc;
    }

    inc=inc/10.0f;
}
System.out.println(point);

}

    }

