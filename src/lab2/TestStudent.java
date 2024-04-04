package lab2;

import lab1.Student;
import lab1.UserInput;

public class TestStudent {
    public static void main(String[] args) {
        // Read the size of the array
        int studentSize = UserInput.getInteger("Enter the number of Students");

        // create the array
        Student[] lab = new Student[studentSize];
        for (int i = 0; i < lab.length; i++) {
            lab[i] = createStudent();
        }

//        // Σύγκριση των τελικών βαθμών των τριών φοιτητών
//        compareThreeStudentMarks(student1, student2, student3);
        int bestStudentIndex = bestStudent(lab);
        System.out.println(lab[bestStudentIndex]);

    }

    // Μέθοδος για δημιουργία ενός αντικειμένου lab1.Student από τον χρήστη
    public static Student createStudent() {
        int studentID = UserInput.getInteger("Enter student ID");
        String firstName = UserInput.getString("Enter student first name");
        String lastName = UserInput.getString("Enter student last name");
        int absences = UserInput.getInteger("Enter absences");
        double labGrade = UserInput.getDouble("Enter lab grade");
        double theoryGrade = UserInput.getDouble("Enter theory grade");
        System.out.println(" "+ labGrade + " " +theoryGrade);

        return new Student(studentID, firstName, lastName, absences, labGrade, theoryGrade);
    }


    public static void insertStudent(Student[] lab, Student st, int pos) {
        if (pos >= 0 && pos < lab.length) {
            lab[pos] = st;
        }
//        Student[] tempLab = new Student[lab.length+1];
//        System.arraycopy(lab, 0, tempLab, 0, lab.length);
//        tempLab[lab.length] = st;
    }

    // Μέθοδος για εμφάνιση των στοιχείων των φοιτητών του τμήματος
    public static void displayLab(Student[] lab) {
        for (Student student : lab) {
            if (student != null) {
                System.out.println(student);
            }
        }
    }

    // Μέθοδος για εμφάνιση του αριθμού των φοιτητών με τελικό βαθμό >= 5
    public static void passed(Student[] lab) {
        int count = 0;
        for (Student student : lab) {
            if (student != null && student.computeFinal() >= 5) {
                count++;
            }
        }
        System.out.println("Number of students passed: " + count);
    }

    // Μέθοδος για εμφάνιση του μέσου όρου των βαθμών των φοιτητών
    public static void avgStudents(Student[] lab) {
        double sum = 0;
        int count = 0;
        for (Student student : lab) {
            if (student != null) {
                sum += student.computeFinal();
                count++;
            }
        }
        if (count > 0) {
            double avg = sum / count;
            System.out.println("Average grade of students: " + avg);
        }
    }

    // Μέθοδος για εύρεση του φοιτητή με τον υψηλότερο τελικό βαθμό
    public static int bestStudent(Student[] lab) {
        double maxGrade = Double.MIN_VALUE;
        int index = -1;
        for (int i = 0; i < lab.length; i++) {
            if (lab[i] != null && lab[i].computeFinal() > maxGrade) {
                maxGrade = lab[i].computeFinal();
                index = i;
            }
        }
        return index;
    }
}