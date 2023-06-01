
import java.util.Scanner;

public class TicTacToeGame {

    static char[] flags;

    public static void main(String[] args) {

        flags = new char[9];
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int numMoves = 0;

        for (int i = 0; i <= 8; i++) {
            flags[i] = input.charAt(numMoves);
            numMoves++;
        }

        System.out.println("---------");
        System.out.printf("| %s %s %s |\n", flags[0], flags[1], flags[2]);
        System.out.printf("| %s %s %s |\n", flags[3], flags[4], flags[5]);
        System.out.printf("| %s %s %s |\n", flags[6], flags[7], flags[8]);
        System.out.println("---------");

        boolean condition = true;
        while (condition){
            String coordinates = scanner.nextLine();
            switch (coordinates){
                case "1 1":
                    condition = false;
                    break;
                case "1 2":
                    condition = false;
                    break;
                case "1 3":
                    condition = false;
                    break;
                case "2 1":
                    condition = false;
                    break;
                case "2 2":
                    condition = false;
                    break;
                case "2 3":
                    condition = false;
                    break;
                case "3 1":
                    condition = false;
                    break;
                case "3 2":
                    condition = false;
                    break;
                case "3 3":
                    condition = false;
                    break;
                default:
                    System.out.println("You should enter numbers!");
            }
        }
        //System.out.println(checkWinner());
        scanner.close();
    }

    public static String checkWinner() {

        int countO = 0, countX = 0;
        for (int i = 0; i < 9; i++) {
            if (flags[i] == 'X') {
                countX++;
            } else if (flags[i] == 'O') {
                countO++;
            }
        }
        boolean matchO = false, matchX = false;
        for (int a = 0; a < 8; a++) {
            int line = 0;
            switch (a) {
                case 0:
                    line = flags[0] + flags[1] + flags[2];
                    break;
                case 1:
                    line = flags[3] + flags[4] + flags[5];
                    break;
                case 2:
                    line = flags[6] + flags[7] + flags[8];
                    break;
                case 3:
                    line = flags[0] + flags[3] + flags[6];
                    break;
                case 4:
                    line = flags[1] + flags[4] + flags[7];
                    break;
                case 5:
                    line = flags[2] + flags[5] + flags[8];
                    break;
                case 6:
                    line = flags[0] + flags[4] + flags[8];
                    break;
                case 7:
                    line = flags[2] + flags[4] + flags[6];
                    break;
            }
            if (line == 264) {
                matchX = true;
            }
            if (line == 237) {
                matchO = true;
            }
        }
        if (!matchX && !matchO && (countO + countX == 9)){
            return "Draw";
        } else if ((countO - countX > 1) || (countX - countO > 1)){
            return "Impossible";
        } else if (matchO & matchX & (countO + countX < 9)){
            return "Impossible";
        } else if (matchX) {
            return "X wins";
        } else if (matchO) {
            return "O wins";
        }
        return "Game not finished";
    }
}