package com.company;

public class sumy {
    public static void main(String[] args) {
        int a,b;
        a =5;
        b=5;
        System.out.println(multi(a,b));
    }
    static int multi(int a , int b)
    {
        if(b==1)
        {
            return a;
        }
        return a+multi(a,b-1);
    }
}
