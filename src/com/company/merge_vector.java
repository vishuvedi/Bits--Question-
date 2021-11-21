package com.company;
import java.util.Vector;


class meerge{

    public void sorted(Vector<Integer> v3 , int s,int mid,int e)
    {
        Vector<Integer> v4 = new Vector<>();
        int i = s;
        int j = mid+1;
int temp;
        while(i<=mid && j<=e)
        {
            if(v3.get(i)<v3.get(j))
            {
                temp = v3.get(i);
                v4.add(temp);
                i++;
            }
            else
            {
                temp=v3.get(j);
                v4.add(temp);
                j++;

            }
        }
        while(i<=mid)
        { temp =  v3.get(i);
            v4.add(temp);
        }
        while(j<=e)
        {
            temp = v3.get(i);
        v4.add(temp);
        }
int k=0;
        for(k=0;k< v3.size();k++)
        {
            v3.add(v4.get(i));
        }
System.out.println("he;p");
    }

    public void merging(Vector<Integer> v2 ,int s, int e)
    {

        if(s>=e)
        {
            return;

        }
        else
        {
            int mid = (s+e)/2;
            merging(v2,s,mid);
            merging(v2,mid+1,e);
            sorted(v2,s,mid,e);
        }
    }

}
public class merge_vector {
    public static void main(String[] args) {
        Vector<Integer> v1 = new Vector<>();
        v1.add(67);
        v1.add(56);
        v1.add(73);
        v1.add(37);
        v1.add(66);
        v1.add(54);
        int s =0;
        int end = v1.size()-1;
        meerge m1  = new meerge();
        m1.merging(v1,s,end);

    }


}
