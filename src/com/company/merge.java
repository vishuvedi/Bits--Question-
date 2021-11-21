package com.company;

import java.sql.Array;

class sorted{
    public void sortedd(int[] arr , int s, int e,int mid)
    {

       int  n1 =  mid-s+1;
       int n2 = e-mid;
       int[] l =  new int[n1];
       int[] r = new int[n2];
       int i;
       int j = s;

       for(i=0;i<n1;i++)
       {
           l[i]=arr[s+i];
           j++;
       }
       for(i=0;i<n2;i++)
       {
           r[i]=arr[mid+1+i];
           j++;       }
       i =0;
       j=0;
       int k=0;
       while(i<n1 && j<n2)
       {
           if(l[i]<r[j])
           {
               arr[k]=l[i];
               i++;
               k++;
           }
           else
           {
               arr[k]=r[j];
               j++;
               k++;
           }

       }
        i=0;
        j=0;
        k = s;
     while(i<n1)
     {
         arr[k]=l[i];
         k++;
         i++;
     }
        while(j<n2){
            arr[k]=r[j];
            k++; j++;
        }
//        for(i=0;i<n2;i++)
//        {
//            System.out.println(r[i]);
//        }

    }
    public void merged(int[] arr,int s,int e)
    {
        if(s<e)
{
    int mid = (s+e)/2;
    merged(arr,s,mid);
    merged(arr,mid+1,e);
    sortedd(arr,s ,e,mid);
}
        else
        {
            return;
        }


    }

}
public class merge {
    public static void main(String[] args) {
        int[] arr = {4,6,7,0,9,1};
        int s = 0;
        int e = arr.length-1;
        sorted s1 = new sorted();
        s1.merged(arr,s,e);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
