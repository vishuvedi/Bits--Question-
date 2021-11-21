package com.company;
import java.util.Scanner;
import java.util.Vector;
class  selection{
    public void sort(Vector<Integer> v2)
    {
        int i,j;
        int temp;
        int min=0;
        for(i=0;i<v2.size();i++)
        {
            for(j=i+1;j<v2.size();j++)
            {
                if(min>v2.get(j))
                {
                    min = v2.get(j);
                }

            }
            temp = v2.get(i);
            v2.add(i,min);
            min=temp;
        }
        int show;
        for(i=0;i<v2.size();i++)
        {
            show = v2.get(i);
            System.out.println(show);
        }

    }


}

public class selectiom{
    public static void main(String[] args) {
        Vector<Integer> v1 = new Vector<>();
        int i;
        v1.add(34);
        v1.add(1);
        v1.add(5);
        v1.add(45);

        selection s1 = new selection();
        s1.sort(v1);

    }

}
