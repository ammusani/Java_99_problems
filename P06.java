//This program is 5th of the 99 problems. 
//It reverses and prints the list. 
//Here main fn. is the test fn. which creates a list on which the last fn. is called.

import java.util.*;

public class P06 {
    public static <T> boolean isPalindrome(LinkedList<T> list) {
        int k = list.size();
        for(int i = 0; i < k / 2; i++) {
            if(list.get(i) != list.get(k - i -1)) return false;
        }
        return true;
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
            boolean k = isPalindrome(list);                             //calling the last function
            System.out.println(k);
        }
    }
}