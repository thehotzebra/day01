package myapp;

import java.io.Console;
import java.util.LinkedList;
import java.util.List;

// import java.io.Console;

public class todo01 {

        public static void main (String[] args) {
        
        Console cons = System.console();

        //Create a list of numbers
        List<Integer> listOfInt = new LinkedList<>();

        String item = "";

        while (true) {
            item = cons.readLine("Please enter a number: ");
            item = item.trim();

            //if ("stop".equals(item)) alternative way
            if (item.equals("stop")) 
            //if it is just 1 item, don't need to use {}    
            break;

            //Add the item to the list
            listOfInt.add(Integer.parseInt(item));
        }
    
        System.out.printf("Number of elements in the list: %d\n", listOfInt.size());
        for (Integer index = 0; index < listOfInt.size(); index++)
        System.out.printf("%d: %s\n", index, listOfInt.get(index));
    }
}
