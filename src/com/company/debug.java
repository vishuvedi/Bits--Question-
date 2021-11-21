package com.company;

public class debug {
    public static void main(String[] args) {
        int n = 7;
        int ans = fib(n);
        System.out.println(ans);
    }

    static int fib(int n)
    {
            if(n<2){
            return n;
        }
        return fib(n-1)+fib(n-2);
    }

}
