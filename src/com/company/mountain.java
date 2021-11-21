package com.company;
import java.util.Scanner;
import java.util.Vector;
class mount{
    public void mt(Vector<Integer> v1)
    {
        Vector<Integer> v2 = new Vector<>();

        int i;
        int count;
        int track;
        int k;
        for(i=1;i<v1.size()-2;i++)
        {
            if(v1.get(i)>v1.get(i+1) && v1.get(i)>v1.get(i-1))
            {
                count=1;
                k=i;
                track=i-1;
                while(v1.get(track)<v1.get(k) && track>0)
                {
                    count++;
                    track--;
                    k--;
                }
                k=i+1;
                track=k-1;
                while(v1.get(k)<v1.get(track) && track>0)
                {
                    count++;
                    track++;
                    k++;
                }
                v2.add(count);

            }
        }
       int max =0;
        for(i=0;i<v2.size();i++)
        {


            if(max<v2.get(i))
            {
                max=v2.get(i);
            }
        }
        System.out.println(max);
    }
}
public class mountain {
    public static void main(String[] args) {
     Vector<Integer> v1 = new Vector<>();
        v1.add(5);
        v1.add(6);
        v1.add(1);
        v1.add(2);
        v1.add(3);
        v1.add(4);
        v1.add(5);
        v1.add(4);
        v1.add(3);
        v1.add(2);
        v1.add(0);
        v1.add(1);
        v1.add(2);
        v1.add(3);
        v1.add(2);
        v1.add(4);

        mount m1 = new mount();
        m1.mt(v1);





    }
}
