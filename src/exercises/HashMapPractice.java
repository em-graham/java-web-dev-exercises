/*package exercises;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class HashMapPractice {
    public static void main(String[] args) {
        HashMap<Integer, String> idStudents = new HashMap<>();
        Scanner input = new Scanner(System.in);
        String newStudent;
        Integer newID;

        System.out.println("Enter your students (or ENTER to finish): ");

        do {

            System.out.print("Student: ");
            newStudent = input.nextLine();

            if (!newStudent.equals("")) {
                System.out.print("ID: ");
                newID = input.nextInt();
                idStudents.put(newStudent, newID);

                // Read in the newline before looping back
                input.nextLine();
            }
        } while(!newStudent.equals(""));
        input.close();

        System.out.println("\nClass roster:");

        for (Map.Entry<Integer, String> student : classRoster.entrySet()) {
            System.out.println(student.getValue() + "'s ID: " + student.getKey());
        }

        System.out.println("Number of students in roster: " + classRoster.size());
    }
}*/
