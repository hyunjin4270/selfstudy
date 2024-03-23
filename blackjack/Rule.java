package blackjack;

import java.util.Arrays;
import java.util.Scanner;

public class Rule {
    //초기화면
    static int start() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("==================================");
        System.out.println("1.start     2.rules         3.exit");
        System.out.println("==================================");
        return scanner.nextInt();
    }

    //1. 게임 시작
    static int gameStart() throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        Card.shuffle();

        while (true) {
            System.out.print("Player : ");
            int playerNum = scanner.nextInt();
            scanner.nextLine();

            if (playerNum >= 2 && playerNum <= 8) {
                Player.cardSum = new int[playerNum];
                Player.bust = new Boolean[playerNum];
                Player.card = new String[playerNum][11];
                Player.count = new int[playerNum];
                Arrays.fill(Player.bust, true);
                System.out.println("Player : " + playerNum + ", Start");
                Thread.sleep(3000);
                for (int i = 0; i < playerNum; i++) {
                    for (int j = 1; j <= 2; j++) {

                        int[] card = Card.draw();
                        Player.card[i][Player.count[i]] = Card.completedCard(Card.whatCard(card[0]), Card.whatCardNum(card[1]));
                        Player.cardSum[i] += Card.sumScore(i, card[1]);
                        Player.count[i]++;
                        System.out.print("Player" + (i + 1));
                        System.out.print(" Card" + j + " : " + Card.completedCard(Card.whatCard(card[0]), Card.whatCardNum(card[1])));
                        System.out.println();
                        Thread.sleep(1000);
                    }
                    if (Player.cardSum[i] == 21) {
                        Thread.sleep(2000);
                        BlackJack(i);
                    } else {
                        System.out.println();
                    }
                }
                return playerNum;
            } else if (playerNum < 2) {
                System.out.println("Player can`t below 2");
            } else {
                System.out.println("Player can`t over 8");
            }
        }
    }

    //2. rules
    static void showRules() {
        System.out.println("    -Rule-");
        System.out.println();
        System.out.println("yes        - Answer Yes");
        System.out.println("No         - Answer No");
        System.out.println("hit        - Draw the card");
        System.out.println("stand      - SKip the card ");
        System.out.println("showcard   - Show the player's card.");
        System.out.println("yes        - Answer Yes");
        System.out.println("No         - Answer No");
    }

    //3. exit
    static void exit() {
        System.out.println("close BlackJack");
        System.exit(0);
    }

    //카드 드로우
    static void draw(int a) throws InterruptedException {
        int[] card = Card.draw();
        Player.card[a][Player.count[a]] = Card.completedCard(Card.whatCard(card[0]), Card.whatCardNum(card[1]));
        Player.cardSum[a] += Card.sumScore(a, card[1]);
        Player.count[a]++;
        Thread.sleep(2000);
        System.out.println("Player" + (a + 1) + " Card" + Player.count[a] + " : " + Card.completedCard(Card.whatCard(card[0]), Card.whatCardNum(card[1])));
        System.out.println();
    }

    //인슈어런스
    static void Insurance(int players) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        Boolean system = true;
        Boolean[] playerInsurance = new Boolean[players];
        int count = 0;

        System.out.println("Dealer : Insurance?");
        //플레이어 인슈어런스 응답
        for (int i = 0; i < players; i++) {
            while (system) {
                system = false;
                System.out.print("Player" + (i + 1) + " : ");
                String[] answer = new String[players];
                answer[i] = scanner.nextLine();
                if (answer[i].equals("yes")) {
                    playerInsurance[i] = true;
                    count++;
                } else if (answer[i].equals("no")) {
                    playerInsurance[i] = false;
                } else {
                    System.out.println("Dealer : Wrong answer");
                    Thread.sleep(1000);
                    System.out.println("Dealer : Insurance?");
                    system = true;
                }
            }
            system = true;
        }
        //플레이어 인슈어런스 응답전달
        Thread.sleep(1000);
        System.out.print("Dealer : ");
        for (int i = 0; i < players; i++) {
            if (playerInsurance[i]) {
                System.out.print("Player" + (i + 1));
                if (i < (count - 1)) {
                    System.out.print(", ");
                }
            }

        }
        if (count != 0) {
            System.out.println(" responded insurance.");
            Thread.sleep(3000);
            Dealer.judgeInsurance(players, playerInsurance);
        } else {
            System.out.println("Nobody Insurance");
        }
    }

    //버스트
    static void isOver(int player) {
        if (Player.cardSum[player] > 21) {
            System.out.println("Dealer : Player" + (player + 1) + " is over 21.");
            Player.bust[player] = false;
            Player.bustPlayer++;
        }
    }

    //블랙잭
    static void BlackJack(int players) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dealer : Player" + (players + 1) + " made BlackJack");
        System.exit(0);
    }

    //우승자 가려내기
    static void whoIsWinner(int players, int dealer) throws InterruptedException {
        int[] winner = new int[players];
        Thread.sleep(3000);
        Arrays.fill(winner, dealer);
        for (int i = 0; i < players; i++) {
            if (!Player.bust[i]) {
                Player.cardSum[i] = 0;
            }
            winner[i] -= Player.cardSum[i];
            winner[i] = Math.abs(winner[i]);
        }
        int number = winner[0];
        int finalWinner = 0;
        for (int i = 0; i < players; i++) {
            if (number < winner[i]) {
                number = winner[i];
                finalWinner = i;
            }
        }
        System.out.println("Dealer : Player" + (finalWinner + 1) + " is winner");
        for (int i = 0; i < players; i++) {
            System.out.println(winner[i]);
            
        }
    }
}
