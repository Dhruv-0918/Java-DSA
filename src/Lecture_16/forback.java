package Lecture_16;

import java.util.*;

// replace all odd numberd by -1

class lecture_16_2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        int midIndex =list.size()/2;

        ListIterator<Integer> it = list.listIterator();

        while (it.hasNext()) {
            int x = it.next();
            System.out.println(x);
            if(x==midIndex){
                break;
            }
        }
        while (it.hasPrevious()) {
            int y = it.previous();
            System.out.println(y);
        }
    }
    }