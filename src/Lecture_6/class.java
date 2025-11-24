package Lecture_6;

class car{
    String name="dhruv";    //string static hai or function jo uske andar h vo bhi
                                   // static h to without object banay bhi call kr skte h
                                   //agar dono hi static nhi h to fir main pr object banana pdega
   static void sum(){
        System.out.println();
        car a=new car();
       System.out.println(a.name);

    }
}

class clss{
public static void main(String[] args){

    // call for without static function
    car obj=new car();

    // call for static function

}
}