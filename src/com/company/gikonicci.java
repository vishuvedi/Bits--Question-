package com.company;
import java.util.*;
import java.lang.*;
import java.io.*;

class gikonicci {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int test;
        test = sc.nextInt();
        int n;
        int a =1 ;
        int b = 3;
        int c = 2;
int index = 3;
        int i;
        for(i=0;i<test;i++)
        {

            n = sc.nextInt();
            find(a,b,c,n-index);
            System.out.println(sum);
        }

    }

    static int sum = 0;

    static void find(int a, int b ,int c , int n)
    {
        if(n==0)
        {
            return;
        }

        sum = a+b+c;
        a=b;
        b=c;
        c=sum;
        find(a,b,c,n-1);

    }


}