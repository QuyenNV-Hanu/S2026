package week01;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StudentGradeManager {
    static Map<String, Integer> students = new HashMap<String, Integer>();

    public static void addStudent(String studentName, int grade) {
        students.put(studentName, grade);
    }

    public static double getAverage() {
        if (students.isEmpty()) {
            return 0.0;
        } else {
            int length = students.size();
            // calculate sum
            double sum = 0.0;
            for (int grade : students.values()) {
                sum += grade;
            }
            return sum / length;
        }
    }

    public static String getTopStudents() {
        if (students.isEmpty()) {
            return "The student list is empty";
        }else {
            int highest = Integer.MIN_VALUE;
            String highestStudentName = "";
            for (Map.Entry<String, Integer> entry : students.entrySet()) {
                if (entry.getValue() > highest) {
                    highest = entry.getValue();
                    highestStudentName = entry.getKey();
                }
            }
            return highestStudentName;
        }
    }

    public static void main(String[] args) {
        students.put("Alice", 85);
        students.put("Bob", 92);
        students.put("Charlie", 78);
        System.out.printf("Average: %.2f\n", getAverage());
        System.out.printf("Top students: %s\n", getTopStudents());
    }
}
