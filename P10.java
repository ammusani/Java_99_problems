//This is the 10th program in 99 programs in Java
//This is extension of the last program, instead of storing the complete list your store the element and its size
//Here main fn. is the test fn. which creates a list on which the last fn. is called.
//List is hard coded and you can manipulate to check the answers

import java.util.*;
import static java.util.Arrays.asList;
import java.util.AbstractMap.SimpleEntry;

public class P10 {
    public static <T> List<SimpleEntry<Integer, T>> effP09(List<T> list) {
        List<SimpleEntry<Integer, T>> finList = new ArrayList<>();
        T lastEl = null;
        int count = 0;
        if(list != null && !list.isEmpty()) {
            for(T obj : list) {
                if(obj == lastEl) {
                    count++;
                }
                else {
                    if(count != 0) {
                        finList.add(new SimpleEntry(count, lastEl));
                        count = 0;
                    }
                    lastEl = obj;
                    count = 1;
                }
            }
            finList.add(new SimpleEntry(count, lastEl));
        }
        else if(list == null) finList = null;
        return finList;
    }

    public static void main(String[] args) {
        List<String> list = asList("A", "A", "A", "A", "B", "B", "B", "C", "C", "D", "A", "A", "A");
        List<SimpleEntry<Integer, String>> finList = effP09(list);
        System.out.println("Original List: " + list);
        System.out.println("Edited List: " + finList);
    }
}
