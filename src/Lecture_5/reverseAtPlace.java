package Lecture_5;
class Lec5_1{
    public static void main(String[] args) {

        // reverse word at place in string

        String s=("java is Powerful");
         String a[]=s.split(" ");
         StringBuilder result= new StringBuilder();


        for(String word:a){
          result.append(new StringBuilder(word).reverse());
            result.append(" ");

        }
        System.out.println(result);
    }


    }