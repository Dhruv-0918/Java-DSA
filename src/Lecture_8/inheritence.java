package Lecture_8;

// Multi level inheritence

class Animal{
    void Eat(){
        System.out.println("food");
    }
}
class dog extends Animal{
    void Bark(){
        System.out.println("bhau bhau");
    }
}
class Main1{
    public static void main(String[] args){
        dog s1=new dog();
         s1.Eat();
    }
}