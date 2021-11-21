package com.company;

public class reverse {
    public static void main(String[] args) {
        int n = 678991;
        reverse(n);
        System.out.println(sum);
    }

    static int sum = 0;
    static void  reverse(int n)
    {
        int m;
      if(n==0)
      {
          return ;
      }
      int rem = n%10;
      sum = sum*10 + rem;
      reverse(n/10);


    }
}
