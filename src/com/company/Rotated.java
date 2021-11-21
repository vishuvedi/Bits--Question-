package com.company;
class rotation{
    public int rotated(int[] arr , int s, int e, int search)
    {
        while(s<=e)
        {
            int mid = (s+e)/2;
            if(arr[mid]==search)
            { return mid;
            }
            else if(arr[mid]<search)
            {
                s=mid+1;
            }
            else
            {
                e=mid-1;
            }
        }
        return 0;
    }
}


public class Rotated {
    public static void main(String[] args) {
int[] arr = new int[]{8,9,10,1,2,3,4};
int s=0;
int i;
for(i=0;i<arr.length;i++)
{
    if(arr[i]<arr[s])
    {
        s= i;
    }
}
int s1 = 0;
int e1 = s-1;
int s2 = s;
int e2 =arr.length-1;
int find = 10;
rotation b1 = new rotation();
int search = b1.rotated(arr,s1,e1,find);
int searchh = b1.rotated(arr,s2,e2,find);
System.out.println(search);
System.out.println(searchh);
    }
}
