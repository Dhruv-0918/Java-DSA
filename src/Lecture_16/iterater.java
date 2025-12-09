package Lecture_16;

import java.util.*;

// list iterator mein data modification ho skta h !!!!

 class lecture_16 {
     public static void main(String[] args) {
         ArrayList<Integer> list = new ArrayList<>();
         list.add(5);
         list.add(6);
         list.add(7);
         list.add(8);
         list.add(9);

//        Iterator<Integer> it=list.iterator();
//        while(it.hasNext()){
//            System.out.println(it.next());
//            if(it.next()==6){
//                it.remove();

//        Iterator<Integer> it = list.iterator();
//
//        while(it.hasNext()){
//            int val = it.next();
//            System.out.println(val);
//            if(val == 6){
//                it.remove();
         ListIterator<Integer> it = list.listIterator();

       // to add number after the number
//         while (it.hasNext()) {
//             int x = it.next();
//             if(x==7){
//                 it.add(10);
//
//             }
             // to replace number
         while (it.hasNext()) {
             int x = it.next();
             if(x==7){
                 it.set(10);

             }



         // forward
//         while (it.hasNext()) {
//             int x = it.next();
//             System.out.println(x);
//
//         }
         // backward
//         System.out.println("Backward:");
//             while (it.hasPrevious()) {
//
//                 Integer y = it.previous();
//                 System.out.println(y);

             }
         System.out.println(list);
         }
     }
