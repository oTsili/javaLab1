public class TestStudent {
    public static void main(String[] args) {
        // Δημιουργία 3 αντικειμένων Student
        Student student1 = createStudent();
        Student student2 = createStudent();
        Student student3 = createStudent();

        // Σύγκριση των τελικών βαθμών των τριών φοιτητών
        compareThreeStudentMarks(student1, student2, student3);
    }

    // Μέθοδος για δημιουργία ενός αντικειμένου Student από τον χρήστη
    public static Student createStudent() {
        int studentID = UserInput.getInteger("Enter student ID");
        String firstName = UserInput.getString("Enter first name");
        String lastName = UserInput.getString("Enter last name");
        int absences = UserInput.getInteger("Enter absences");
        double labGrade = UserInput.getDouble("Enter lab grade");
        double theoryGrade = UserInput.getDouble("Enter theory grade");
        System.out.println(" "+ labGrade + " " +theoryGrade);

        return new Student(studentID, firstName, lastName, absences, labGrade, theoryGrade);
    }

    // Στατική μέθοδος για σύγκριση των τελικών βαθμών τριών φοιτητών
    public static void compareThreeStudentMarks(Student student1, Student student2, Student student3) {
        // Πίνακας που περιλαμβάνει τους τελικούς βαθμούς και τα ονόματα των φοιτητών
        Object[][] marksAndNames = {
                {student1.computeFinal(), student1.getFirstName() + " " + student1.getLastName()},
                {student2.computeFinal(), student2.getFirstName() + " " + student2.getLastName()},
                {student3.computeFinal(), student3.getFirstName() + " " + student3.getLastName()}
        };

        // Ταξινόμηση του πίνακα με βάση τον τελικό βαθμό σε φθίνουσα σειρά
//        Arrays.sort(marksAndNames, (a, b) -> Double.compare((double) b[0], (double) a[0]));
        Object[] temp;

        for (int i = 0; i < marksAndNames.length; i++){
            for (int j = i; j < marksAndNames.length; j++) {
                if ((double) marksAndNames[i][0] < (double) marksAndNames[j][0] ){
                    temp = marksAndNames[i];
                    marksAndNames[i] = marksAndNames[j];
                    marksAndNames[j] = temp;
                }
            }
        }



        // Εκτύπωση των τελικών βαθμών των φοιτητών
        System.out.println("Top 3 students by final grade:");
        for (int i = 0; i < marksAndNames.length; i++) {
            System.out.printf("%d %s : %.3f \n",(i + 1), marksAndNames[i][1], (double) marksAndNames[i][0]);
        }
    }
}