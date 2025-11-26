package Lecture_13;

// final keywords in java
class A{
    final int num =25;
    void out()
    {
        System.out.println(25);
    }
}
class Main{
    public static void main(String[] args)
    {
       A s1= new A();
        s1.out();



    }
}