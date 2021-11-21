package com.company;

public class ro {
    public static void main(String[] args) {

       int n = 7;
       System.out.println(sum(n));

    }

    static int m = 0;

    static int sum(int n)
    {
        if(n==0)
        {
            return m;
        }
        return m = m+sum(n-1);
    }
}
