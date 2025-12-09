package Lecture_16;

import java.util.*;

// replace all odd numberd by -1

class lecture_16_1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);

        ListIterator<Integer> it = list.listIterator();


        System.out.println(list);
    }
}