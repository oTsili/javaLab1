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
        //  εισάγει έναν φοιτητή στην θέση pos του πίνακα "lab"
            insertStudent(lab,createStudent(),i);   // lab[i] = createStudent();
        }
        //  εμφανίζει τα στοιχεία των φοιτητών του τμήματος
        displayLab(lab);
        //  εκτύπωση του αριθμού των φοιτητών που ο τελικός τους βαθμός είναι μεγαλύτερος ή ίσος του 5.
        passed(lab);
        //  εκτύπωση του μέσου όρου τελικής βαθμολογίας των φοιτητών του τμήματος
        avgStudents(lab);
        //  επιστρέφει τη θέση του πίνακα στην οποία βρίσκεται ο φοιτητής με το μεγαλύτερο τελικό βαθμό.
        bestStudent(lab);

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

    }

    // Μέθοδος για εμφάνιση των στοιχείων των φοιτητών του τμήματος
    public static void displayLab(Student[] lab) {
        System.out.println("The lab students are:");
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