package com.company;

public class sum {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(sum(n));
    }

    static int sum(int num)
    {
        if(num==0)
        {
            return num;
        }

        return num+sum(num-1);
    }

}
