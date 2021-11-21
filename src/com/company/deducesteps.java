package com.company;

public class deducesteps {
    public static void main(String[] args) {
        int value = 45;
steps(value);
System.out.println(sum);
    }
    static int sum = 0;

    static void steps(int c){
        if(c==0)
        {
            return;
        }

        if(c%2==0)
        {
            sum++;
            steps(c/2);

        }
        else if(c%2!=0)
        { sum++;
            steps(c-1);

        }

    }

}
