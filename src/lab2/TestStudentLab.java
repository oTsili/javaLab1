package lab2;

import lab1.Student;
import lab1.UserInput;

import static lab2.TestStudent.createStudent;

public class TestStudentLab {
    public static void main(String[] args) {
        // Read the size of the array
        int studentSize = UserInput.getInteger("Enter the number of Students");

        // Δημιουργία του εργαστηριακού τμήματος
        StudentLab lab = new StudentLab(studentSize);

        // Εισαγωγή στοιχείων φοιτητών
        for (int i = 0; i < studentSize; i++) {
            // Δημιουργία αντικειμένου Student και εισαγωγή στο εργαστηριακό τμήμα
            Student student = createStudent();
            lab.addStudent(student);
        }

        // Εκτέλεση των μεθόδων της κλάσης StudentLab
        System.out.println("Students in the lab:");
        System.out.println(lab);
        lab.passed();
        lab.avgStudents();
        int bestStudentIndex = lab.bestStudent();
        if (bestStudentIndex != -1) {
            System.out.println("Best student:");
            System.out.println(lab.students[bestStudentIndex]);
        } else {
            System.out.println("No students found.");
        }
    }
}
