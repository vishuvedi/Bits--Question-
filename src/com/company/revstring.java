package com.company;

import java.util.Locale;

public class revstring {
    public static void main(String[] args) {
        String s = "realme office";
        int len = s.length();
        String c = "hey";


        System.out.println(c.substring(1).toUpperCase());
       reversed(s,len-1);
    }

    static void reversed(String s1 , int length)
    {
        if(length<1)
        {
            return;
        }
        try {


        }
        catch (Exception e)
        {

        }
int j = length;
        char c1 = s1.charAt(j);
        while(c1 != ' ' ){
            if(j<0)
            {
                j = 0;
                return;
            }
            c1 = s1.charAt(j--);
        }
String s2;
        int n;
   s2 = s1.substring(j,length);
          n = s2.length();
         reversed(s1,length-n);
        System.out.println(s2);
    }
}
