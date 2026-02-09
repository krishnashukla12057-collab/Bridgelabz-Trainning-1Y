package stringapi.level2;
import java.util.Scanner;

public class RockPaperScissors {

    static String computerChoice() {
        int r = (int)(Math.random() * 3);
        if (r == 0) return "Rock";
        if (r == 1) return "Paper";
        return "Scissors";
    }

    static String findWinner(String user, String comp) {

        if (user.equals(comp)) {
            return "Draw";
        }

        if (user.equals("Rock") && comp.equals("Scissors") ||
                user.equals("Paper") && comp.equals("Rock") ||
                user.equals("Scissors") && comp.equals("Paper")) {
            return "User";
        }

        return "Computer";
    }

    static String[][] calculateStats(int userWins, int compWins, int totalGames) {

        String[][] stats = new String[2][3];

        double userPercent = (userWins * 100.0) / totalGames;
        double compPercent = (compWins * 100.0) / totalGames;

        stats[0][0] = "User";
        stats[0][1] = String.valueOf(userWins);
        stats[0][2] = String.valueOf(userPercent);

        stats[1][0] = "Computer";
        stats[1][1] = String.valueOf(compWins);
        stats[1][2] = String.valueOf(compPercent);

        return stats;
    }

    static void displayResults(String[][] games, String[][] stats) {

        System.out.println("\nGame\tUser\tComputer\tWinner");
        for (int i = 0; i < games.length; i++) {
            System.out.println((i + 1) + "\t" + games[i][0] + "\t" + games[i][1] + "\t\t" + games[i][2]);
        }

        System.out.println("\nPlayer\tWins\tWinning %");
        for (int i = 0; i < stats.length; i++) {
            System.out.println(stats[i][0] + "\t" + stats[i][1] + "\t" + stats[i][2]);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int userWins = 0;
        int compWins = 0;

        int games = sc.nextInt();
        sc.nextLine();

        String[][] gameData = new String[games][3];

        for (int i = 0; i < games; i++) {

            String userChoice = sc.nextLine();
            String compChoice = computerChoice();

            String winner = findWinner(userChoice, compChoice);

            if (winner.equals("User")) userWins++;
            if (winner.equals("Computer")) compWins++;

            gameData[i][0] = userChoice;
            gameData[i][1] = compChoice;
            gameData[i][2] = winner;
        }

        String[][] stats = calculateStats(userWins, compWins, games);
        displayResults(gameData, stats);

        sc.close();
    }
}
