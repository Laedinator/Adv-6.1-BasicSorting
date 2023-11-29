package controller;

import model.Student;

import java.util.*;

/**
 * @author Marc Ledermann
 * <m.ledermann@st.hanze.nl>
 * Purpose of the program:
 **/
public class StudentLauncher {
    public static void main(String[] args) {
        Student[] studentenArray = Student.generateStudents(10);
        List<Student> unsortedStudentList = new ArrayList<>(Arrays.asList(studentenArray));
        System.out.println("Unsorted List:");
        System.out.println(unsortedStudentList);
        System.out.println("Sorted by studentNumber in descending order:");
        sortListOfStudentsWithDecliningNumber(unsortedStudentList);
        System.out.println("Sorted by studentGrade in ascending order:");
        sortListOfStudentsByGradeAscending(unsortedStudentList);
        System.out.println("Sorted by studentGrade in descending order:");
        sortStudentListByGradeDescending(unsortedStudentList);
    }

    private static void sortStudentListByGradeDescending(List<Student> students) {
        students.sort((s1, s2) -> (int) s2.getMark() * 10 - (int) s1.getMark() * 10);
        System.out.println(students);
    }

    private static void sortListOfStudentsByGradeAscending(List<Student> students) {
        students.sort(Comparator.comparingInt(s -> (int) (s.getMark() * 10)));
        System.out.println(students);
    }

    private static void sortListOfStudentsWithDecliningNumber(List<Student> students) {
        students.sort((s1, s2) -> s2.getStudentID() - s1.getStudentID());
        System.out.println(students);
    }
}
