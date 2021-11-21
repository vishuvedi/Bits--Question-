package com.company;
import java.util.Arrays;
class indto{
    public int add(int[] arr , int[] ptr,int start , int mid , int end )
    {
        int invcount = 0;
        int i = start;
        int j = mid;
        int k = start;
        while((i<=mid-1) && (j<=end))
        {
            if(arr[i]<=arr[j])
            {
                ptr[k++] = arr[i++];

            }
            else
            { ptr[k++] = arr[j++];
                invcount = invcount + (mid-i);
            }
        }
        while(i<=mid-1)
        {
            ptr[k++]=arr[i++];

        }
        while(j<=end)
        {
            ptr[k++]=arr[j++];

        }
        for(i=start;i<=end;i++)
        {
           arr[i]=ptr[i];
        }

        return invcount;
    }

    public int des(int[] arr,int[] ptr,int start, int end)
    {
        int invcount =0;
        int mid;
        if(end>start)
        {
            mid = (start+end)/2;
            invcount = des(arr,ptr,start,mid);
            invcount = invcount + des(arr,ptr,mid+1 , end);
            invcount = invcount + add(arr,ptr,start ,mid+1 ,end);

        }

        return invcount;


    }
}
public class inversed_c {

    public static void main(String[] args) {
        int arr[] = new int[] {0,5,2,3,1};
        int s = 0;
        int end = arr.length;
        int ptr[] = new int[end];
        indto d1 = new indto();
        int temp= d1.des(arr,ptr,s,end-1);
        System.out.println(temp);
        int i;
        for(i=0;i<ptr.length;i++)
        {
            System.out.println(ptr[i]);
        }
    }
}
