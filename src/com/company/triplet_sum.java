package com.company;
import java.util.Arrays;
import java.util.Scanner;
class arr
{

    public void setArr2(int map[],int target)
    {
        Arrays.sort(map); /// sorted in nlogn
; /// sorted in nlogn
        int i,j,m;
        int sub;

        for(i=0;i<map.length;i++)
        {
            sub = target-map[i];
            j=i+1;
            m=map.length-1;
            while(j<m)
            {

                if(map[m]+map[j]==sub)
                {
                    System.out.println("("+map[i]+","+map[j]+","+map[m]+")");
j++;
m--;
                }
               if(map[m]+map[j]>sub)
               {
                   m--;
               }
               else if(map[m]+map[j]<sub)
               {
                   j++;
               }
            }
        }
    }
}
public class triplet_sum {
    public static void main(String[] args) {
    int arr[]  = {1,2,3,6,5,4,7,9,8,15};
    System.out.println(arr.length);
    Scanner sc = new Scanner(System.in);
    int target;
    target = sc.nextInt();
    arr c1 =new arr();
    c1.setArr2(arr,target);



    }
}
