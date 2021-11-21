package com.company;

public class staircse {
    public static void main(String[] args) {
        int n = 4;

        System.out.println(stairs(n));

    }
     static int sum = 0;

    static int stairs(int n)
    {
        if(n<0)
        {
            return 0;
        }
        if(n==0)
        {
            return 1;
        }
       return (stairs(n-3)+stairs(n-2)+stairs(n-1));




    }
}
