//This is the 12th program in 99 programs in Java
//It decodes the list created in the last program
//Here main fn. is the test fn. which creates a list on which the last fn. is called.
//List is hard coded and you can manipulate to check the answers
//Function of P11 are included to show the working of P12

import java.util.*;
import static java.util.Arrays.asList;
import java.util.AbstractMap.SimpleEntry;


public class P12 {
    public static <T> List<T> decodP11(List<Object> list) {
        List<T> finList = new ArrayList<>();
        if(list == null) finList = null;
        else if(!list.isEmpty()) {
            for(Object obj : list) {
                if(obj instanceof SimpleEntry) {
                    int p = (int)((SimpleEntry)obj).getKey();
                    T z = (T)((SimpleEntry)obj).getValue();
                    for(int i = 0; i < p; i++) finList.add(z);
                }
                else finList.add((T)obj);
            }
        }
        return finList;
    }

    public static <T> List<Object> effP10(List<T> list) {
        List<Object> finList = new ArrayList<>();
        T lastEl = null;
        int count = 0;
        if(list != null && !list.isEmpty()) {
            for(T obj : list) {
                if(obj == lastEl) {
                    count++;
                }
                else {
                    if(count != 0) {
                        if(count == 1) {
                            finList.add(lastEl);
                            count = 0;
                        }
                        else {
                            finList.add(new SimpleEntry(count, lastEl));
                            count = 0;
                        }
                    }
                    lastEl = obj;
                    count = 1;
                }
            }
            if(count > 1) finList.add(new SimpleEntry(count, lastEl));
            else finList.add(lastEl);
        }
        else if(list == null) finList = null;
        return finList;
    }

    public static void main(String[] args) {
        List<String> list = asList("A", "A", "A", "A", "B", "B", "B", "C", "C", "D", "A", "A", "A");
        List<Object> list2 = effP10(list);
        List<String> finList = decodP11(list2);
        // System.out.println("Original List: " + list);
        System.out.println("Edited List: " + finList);
    }
}