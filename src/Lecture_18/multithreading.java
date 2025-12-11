package Lecture_18;
 import java.util.*;
// Creating a new thread to program
class Mythread extends Thread{
    public void run(){
        System.out.println(Thread.currentThread().getName());
        for(int i=0;i<5;i++){
            System.out.println(i);
        }
    }
}
class Lect_18{
    public static void main(String[] args){

        Mythread t1= new Mythread();
       t1.start();
        for(int i=1;i<=5;i++) {
            System.out.println("timer-" +i);

            try {
                Thread.sleep(2000);  // timer function for making elemnt to come as output after a delay
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        try{

           t1.join();  // to arrange order of the code it pauses other thread and excecutes another
            // for a while.
        }
        catch (Exception e){
            System.out.println(e);
        }

        for(int i=1;i<=5;i++){
            System.out.println("downloding file....."+(i*20)+"%");

            try{
                Thread.sleep(2000);  // timer function for making elemnt to come as output after a delay
            }
            catch(Exception e){
                System.out.println(e);
            }
        }


    }

}