package com.company;
import java.lang.Math;
public class powers {
    public static void main(String[] args) {
        int m = 3;
        String s1 = Integer.toBinaryString(m);
       double k = Integer.parseInt(s1);
        double j = k;
        double p = 0;
        double prod=0.0;
        System.out.println(p);
        System.out.println(k);
        int value = (int)k ;
        while(value>0)
        {
          prod = prod+Math.pow(5,p);
          k=k/10;
          value = (int)k;
            System.out.println(k);
          p=p+1;
        }
System.out.println(prod);

    }
}
