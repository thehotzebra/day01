package myapp;

import java.io.Console;

public class Whileloop {
    
        public static void main (String[] args) {
        Console cons = System.console();    
        String name = "";
        
        while (name.length() <= 0 ){

        name = cons.readLine("What's ur name sir?");
        name = name.trim();
        }

        System.out.printf("Hello %s\n", name);
        }
}
