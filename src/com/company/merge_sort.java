package com.company;
class sort

{
    public  void merge(int arr[], int s , int e)
    {
 int i = s;
 int[] temp = new int[arr.length+2];
 int num=0;
 int mid = (s+e)/2;
 int j = mid+1;
 while(i<=mid &&j<=e)
 {
     if(arr[i]>arr[j])
     {
temp[num]=arr[i];
i++;
num++;
     }
     else
     {
         temp[num]=arr[j];
         num++;
         j++;

     }
 }
 while(i<=mid)
 {
     temp[num]=arr[i];
     i++;
     num++; }
 while(j<=e)
 {
     temp[num]=arr[j];
     j++;
     num++;
 }

 int k =0;
 for(k=0;k<arr.length;k++)
 {
   //System.out.println(temp[k]);
 }

    }

    public void divide(int arr[],int s , int e)
    {
        if(s>=e)
        {
            return;
        }
        else {
            int mid = (s + e) / 2;
            divide(arr, s, mid);
            divide(arr, mid + 1, e);
            merge(arr, s, e);
        }

    }
}

public class merge_sort {
    public static void main(String[] args) {

        int[] arr = {2,3,5,1,0};
        sort s1 = new sort();
        s1.divide(arr,0, arr.length-1);

int i;
for(i=0;i<arr.length;i++)
{
    //System.out.println(arr[i]);
}
    }
}
