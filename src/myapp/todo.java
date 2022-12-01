package myapp;

// import java.io.Console;

public class todo {

        public static void main (String[] args) {
        
        // Console cons = System.console();
        //Create an array of 3 String element
        String[] tasks = new String[3];

        tasks[0] = "running";
        tasks[1] = "eating";
        tasks[2] = "flying";

        /*
        System.out.println(tasks);
        System.out.println(tasks[0]);
        System.out.println(tasks[1]);
        System.out.println(tasks[2]);
        //tells you the size of the array
        System.out.println(tasks.length);
        */


        Integer index = 0;
        while(index < tasks.length) {
            System.out.printf("%d: %s\n", index, tasks[index]);
            index++;
        }

        /*
        for (int i = 0; i < tasks.length; i++) {
        String task = cons.readLine("Enter task %d: ", (i+1));
        tasks[i] = task;
        
        }

        for (int i = 0; i < tasks.length; i++){
            System.out.println(tasks[i]);
        }
        */

    }
}
