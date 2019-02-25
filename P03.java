//This program is 3rd of the 99 problems. 
//It prints the kth element of the list. 
//Here main fn. is the test fn. which creates a list on which the last fn. is called.

import java.util.*;

public class P03 {
    public static <T> T kthElement(LinkedList<T> list, int k) {                 //Fn. of the program which performs the action
        if(k > list.size() - 1) throw new NoSuchElementException("Out of bound!");  //Error if k is greater than size of the list
        else return list.get(k);                                                //Returns the value at kth location
    }

    public static void main(String[] args) {            //Test function
        LinkedList<Integer> list = new LinkedList<Integer>();   //Integer LinkedList
        System.out.println("According to the specification of the program, you can enter only integers.\nEnter n integers on the same line, press enter to stop the input.\nThen enter kth  element id");
        Scanner p = new Scanner(System.in);              //Scanner class definition
        String str;                                     
        str = p.nextLine();                             //String input
        if(str.isEmpty()) {
            p.close();                                  //closing the input
            throw new NoSuchElementException("Empty List"); //Error for string being empty
        }
        else {
            String[] arrNum = str.split(" ", 0);            //splitting the string into seperate numbers
            int z = 0;                                      //counter
            while(z < arrNum.length) {
                list.add(Integer.parseInt(arrNum[z]));      //parsing the seperated string int as numbers
                z++;
            }
            int k;
            k = p.nextInt();                                //getting input of k
            p.close();                                      //closing the input
            int value = kthElement(list, k);                //calling the last function
            if(list.size() > 1) System.out.println(value);
        }
    }
}