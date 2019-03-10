//This is 8th program from 99 programs in Java
//This program eliminates consecutive duplicates
//Here main fn. is the test fn. which creates a list on which the last fn. is called.
//List is hard coded and you can manipulate to check the answers

import java.util.*;
import static java.util.Arrays.asList;

public class P08 {

    public static <T> Vector<T> shorten(List<T> list) {     //Shorten function which shortens the original list
        T lastEl = null;                                    //last element is initialized as null
        Vector<T> shortList = new Vector<T>();              //vector cause it's dynamic and faster
        if(list != null && !list.isEmpty()) {               //it will only enter the loop if list is not null
            for(T obj : list) {                             //for every object it will run the loop
                if(obj != lastEl) {                         //if the current obj is not equal to previous it will be added and last element will be replaced by it
                    shortList.add(obj);
                    lastEl = obj;
                }
            }
        }
        else if(list == null) shortList = null;             //if the list was null returning list is also null
        return shortList;                                   //returning the vector
    }
    public static void main(String[] args) {
        List<String> list = asList("A", "A", "B", "B", "C", "C", "A");
        Vector<String> shortList = shorten(list);
        System.out.println("Original List: " + list);
        System.out.println("Final List: " + shortList);
    }
}