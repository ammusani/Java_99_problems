//This program is 2nd of the 99 problems. 
//It prints the second last element of the list. 
//Here main fn. is the test fn. which creates a list on which the last fn. is called.

import java.util.*;

public class P02 {
    public static <T> T lastButOne(LinkedList<T> list) {            //The fn which return the second last element
        if(list.size() > 1) return list.get(list.size() - 2);       //If size of the list is at least two then only return the fn.
        else {
            /*System.out.println("Only 1 element in the list");
            return list.get(list.size() - 1);*/
            throw new NoSuchElementException("Length is less than required");
        }
    }

    public static void main(String[] args) {            //Test function
        LinkedList<Integer> list = new LinkedList<Integer>();   //Integer LinkedList
        System.out.println("According to the specification of the program, you can enter only integers, enter n integers on the same line, press enter to stop the input.");
        Scanner p = new Scanner(System.in);              //Scanner class definition
        String str;                                     
        str = p.nextLine();                             //String input
        p.close();                                      //closing the input
        if(str.isEmpty()) throw new NoSuchElementException("Empty List");
        else {
            String[] arrNum = str.split(" ", 0);            //splitting the string into seperate numbers
            int z = 0;                                      //counter
            while(z < arrNum.length) {
                list.add(Integer.parseInt(arrNum[z]));      //parsing the seperated string int as numbers
                z++;
            }
            int k = lastButOne(list);                             //calling the last function
            if(list.size() > 1) System.out.println(k);
        }
    }
}