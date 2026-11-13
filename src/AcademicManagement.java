import java.util.Scanner;

public class AcademicManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Student Details:\n");
        System.out.printf("--------------------------------\n");
        System.out.println(new Student("Amali Perera", "Female", "12345", "BECS", 2));
        System.out.printf("Lecturer Details:\n");
        System.out.printf("--------------------------------\n");
        System.out.println(new Lecturer("Dr. John Smith", "Male", "L123", "john.smith@example.com", "Room 203", "Ph.D. in CS"));
        System.out.printf("Course Details:\n");
        System.out.printf("--------------------------------\n");
        System.out.println(new Course("Introduction to Programming", "CS101", "Dr. John Smith", 3, "Variables, Loops, OOP Basics"));
        System.out.printf("Exam Details:\n");
        System.out.printf("--------------------------------\n");
        MidExam midExam = new MidExam("CS101", "2025-02-10", "Dr. John Smith", "Hall A");
        midExam.conductExam();
        FinalExam finalExam = new FinalExam("CS101", "2025-03-15", "Dr. John Smith", "Hall B");
        finalExam.conductExam();
        System.out.printf("Result Details:\n");
        System.out.printf("--------------------------------\n");
        System.out.println(new Result(85.5, 40, 85));
        System.out.printf("Resources Details:\n");
        System.out.printf("--------------------------------\n");
        System.out.println(new Resources("Python, Java, MATLAB", "Eclipse, IntelliJ, MATLAB IDE", "Study Guides, Tutorials, Past Papers"));

        scanner.close();
    }
}

