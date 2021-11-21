package com.company;
import java.util.Scanner;
import java.util.Vector;
class boy
{
    private Vector<Integer> v4 =  new Vector<>();

    public void setV4(Vector<Integer> v4 ,int target ) {
        int i;
      Vector<Integer> v2 = new Vector<>();
      Vector<Integer> s1= new Vector<>();
      int sub;
int j=0;
int add;
      for(i=0;i<v4.size();i++)
      {
          sub=target-v4.get(i);
          if(s1.contains(sub))
          {

              System.out.println("("+v4.get(i)+","+sub+")");

          }
          else
          {
              s1.add(v4.get(i));

          }

          }

    }
}
public class Pairs_array {
    public static void main(String[] args) {
        Vector<Integer> v1 = new Vector<>(5);
        Scanner sc = new Scanner(System.in);
        int target;
        target = sc.nextInt();
        int i;
        int n;
       v1.add(10);
        v1.add(5);
        v1.add(2);
        v1.add(9);
        v1.add(3);
        v1.add(-6);
        v1.add(11);

boy v2 = new boy();
        v2.setV4(v1,target);


    }
}
