package exercises.ch3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapPractice {

    public static void main(String[] args){
         HashMap<Integer, String> students = new HashMap();
        Scanner input = new Scanner(System.in);
       Integer newStudentId;

        System.out.println("Enter your students (or ENTER to finish):");

        // Get student names and grades
        do {

            System.out.print("Student'S ID: ");
            newStudentId = input.nextInt();

            input.nextLine();

            if (!(newStudentId <=-1)) {
                System.out.print("Student's Name: ");
                String newStudentName = input.nextLine();

                students.put(newStudentId, newStudentName);

                }

        } while(!(newStudentId <=-1));

        // Print class roster
        System.out.println("\nClass roster:");


        for (Map.Entry<Integer, String> student : students.entrySet()) {
            System.out.println(student.getKey() + " " + student.getValue());
       }
    }
}
