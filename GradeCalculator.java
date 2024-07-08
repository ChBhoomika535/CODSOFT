import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        //input
        System.out.print("Enter the number of subjects: ");
        int numberOfSubjects = scanner.nextInt();
        int[] marks = new int[numberOfSubjects];
        int totalMarks = 0;
        for (int i = 0; i < numberOfSubjects; i++) {
            System.out.print("Enter marks obtained in subject " + (i + 1) + ": ");
            marks[i] = scanner.nextInt();
            //calculating total marks
            totalMarks += marks[i];
        }

        //calculate avg percentage
        double averagePercentage = (double) totalMarks / numberOfSubjects;

        //assigning grade
        String grade;
        if (averagePercentage >= 90) {
            grade = "A+";
        } 
        else if (averagePercentage >= 80) {
            grade = "A";
        }
        else if (averagePercentage >= 70) {
            grade = "B";
        }
        else if (averagePercentage >= 60) {
            grade = "C";
        } 
        else if (averagePercentage >= 50) {
            grade = "D";
        }
        else {
            grade = "F";
        }

        // Display result
        System.out.println("\nResults:");
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Percentage: " + averagePercentage + "%");
        System.out.println("Grade: " + grade);

        scanner.close();
    }
}
