package Notes;

import java.util.*;



public class Arraylist {

    public static void main(String[] args) throws Exception {
        LinkedList<Integer> intList = new LinkedList<>();
        intList.add(1);
        System.err.println(intList.size());
        intList.add(2);
        System.err.println(intList.size());
        intList.remove(0);
        System.err.println(intList.size());
    }
    
}
