

public class Student {
    // Χαρακτηριστικά του φοιτητή
    private int studentID;
    private String firstName;
    private String lastName;
    private int absences;
    private double labGrade;
    private double theoryGrade;

    // Κατασκευαστής
    public Student(int studentID, String firstName, String lastName, int absences, double labGrade, double theoryGrade) {
        this.studentID = studentID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.absences = absences;
        this.labGrade = labGrade;
        this.theoryGrade = theoryGrade;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAbsences() {
        return absences;
    }

    public void setAbsences(int absences) {
        this.absences = absences;
    }

    public double getLabGrade() {
        return labGrade;
    }

    public void setLabGrade(double labGrade) {
        this.labGrade = labGrade;
    }

    public double getTheoryGrade() {
        return theoryGrade;
    }

    public void setTheoryGrade(double theoryGrade) {
        this.theoryGrade = theoryGrade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentID=" + studentID +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", absences=" + absences +
                ", labGrade=" + labGrade +
                ", theoryGrade=" + theoryGrade +
                '}';
    }

    public double computeFinal(){
        return 0.3*this.labGrade*0.7*this.theoryGrade;
    }
}
