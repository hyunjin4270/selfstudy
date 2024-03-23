package blackjack;

import java.util.Scanner;

public class BlackJackMain {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        int players;

        while (true) {
            int setting = Rule.start();
            if (setting == 1) {
                players = Rule.gameStart();
                Dealer.drawFirstCard(players);
                while (true) {
                    for (int i = 0; i < players; i++) {
                        Boolean system = true;
                        while (system) {
                            system = false;
                            Thread.sleep(1000);
                            if (Player.bust[i]) {
                                System.out.println("Dealer: Player" + (i + 1) + " turns");
                                System.out.println("(hit, stand, showcard, end)");
                                System.out.print("Player" + (i + 1) + " : ");
                                String choice = scanner.nextLine();
                                if (choice.equals("hit")) {
                                    Rule.draw(i);
                                    Rule.isOver(i);
                                } else if (choice.equals("stand")) {
                                    System.out.println("Dealer : Player" + (i + 1) + " choose stand.");
                                } else if (choice.equals("showcard")) {
                                    Card.showCard(players);
                                    system = true;
                                } else if (choice.equals("end")) {
                                    int dealer = Dealer.drawDealer(players);
                                    Rule.whoIsWinner(players, dealer);
                                    System.exit(0);
                                } else {
                                    System.out.println("Dealer : Wrong answer");
                                    system = true;
                                }
                            }
                            if (Player.bustPlayer == players) {
                                System.out.println("Dealer : All players busted.");
                                System.exit(0);
                            }
                        }
                    }
                }
            } else if (setting == 2) {
                Rule.showRules();
            } else if (setting == 3) {
                Rule.exit();
            } else {
                System.out.println("Dealer : Wrong answer");
            }
        }
    }
}
