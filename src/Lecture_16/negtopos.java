
package Lecture_16;

import java.util.*;

// replace all odd numberd by -1

class lecture_16_3 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(-1);
        list.add(2);
        list.add(3);
        list.add(-4);
        list.add(5);
        list.add(6);
        list.add(-7);
        list.add(8);

        ListIterator<Integer> it = list.listIterator();
        while (it.hasNext()) {
            int x = it.next();
            if (x < 0) {
                it.set(-x);
            }
        }
        System.out.println(list);
    }
}
