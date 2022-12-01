package myapp.ver1;

import java.io.Console;

public class Calculate {

    public static void main (String[] args) {

        // Get the console
        Console cons = System.console();

        // Read from the console, the result is assigned ito a variable.
        String num1 = cons.readLine("What is your first number?");
        String num2 = cons.readLine("What is your second number?");
        String num3 = cons.readLine("What is your third number?");
        String num4 = cons.readLine("What is your fourth number?");
        
        int num01 = Integer.parseInt(num1);
        int num02 = Integer.parseInt(num2);
        int num03 = Integer.parseInt(num3);
    
        if (num4.trim().equals("stop")) {
        int sum = num01 + num02 + num03;
        System.out.println("The total is " + sum);

        }

    } 
    }
    
