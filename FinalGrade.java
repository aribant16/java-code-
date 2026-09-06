import java.util.Scanner;

public class FinalGrade {

    // Grade weights
    private static final double PROGRAM_WEIGHT = 0.40;
    private static final double TEST1_WEIGHT = 0.15;
    private static final double TEST2_WEIGHT = 0.15;
    private static final double FINAL_EXAM_WEIGHT = 0.30;

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        // Get grades from the user
        double programAverage = getGrade(scan, "program / lab average");
        double test1Grade = getGrade(scan, "test 1 grade");
        double test2Grade = getGrade(scan, "test 2 grade");
        double finalExamGrade = getGrade(scan, "final exam grade");

        // Calculate the weighted final grade
        double finalGrade = calculateFinalGrade(
            programAverage,
            test1Grade,
            test2Grade,
            finalExamGrade
        );

        // Display the result
        System.out.printf(
            "%nThe average final grade is: %.2f%n",
            finalGrade
        );

        scan.close();
    }

    /**
     * Gets a grade from the user.
     */
    public static double getGrade(Scanner scan, String gradeType) {

        System.out.print("Enter " + gradeType + ": ");
        return scan.nextDouble();
    }

    /**
     * Calculates the final grade using the weighted grade categories.
     */
    public static double calculateFinalGrade(
            double programAverage,
            double test1Grade,
            double test2Grade,
            double finalExamGrade) {

        return (programAverage * PROGRAM_WEIGHT)
             + (test1Grade * TEST1_WEIGHT)
             + (test2Grade * TEST2_WEIGHT)
             + (finalExamGrade * FINAL_EXAM_WEIGHT);
    }
}
