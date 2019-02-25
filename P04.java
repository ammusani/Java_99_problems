//This program is 4th of the 99 problems. 
//It prints the size of the list. 
//Here main fn. is the test fn. which creates a list on which the last fn. is called.

import java.util.*;

public class P04 {
    public static <T> int numOfEl(LinkedList<T> list) {
        return list.size();
    }

    public static void main(String[] args) {            //Test function
        LinkedList<Integer> list = new LinkedList<Integer>();   //Integer LinkedList
        System.out.println("According to the specification of the program, you can enter only integers.\nEnter n integers on the same line, press enter to stop the input.");
        Scanner p = new Scanner(System.in);              //Scanner class definition
        String str;                                     
        str = p.nextLine();                             //String input
        p.close();                                      //closing the input buffer
        if(!str.isEmpty()) {
            String[] arrNum = str.split(" ", 0);            //splitting the string into seperate numbers
            int z = 0;                                      //counter
            while(z < arrNum.length) {
                list.add(Integer.parseInt(arrNum[z]));      //parsing the seperated string int as numbers
                z++;
            } 
        }
        int value = numOfEl(list);                    //calling the last function
        System.out.println(value);
    }
}