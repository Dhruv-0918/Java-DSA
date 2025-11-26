package Lecture_13;

public class packages {
    protected void show() {           // using private will lead to eroor and did not use in the package
        // using protected will also lead to no output
        System.out.print("Hello\n");
    }
}
class main{
public static void main(String[] args) {
  B s1=new B();
  s1.show();   // using private through same package is not accessible
               // but using protected in same package is accessible and got output
}
}
