package blackjack;

import java.util.Random;

public class Card {
    private static int[][] card = new int[4][13];

    static void shuffle() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 12; j++) {
                card[i][j] = 1;
            }
        }
    }

    static String whatCard(int a) {
        return switch (a) {
            case 0 -> "Diamond";
            case 1 -> "Clover";
            case 2 -> "Heart";
            default -> "Spade";
        };
    }

    static String whatCardNum(int a) {
        return switch (a) {
            case 0 -> "A";
            case 1 -> "2";
            case 2 -> "3";
            case 3 -> "4";
            case 4 -> "5";
            case 5 -> "6";
            case 6 -> "7";
            case 7 -> "8";
            case 8 -> "9";
            case 9 -> "10";
            case 10 -> "K";
            case 11 -> "Q";
            default -> "J";
        };
    }

    static String completedCard(String a, String b) {
        return a + " " + b;
    }

    static int[] draw() {
        Random random = new Random();
        while (true) {
            int randCard = random.nextInt(4);
            int randCardNum = random.nextInt(12);
            if (card[randCard][randCardNum] == 1) {
                card[randCard][randCardNum] = 0;
                return new int[]{randCard, randCardNum};
            }

        }


    }

    static int sumScore(int players, int card) {
        switch (card) {
            case 1 -> {
                return 2;
            }
            case 2 -> {
                return 3;
            }
            case 3 -> {
                return 4;
            }
            case 4 -> {
                return 5;
            }
            case 5 -> {
                return 6;
            }
            case 6 -> {
                return 7;
            }
            case 7 -> {
                return 8;
            }
            case 8 -> {
                return 9;
            }
            case 9, 10, 11, 12 -> { return 10;
            }
            default -> {
                if (Player.cardSum[players] > 10) {
                    return 1;
                } else {
                    return 10;
                }
            }
        }
    }


    static void howMuchAce(int a) {

    }

    static void showCard(int players) {
        System.out.println();
        for (int i = 0; i < players; i++) {
            System.out.print("Player" + (i + 1) + " : ");
            for (int j = 0; j < Player.count[i]; j++) {
                System.out.print(Player.card[i][j]);
                if (j < (Player.count[i]) - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

}
