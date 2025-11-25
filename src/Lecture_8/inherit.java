package Lecture_8;

//heirarchial inheritence

class Parent{
    int a=50;
    void Eat(){
        System.out.println("I am Parent:"+this.a);
    }
}
class Parent2 extends Parent{
    int a=10;
    void Bark(){
        System.out.println("2nd Parent is:"+a);
    }
}
class child extends Parent {
    int a=40;
    void sound(){
        System.out.println("this is parent:"+super.a);
        System.out.println("I am parent2:"+this.a);
        System.out.println("this is child:"+a);
    }
}

class Main2{
    public static void main(String[] args){
        child s1=new child();
        s1.sound();
    }
}