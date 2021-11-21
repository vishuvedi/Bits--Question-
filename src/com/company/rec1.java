package com.company;

public class rec1 {
    public  static void  recursion(int val)
    {
     if(val==0)
     {
         return;
     }
         else
     {
         System.out.println(val);
         recursion(val-1);
     }
    }
    public static void main(String[] args) {
        int a=5;
        recursion(a);
    }
}
