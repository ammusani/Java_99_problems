//This program is 7th of the 99 problems. 
//It flattens the given nested list. 
//Here main fn. is the test fn. which creates a list on which the last fn. is called.
//Here test case is in built, it can be manually altered.

import java.util.*;
import static java.util.Arrays.asList;


public class P07 {
    public static <T> Vector<T> flatIt(List<T> list) {      //wrapper method to flattening method
        Vector<T> finList = new Vector<T>();                //creating a new vector to store the new list, used a vector cause it is faster and dynamic
        flatIt(list, finList);                              //flattening method call with the given list and final vector to be produced
        return finList;                                     
    }

    public static <T> void flatIt(List<T> list, Vector<T> finList) {    //flatIt function
        for(T obj : list) {                                             //for every element in the List list
            if(obj instanceof List<?>) {                                //if it is another list inside list, calling a recursive call on it to flatten it 
                flatIt((List<T>)obj, finList);
            }
            else {                                                      //if it isn't another list, just adding it as an new object
                finList.add(obj);
            }
        }
    }

    public static void main(String[] args) {
        List<Object> unflatList = asList("a", asList("b", asList("c", "d", asList(1, 3, 5))), "e");     //Test Case
        Vector<Object> flatList = flatIt(unflatList);                                                   //Created as an object so any type data can be stored inside the list.
        System.out.println("Unflat List: " + unflatList);                                               //printing the unflat list
        System.out.println("Flat List: " + flatList);                                                   //printing the flat list
    }
}

