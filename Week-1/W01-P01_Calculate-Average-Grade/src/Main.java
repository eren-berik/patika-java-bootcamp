import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double mathGrade, physicsGrade, chemistryGrade, turkishGrade, historyGrade, musicGrade;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your math grade: ");
        mathGrade = input.nextDouble();

        System.out.print("Enter your physics grade: ");
        physicsGrade = input.nextDouble();

        System.out.print("Enter your chemistry grade: ");
        chemistryGrade = input.nextDouble();

        System.out.print("Enter your turkish grade: ");
        turkishGrade = input.nextDouble();

        System.out.print("Enter your history grade: ");
        historyGrade = input.nextDouble();

        System.out.print("Enter your music grade: ");
        musicGrade = input.nextDouble();

        isPassedClass(mathGrade, physicsGrade, chemistryGrade, turkishGrade, historyGrade, musicGrade);
    }

    private static double calculateGradeAverage(
            double lectureOne, double lectureTwo,
            double lectureThree, double lectureFour,
            double lectureFive, double lectureSix) {
        return (lectureOne + lectureTwo + lectureThree + lectureFour + lectureFive + lectureSix) / 6;
    }

    private static void isPassedClass(
            double lectureOne, double lectureTwo,
            double lectureThree, double lectureFour,
            double lectureFive, double lectureSix) {

        double gradeAverage = calculateGradeAverage(lectureOne, lectureTwo, lectureThree, lectureFour, lectureFive, lectureSix);
        if (gradeAverage > 60) {
            System.out.println("Passed the class! Your average grade is " + String.format("%.2f", gradeAverage));
        } else {
            System.out.println("Failed the class! Your average grade is " + String.format("%.2f", gradeAverage));
        }
    }
}