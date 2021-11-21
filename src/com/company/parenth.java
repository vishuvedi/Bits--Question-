package com.company;

public class parenth {
    public static void main(String[] args) {
        int n = 5;
        int len = n*2;
        char[] arr = new char[len];
        int i;
        arr[0]='(';
        arr[len-1]=')';
        found(arr,len,n,1);
        for (int j = 0; j < arr.length ; j++) {
            System.out.println(arr[j]);
        }
    }

    static int a = 1;
    static int b = 1;
    static void found(char[] arr , int len , int n ,int i )
    {
        if(len<2) {
            return;
        }

        if(a<n)
        {
            arr[i]='(';
            i++;
            a++;
             found(arr,len,n,i);
        }

        else {
            arr[i]=')';
            i++;
            b++;
            found(arr,len,n,i);
        }


    }

}
