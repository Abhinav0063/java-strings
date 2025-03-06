import java.util.Random;

public class StudentGrades {
    // Method to generate random marks
    public static int[][] generateMarks(int numStudents) {
        Random rand = new Random();
        int[][] marks = new int[numStudents][3];

        for (int i = 0; i < numStudents; i++) {
            marks[i][0] = 50 + rand.nextInt(51);
            marks[i][1] = 50 + rand.nextInt(51);
            marks[i][2] = 50 + rand.nextInt(51);
        }
        return marks;
    }

    // Method to determine grade
    public static String getGrade(double percentage) {
        return (percentage >= 80) ? "A" : (percentage >= 70) ? "B" : (percentage >= 60) ? "C" :
               (percentage >= 50) ? "D" : (percentage >= 40) ? "E" : "R";
    }

    public static void main(String[] args) {
        int[][] marks = generateMarks(5);
        for (int[] student : marks) {
            double percentage = (student[0] + student[1] + student[2]) / 3.0;
            System.out.printf("Marks: %d %d %d | Percentage: %.2f%% | Grade: %s%n",
                    student[0], student[1], student[2], percentage, getGrade(percentage));
        }
    }
}
