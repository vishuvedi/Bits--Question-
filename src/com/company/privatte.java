package com.company;

import java.util.Scanner;

class radius
{
    private int radius;
     public void getradius(int r)
     {
         radius = r;
     }
     public int setradius()
     {
         return 2*radius*3;
     }


}
public class privatte {
    public static void main(String[] args) {
radius r1 = new radius();
        Scanner sc = new Scanner(System.in);
        int a;
        a = sc.nextInt();
        r1.getradius(a);
        System.out.print(r1.setradius());


    }
}
