package com.company;
import java.util.Arrays;
class into{
    public int add(int[] arr , int[] ptr,int start , int mid , int end )
    {
        int invcount = 0;
        int i = start;
        int j = mid;
int k = start;
        while((i<=mid-1) && (j<end))
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
        return invcount;
    }

    public int des(int[] arr,int[] ptr,int start, int end)
    {
 int invcount =0;
 int mid;
 if(start<end)
 {
     mid = (start+end)/2;
     invcount = des(arr,ptr,start,mid);
     invcount = invcount + des(arr,ptr,mid+1 , end);
     invcount = invcount + add(arr,ptr,start ,mid ,end);


 }

    return invcount;


    }
}
public class inversed_sort {

    public static void main(String[] args) {
        int arr[] = new int[] { 1, 20, 6, 4, 5 };
        int s = 0;
        int end = arr.length;
        int ptr[] = new int[end-1];
      into d1 = new into();
      int temp= d1.des(arr,ptr,s,end-1);
      System.out.println(temp);
    }
}
