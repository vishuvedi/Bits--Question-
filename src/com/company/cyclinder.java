package com.company;
import java.util.Scanner;
class surface
{
   private int radius;
   private int height;
   public void set(int r, int h)
   {
       radius = r;
       height = h;
   }
   public double getsurface(int r , int h)
   {
     double a;
      double b;
      a = 2*3.14*r*h;
      b = 2*3.14*r*r;
      return a+b;
   }
}
public class cyclinder {
    public static void main(String[] args) {
        int a;
        int b;
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the radius ");
        a = sc.nextInt();
        System.out.print("enter the height ");
        b = sc.nextInt();
        surface s1 = new surface();
        s1.set(a,b);
System.out.print(s1.getsurface(a,b));
    }
}
