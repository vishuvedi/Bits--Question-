package com.company;
class employee {
    int year;
    int salary;
    String name;
    public void getname()
    {
        System.out.println("the name is" +name);
System.out.println(" my salary is " +salary);
System.out.println("my year of working is "+year);
    }
}

public class oops {

    public static void main(String[] args) {
employee vasu = new employee();
vasu.name = " vishu ";
vasu.year = 2019;
vasu.salary = 100000;
vasu.getname();

employee chhavi = new employee();
chhavi.name = "vidushi saxena ";
chhavi.salary = 1000000;
chhavi.year=2020;
chhavi.getname();
    }
}
