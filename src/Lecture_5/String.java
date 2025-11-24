package Lecture_5;
class Lec5{
    public static void main(String[] args){

        StringBuilder str=new StringBuilder("hello");

//        add string to any index of string
//        str.insert(1,"java");
//        System.out.println(str);

        // replace()
        str.replace(1,4,"JAVA");
        System.out.println("replace:"+str);

        //delete()
        str.delete(2,6);
        System.out.println("delete:"+str);

        //deleteChar()
        str.deleteCharAt(1);
        System.out.println("deleteChar:"+str);

        //reverse()
        str.reverse();
        System.out.println(str.reverse());

        //length()
        str.length();
        System.out.println(str.length());

        //capacity();
        str.capacity();
        System.out.println(str.capacity());

    }
}