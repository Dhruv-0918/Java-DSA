package Lecture_17;
import java.util.*;

// Exception handling......
class hello{
    public static void main(String[] args){
        System.out.println("hello");
        Scanner sc=new Scanner(System.in);


        // Try catch block is used for exception handling kisi problem ki vajah se agle line of code
        // mein error na aay

        // we cannot use if else instead of try catch

        // try block mein vo likhte h jismein problem aa skti h
        // Catch block mein exception type batate h

        try{

            int a =sc.nextInt();
            int b=sc.nextInt();
            int c=a/b;
            System.out.println(c);
        }
        catch(Exception e){
            System.out.println(e);
        }
        finally {
            // finally keyword will always run if it is wrong or right
            // humesha chalenge hum

        }



     try{
         int arr[]={1,2,3};
         System.out.println(arr[5]);
     }catch (Exception e){
         System.out.println(e);
     }


//        String str=null;
//        System.out.println(str.length());  // exception
//        int a=5;
//        int b=0;
//        int c=a/b;
//        System.out.println(c);   // one exception line can cause all codes error behind that
        System.out.println("byyyee");
    }
}