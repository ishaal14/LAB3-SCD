
package lab3;
import java.util.Scanner;
public class LAB3 {
   
    // Function to calculate percentage
    public static double calculatePercentage(double obtainedMarks, double totalMarks) {
        return (obtainedMarks / totalMarks) * 100;
    }

    // Function to determine grade based on percentage
    public static String determineGrade(double percentage) {
        if (percentage >= 90) {
            return "A+";
        } else if (percentage >= 80) {
            return "A";
        } else if (percentage >= 70) {
            return "B+";
        } else if (percentage >= 60) {
            return "B";
        } else if (percentage >= 50) {
            return "C";
        } else if (percentage >= 40) {
            return "D";
        } else {
            return "F";
        }
    }

    // Function to calculate GPA based on grade
    public static double calculateGPA(String grade) {
        switch (grade) {
            case "A+":
                return 4.0;
            case "A":
                return 3.7;
            case "B+":
                return 3.3;
            case "B":
                return 3.0;
            case "C":
                return 2.0;
            case "D":
                return 1.0;
            case "F":
                return 0.0;
            default:
                return 0.0;
        }
    }

    // Function to display the student's mark sheet
    public static void displayMarkSheet(String studentName, double totalMarks, double obtainedMarks) {
        double percentage = calculatePercentage(obtainedMarks, totalMarks);
        String grade = determineGrade(percentage);
        double gpa = calculateGPA(grade);

        System.out.println("\n----- Mark Sheet -----");
        System.out.println("Student Name: " + studentName);
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Obtained Marks: " + obtainedMarks);
        System.out.println(String.format("Percentage: %.2f%%", percentage));
        System.out.println("Grade: " + grade);
        System.out.println(String.format("GPA: %.2f", gpa));
        System.out.println("----------------------");
    }

    public static void main(String[] args) {
    // Create Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Get student details
        System.out.print("Enter Student Name: ");
        String studentName = scanner.nextLine();

        System.out.print("Enter Total Marks: ");
        double totalMarks = scanner.nextDouble();

        System.out.print("Enter Obtained Marks: ");
        double obtainedMarks = scanner.nextDouble();

        // Validate input
        if (totalMarks <= 0 || obtainedMarks < 0 || obtainedMarks > totalMarks) {
            System.out.println("Invalid marks. Please ensure obtained marks are between 0 and total marks.");
        } else {
            // Display the mark sheet
            displayMarkSheet(studentName, totalMarks, obtainedMarks);
        }

        // Close the scanner
        scanner.close();
    }
}

    }
    
}
