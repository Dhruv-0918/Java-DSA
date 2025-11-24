package Lecture_6;
//Local variable is the ususally used variables
//kisi bhi non static variable ko call krne ke liye object bananna padta h
//nonstatic is also known as instantaneous variable
class Lect6{
     static int a=5;  //static is used for conversion of nonstatic varibale to static
    int data=20;
    static void sum(){
        System.out.println("hello java");
    }
    public static void main(String[] args){   // here static is used so that JVM calls variables without making object

        //call of normal variable
        int a=5;
        System.out.println(a);

        //call nonstatic variable using object
        Lect6 obj =new Lect6();
        System.out.println(obj.data);

        //call from static variable
        System.out.println(a);

        //calling static function, we can call it using object or without object
        sum();




    }
}