package Lecture_16;

import java.util.*;

//

class lecture_16_5 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(20);
        list.add(10);
        list.add(5);
        list.add(14);
        list.add(3);
        list.add(11);
        int target = 14;

        ListIterator<Integer> it = list.listIterator();

        while (it.hasNext()) {
            int x = it.next();
            System.out.println(x);
            if (x == target) {
                break;
            }
        }
        while (it.hasPrevious()) {
            int y = it.previous();
            if (y < target) {
                it.remove();



               }
            else{
                System.out.println(y);
            }
        }

    }

}

