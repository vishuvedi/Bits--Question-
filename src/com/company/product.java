package com.company;

public class product {
    public static void main(String[] args) {
        int n = 6;
        System.out.println(show(n));

    }
    static int show(int m)
    {
        if(m==1)
        {
            return m;
        }

         return m * show(m-1);
    }
}
