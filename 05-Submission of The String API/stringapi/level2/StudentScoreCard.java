package stringapi.level2;
import java.util.Scanner;

public class StudentScoreCard {

    static int[][] generateScores(int n) {
        int[][] pcm = new int[n][3];
        for (int i = 0; i < n; i++) {
            pcm[i][0] = (int)(Math.random() * 100);
            pcm[i][1] = (int)(Math.random() * 100);
            pcm[i][2] = (int)(Math.random() * 100);
        }
        return pcm;
    }

    static double[][] calculateResult(int[][] pcm) {

        double[][] result = new double[pcm.length][4];

        for (int i = 0; i < pcm.length; i++) {

            int total = pcm[i][0] + pcm[i][1] + pcm[i][2];
            double avg = total / 3.0;
            double percent = avg;

            avg = Math.round(avg * 100.0) / 100.0;
            percent = Math.round(percent * 100.0) / 100.0;

            result[i][0] = total;
            result[i][1] = avg;
            result[i][2] = percent;
            result[i][3] = pcm.length;
        }
        return result;
    }

    static String[] calculateGrade(double[][] result) {

        String[] grade = new String[result.length];

        for (int i = 0; i < result.length; i++) {
            double percent = result[i][2];

            if (percent >= 90)
                grade[i] = "A";
            else if (percent >= 75)
                grade[i] = "B";
            else if (percent >= 60)
                grade[i] = "C";
            else if (percent >= 40)
                grade[i] = "D";
            else
                grade[i] = "F";
        }
        return grade;
    }

    static void display(int[][] pcm, double[][] result, String[] grade) {

        System.out.println("Stu\tPhy\tChem\tMath\tTotal\tAvg\t%\tGrade");

        for (int i = 0; i < pcm.length; i++) {
            System.out.println(
                    (i + 1) + "\t" +
                            pcm[i][0] + "\t" +
                            pcm[i][1] + "\t" +
                            pcm[i][2] + "\t" +
                            (int)result[i][0] + "\t" +
                            result[i][1] + "\t" +
                            result[i][2] + "\t" +
                            grade[i]
            );
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[][] pcm = generateScores(n);
        double[][] result = calculateResult(pcm);
        String[] grade = calculateGrade(result);

        display(pcm, result, grade);

        sc.close();
    }
}

