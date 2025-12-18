package src.main.java;

import java.util.Scanner;

public class studentqueue {

    static String[] students = new String[5];
    static int top = -1;

   
    static void push(String s) {
        students[++top] = s;
    }

 
    static String peek() {
        return students[top];
    }

    
    static String pop() {
        return students[top--];
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

       
        push("S1");
        push("S2");
        push("S3");
        push("S4");

        while (top != -1) {

            String currentStudent = peek();
            System.out.println("\n" + currentStudent + " turn:");

            
            System.out.println("Question: What is Java?");
            System.out.print("Answer: ");
            String answer = sc.nextLine();

            
            int marks;
            if (answer.toLowerCase().contains("programming")) {
                marks = 10;
            } else {
                marks = 5;
            }

            System.out.println("Marks awarded to " + currentStudent + ": " + marks);

            pop();
            System.out.println(currentStudent + " removed (pop).");
        }

        System.out.println("\nAll students have answered.");
        sc.close();
    }
}
