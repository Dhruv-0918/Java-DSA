package Lecture_9;
class Animal{
    void eat(){
        System.out.println("Pizza");
    }
    void data(){
        System.out.println("hello");
    }
}
class Dog extends Animal{
    void eat(){
        System.out.println("khana");
    }
}
class Lecture_9{
    public static void main(String[] args){
        Dog s1=new Dog();
        s1.eat();
    }

}