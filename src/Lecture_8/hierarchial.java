package Lecture_8;

//heirarchial inheritence

class Animal1{
    void Eat(){
        System.out.println("food");
    }
}
class dog1 extends Animal1{
    void Bark(){
        System.out.println("bhau bhau");
    }
}
class cat extends dog1{
    void sound(){
        System.out.println("Meow meow");
    }
}
class Main{
    public static void main(String[] args){
        cat s1=new cat();
        s1.Bark();
        s1.Eat();
        s1.sound();

    }
}