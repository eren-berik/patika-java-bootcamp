import java.util.Scanner;

/*
* This Java program calculates the average grade for a set of lectures and determines whether the student
* has passed or failed based on the calculated average grade. The program prompts the user to enter grades for
* each lecture, and only considers grades within the range of 0 to 100. If a grade is outside this range,
* it is not included in the average calculation. The minimum grade required to pass a class is set to 55.
* The program first imports the Scanner class to read input from the user. It then defines an array to store
* the names of the lectures and another array to store the corresponding grades. After prompting the user to
* enter grades for each lecture, it calculates the total grade and counts the number of grades within the
* acceptable range. The average grade is then calculated based on the valid grades entered.
* Finally, the program checks if an average grade was calculated. If so, it determines whether the student
* has passed or failed the class based on the average grade and displays an appropriate message. If no valid
* grades were entered, the program informs the user accordingly.
*/

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] lectures = {"Math", "Physics", "Turkish", "Chemistry", "Music"};
        int[] grades = new int[5];
        int minGradeToPass = 55;

        for (int i = 0; i < lectures.length; i++) {
            System.out.print("Please enter the " + lectures[i] + " grade: ");
            int grade = sc.nextInt();
            grades[i] = grade;
        }

        int total = 0;
        int acceptableGradeRangeCount = 0;
        for (int i = 0; i < lectures.length; i++) {
            if (grades[i] >= 0 && grades[i] <= 100) {
                total += grades[i];
                acceptableGradeRangeCount++;
            }
        }

        double avgGrade = -1;
        if (acceptableGradeRangeCount > 0) {
            avgGrade = (double) total / acceptableGradeRangeCount;
        }

        if (avgGrade != -1) {
            if (avgGrade >= minGradeToPass) {
                System.out.println("Congrats! Grade average is: " + avgGrade + ". You passed the class!");
            } else {
                System.out.println("Sorry. Grade average is: " + avgGrade + ". You failed.");
            }
        } else {
            System.out.println("Grades is not in valid range (0-100)!");
        }
    }
}
