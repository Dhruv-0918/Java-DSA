package Lecture_8;

//constructor chaining

class Carrr{
    public Carrr(){
        this(5);
        System.out.println("hello");
    }
    public Carrr(int a){
        this(5,6);

        System.out.println("a:"+" "+a);

    }
    public Carrr(int a,int b){
        System.out.println("a:"+" "+a);
        System.out.println("b:"+" "+b);
    }

}
public class hello{
    public static void main(String[] args){

        Carrr s1=new Carrr();
//        Carrr s2=new Carrr(2);
//        Carrr s3=new Carrr(18,9);

    }
}