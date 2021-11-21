package com.company;

public class morder {
    public static void main(String[] args) {
        int arr[] = {0,2,1,0,1,0};
        int i;
        int zero=0;
        int one=0;
        int two=0;
        for(i=0;i<arr.length;i++)
        {
            if(arr[i]==0)
            {
                zero++;
            }
            else if(arr[i]==1)
            {
                one++;
            }
            else if(arr[i]==2)
            {
                two++;
            }

        }
        int value =0;
        for(i=value;i<=zero;i++)
        {
            arr[i]=0;
           value=i;

        }
        for(i=value;i<=one;i++)
        {
            arr[i]=1;
            value=i;
        }
        for(i=value;i<two;i++)
        {
            arr[i]=2;
            value=i;
        }
        for(i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }
}
