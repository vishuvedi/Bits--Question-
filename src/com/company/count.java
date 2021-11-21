package com.company;

public class count {
    public static void main(String[] args) {
        int m = 302049;
        count(m);
        System.out.println(value);
    }

    static int value = 0;
    static void count(int m)
    {
        if(m==0)
        {
            return;
        }

        if(m%10==0)
        {
            value++;

        }
        count(m/10);



    }

}
