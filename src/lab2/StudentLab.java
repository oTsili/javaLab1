package lab2;

import lab1.Student;

import java.util.Arrays;

public class StudentLab {
    Student[] students;
    private int nextIndex;

    // constructor
    public StudentLab(int capacity) {
        students = new Student[capacity];
        nextIndex = 0;
    }



    // add a student in the next free array index
    public void addStudent(Student student) {
        if (nextIndex < students.length) {
            students[nextIndex++] = student;
        }
    }

    // show students that have passed
    public void passed() {
        int count = 0;
        for (Student student : students) {
            if (student != null && student.computeFinal() >= 5) {
                count++;
            }
        }
        System.out.println("Number of students passed: " + count);
    }

    // show the average of the final grades
    public void avgStudents() {
        double sum = 0;
        int count = 0;
        for (Student student : students) {
            if (student != null) {
                sum += student.computeFinal();
                count++;
            }
        }
        if (count > 0) {
            double avg = sum / count;
            System.out.println("Average final grade of students: " + avg);
        }
    }

    // show the student with the best grades
    public int bestStudent() {
        double maxGrade = Double.MIN_VALUE;
        int index = -1;
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null && students[i].computeFinal() > maxGrade) {
                maxGrade = students[i].computeFinal();
                index = i;
            }
        }
        return index;
    }

    @Override
    public String toString() {
        return "StudentLab{" +
                "students=" + Arrays.toString(students) +
                ", nextIndex=" + nextIndex +
                '}';
    }
}
