package com.company;

public class facts {
    public static void main(String[] args) {
        int n = 5;
        int sum = 0;
        for (int i = 5; i > 0; i--)
        {
            sum =sum + fact(n)/(fact(i)*fact(n-i));
        }
System.out.println(sum);

    }
    static int fact(int n)
    {
       if(n<1)
       {
           return 1;
       }
       else
       {
           return n*fact(n-1);
       }
    }
}
