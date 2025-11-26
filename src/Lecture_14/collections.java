package Lecture_14;
// collections framework
import java.util.ArrayList;

// Dynamic array creation

class Main{
    public static void main(String[] args){
        ArrayList<Integer> list =new ArrayList<>();
        list.add(5);
        list.add(10);
        list.add(1,30);

        // update / modify elements
        list.set(2,99);
        // remove operation
        list.remove(0);
        list.remove(Integer.valueOf(20));
        // Search operations
        boolean exist =list.contains(30);
        int idx1=list.indexOf(100);
        int idx2 = list.lastIndexOf(100);

        // size and empty
        int size = list.size();
        boolean isEmpty = list.isEmpty();

        System.out.println(list.get(1));
    }

}