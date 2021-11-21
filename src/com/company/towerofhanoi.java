package com.company;

public class towerofhanoi {
    public static void main(String[] args) {
        int n = 4;
        char src = 'A';
        char helper = 'B';
        char des = 'C';

        toh(n,src,helper,des);
    }

    static void toh(int n , char s , char h , char d)
    {
        if(n<1)
        {
            return;
        }
         toh(n-1,s,d,h);
         System.out.println(s+ " ---> " +d);
         toh(n-1,h,d,s);
    }
}
