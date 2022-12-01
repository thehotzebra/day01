package myapp.ver1;

import java.io.Console;

public class Calculate01 {

    public static void main (String[] args) {

        // Get the console
        Console cons = System.console();

        String input = "";
        Integer total = 0;
        Integer count = 0;

        while (true) {
            //Read a line
            input = cons.readLine("PLease enter a number.");
            input = input.trim();
            
            if (input.equals("stop")) {
                //exit the while loop
                break;
            }
            //count +1
            count ++;
            //total = total + value
            total +=  Integer.parseInt(input);;
        }

        System.out.printf("The total of adding %d numbers is %d.", count, total);
        }

    } 
    
    
