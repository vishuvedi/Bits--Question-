package com.company;

class sst
{
    public void callstring(String s1)
    {

        System.out.println(s1.replace(" ", "%20"));
    }
}

public class space20 {
    public static void main(String[] args) {
        String s2;
        s2 = " hey i am a boy and my age is 20 years";
        sst s1 = new sst();
        s1.callstring(s2);


    }
}
