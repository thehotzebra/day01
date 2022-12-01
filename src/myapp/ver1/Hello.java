package myapp.ver1;

import java.io.Console;

public class Hello {

    public static void main (String[] args) {

        // Get the console
        Console cons = System.console();

        // Read from the console, the result is assigned ito a variable.
        String name = cons.readLine("What is your name?");
        
        //Send a greeting to the name
        if (name.equals("Fred")) {
            System.out.printf("Hello %s. Nice to meet you.", name.toUpperCase());
        } else if (name.equals("")){

            System.out.printf("Please enter your name.", name);
        } 
        else {

            System.out.printf("YOU'RE NOT FRED, YOU ARE %s!", name);
        }

    }
    
}
