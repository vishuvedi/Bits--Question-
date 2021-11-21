    package com.company;

    public class bitwise {
        public static void main(String[] args) {
        int arr[] = {1,1,2,2,3,3,4,5,5};
    System.out.println(ans(arr));
        }

        public static int ans(int arr[])
        {

            int i;
            int un = 0;
            for(i=0;i<arr.length;i++)
            {
                un = un^arr[i];
            }
                return un;
        }
    }
