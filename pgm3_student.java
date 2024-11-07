
// Main class
import java.util.*;
import mca.student;

class pgm3_student {
    public static void main(String[] args) {
        String name;
        int roll;
        int m1, m2, m3;
        Scanner br = new Scanner(System.in);

        System.out.print("Enter roll_no: ");
        roll = br.nextInt();
        br.nextLine();  // Consume the leftover newline character

        System.out.print("Enter Name: ");
        name = br.nextLine();  // Use nextLine() to allow for names with spaces

        System.out.print("Enter subject1 mark: ");
        m1 = br.nextInt();

        System.out.print("Enter subject2 mark: ");
        m2 = br.nextInt();

        System.out.print("Enter subject3 mark: ");
        m3 = br.nextInt();

        // Create student object
        student s = new student(roll, name, m1, m2, m3);
        
        // Display student details
        s.display();
    }
}
