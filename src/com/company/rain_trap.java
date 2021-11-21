package com.company;
import java.util.Scanner;
import java.util.Vector;
class rain
{

public void map(Vector<Integer> v2)
{
    int sum =0;
    int  count =0;
    int i;
    int ptr;
    for(i=1;i<=v2.size()-1;i++)
    {
        ptr = v2.get(i);
        int l = i-1;
        int r=i+1;
        int max2 = 0;
        int max1 =0;
        while(l>=0 && l!=-1)
        {

            if(max1<v2.get(l))
            {
                max1=v2.get(l);

            }
            l--;
        }
        while(r<=v2.size()-1 )
        {

            if(max2<v2.get(r))
            {
                max2=v2.get(r);
            }
            r++;
        }

      if(max1<=max2)
      {
         if(v2.get(i)<max1)
         {
             sum=max1-v2.get(i);
             count=count+sum;
         }

      }
      else
      {
          if(v2.get(i)<max2)
          {
              sum=max2-v2.get(i);
              count=count+sum;
          }
      }

    }
    System.out.println(count);



}
}
public class rain_trap {
    public static void main(String[] args) {
        Vector<Integer> v1 = new Vector<>();
        v1.add(0);
        v1.add(1);
        v1.add(0);
        v1.add(2);
        v1.add(1);
        v1.add(0);
        v1.add(1);
        v1.add(3);
        v1.add(2);
        v1.add(1);
        v1.add(2);
        v1.add(1);
        rain r1 = new rain();
        r1.map(v1);

    }
}
