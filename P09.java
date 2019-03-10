//This is the 9th program in 99 problems in Java
//Program creates a super list in which all the duplicate consecutive elements are in a same list
//Here main fn. is the test fn. which creates a list on which the last fn. is called.
//List is hard coded and you can manipulate to check the answers

import java.util.*;
import static java.util.Arrays.asList;

public class P09 {

    public static <T> List<List<T>> consDuplList(List<T> list) {
        List<List<T>> finList = new ArrayList<>();
        T lastEl = null;
        List<T> newlist = new ArrayList<>();
        if(list != null && !list.isEmpty()) {
            for(T obj : list) {
                if(obj == lastEl) {
                    newlist.add(obj);
                }
                else {
                    if(!newlist.isEmpty()) {
                        finList.add(newlist);
                        newlist = new ArrayList<>();
                    }
                    newlist.add(obj);
                    lastEl = obj;
                }
            }
            finList.add(newlist);
        }
        else if(list == null) finList = null;
        return finList;
    }

    public static void main(String[] args) {
        List<String> list = asList("A", "A", "A", "A", "B", "B", "B", "C", "C", "D", "A", "A", "A");
        List<List<String>> finList = consDuplList(list);
        System.out.println("Original List: " + list);
        System.out.println("Edited List: " + finList);
    }
}