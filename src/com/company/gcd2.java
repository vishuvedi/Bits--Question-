package com.company;

public class gcd2 {
    public static void main(String[] args) {
        int a,b;
        a = 14;
        b= 10;
        System.out.println(gcd(a,b));
    }

    static int gcd(int m , int n)
    {
        if(m%n==0)
        {

            return n ;
        }

       return gcd(n,m%n);
    }

}
