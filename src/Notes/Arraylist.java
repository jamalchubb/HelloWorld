package Notes;

import java.util.*;



public class Arraylist {

    public static void main(String[] args) throws Exception {
        /*LinkedList<Integer> intList = new LinkedList<>();  // This is a linked list. You can also use ArrayList
        intList.add(1);
        System.err.println(intList.size());
        intList.add(2);
        System.err.println(intList.size());
        intList.remove(0);
        System.err.println(intList.size()); */
        
        System.out.println();

        System.out.println("********** Stack **********");
    
        Stack<Integer> intList = new Stack<>();  // This is a stack.
        intList.push(1);    // This adds an element to the stack
        intList.push(2);     // This adds an element to the stack
        while (!intList.isEmpty()) {    
            System.err.println(intList.pop());  // This removes the last element from the stack and prints it 
        } 
        
        System.out.println("********** Hashset and Treeset**********");

        Set<String> set = new HashSet<>(); // can also use TreeSet to sort the elements.
        set.add("Jill");
        set.add("Jack");
        System.err.println(set.size());  // This prints 2 because the set does not allow duplicates
        for (String s : set) {
            System.err.println(s);
        }
        System.out.println();

        System.out.println("********** HashMap and TreeMap**********");

        Map<String, Integer> map = new HashMap<>();  // can also use TreeMap to sort the elements.
        map.put("A", 1);
        map.put("A", 2);  // This replaces the value of A from 1 to 2
        map.put("B", 2);
        map.put("C", 3);
        /*for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.err.println(entry.getKey() + " " + entry.getValue());
        }*/
        

        for (String key : map .keySet()) {
            System.out.println(key);
            System.out.println(map.get(key));
        }

        for(Integer value : map.values()){
            System.out.println(value);
        }

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
    }    
}
