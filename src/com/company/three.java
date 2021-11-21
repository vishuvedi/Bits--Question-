package com.company;

public class three {
    public static void main(String[] args) {
        int a = 3;
        int b = 5;
        int i;
        int sum = 0;
        for(i=3;i<1000;i++)
        {
            if(i%3==0 || i%5==0)
            {
                sum = sum + i;
            }
        }
        System.out.println(sum);

    }
}
