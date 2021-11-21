package com.company;
public class binary_searh {
    public static  int binary(int[] arr, int start ,int end ,int value)
    {
        int mid = (start+end)/2;
while(start<=end)
{

    if(arr[mid]==value)
    {
        return mid;
    }
else if(arr[mid]>value)
    {
        start=mid+1;
    }
else
    {
        end = mid-1;
    }
mid = (start+end)/2;
}
return -1;
    }
    public static int sum(int a , int b)
    {
        if(b==8)
        {
            int c = a+b;
            return c;
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] arr = new int[] {1,2,3,4,5,6};
        int search = 4;
        int s = 0;
        int e = 5;
     int value = binary(arr,s,e,search);
        System.out.println(value);
    }
}
