package com.company;
class setrer{
    public int b2(int[] arr , int search)
    {
       int s =0;
       int e = arr.length-1;
       while(s<=e)
       { int mid =(s+e)/2;
           if(arr[mid]==search)
           {
               return mid;
           }
           else if(arr[mid]<search)
           {
               s=mid+1;
           }
           else
           {
               e=mid-1;
           }
       }
       return 0;
    }
}
public class binary {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5,6,7,8};
        int search = 6;
        setrer o1 = new setrer();
        int value = o1.b2(arr,search);
        System.out.println(value);


    }
}
