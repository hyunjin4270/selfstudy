package blackjack;

public class Dealer {
    static int cardSum = 0;
    private static int count = 0;
    static String[] cards = new String[12];
    //첫번째 카드
    static void drawFirstCard(int players) throws InterruptedException {
        Thread.sleep(2000);
        int[] card = Card.draw();
        cards[count] = Card.completedCard(Card.whatCard(card[0]), Card.whatCardNum(card[1]));
        cardSum += sumScore(card[1]);
        count++;
        System.out.println("Dealer : Card" + count + " : " + Card.completedCard(Card.whatCard(card[0]), Card.whatCardNum(card[1])));

        if (Card.whatCardNum(card[1]).equals("A")) {
            Rule.Insurance(players);

        }
    }

    //두번째 카드(insurance)
    static void judgeInsurance(int players, Boolean[] playerInsurance) throws InterruptedException {
        int[] card = Card.draw();
        cards[1] = Card.completedCard(Card.whatCard(card[0]), Card.whatCardNum(card[1]));
        count++;
        System.out.println("Dealer : Card2 : " + Card.completedCard(Card.whatCard(card[0]), Card.whatCardNum(card[1])));
        Thread.sleep(3000);

        if (card[1] >= 10) {

            for (int i = 0; i < players; i++) {

                if (playerInsurance[i]) {

                    System.out.print("Player" + (i + 1));

                    if (i < (players - 1)) {
                        System.out.print(", ");

                    }
                }
            }
            System.out.println(" successes insurance");

        } else {

            for (int i = 0; i < players; i++) {

                if (playerInsurance[i]) {

                    System.out.print("Player" + (i + 1));

                    if (i < (players - 1)) {

                        System.out.print(", ");

                    }
                }
            }
            System.out.println(" failed insurance");

        }
    }

    //딜러 드로우
    static int drawDealer(int players) throws InterruptedException {
        System.out.println("Dealer : all player ended");
        Thread.sleep(2000);

        while (cardSum < 17) {
            int[] card = Card.draw();
            cards[count] = Card.completedCard(Card.whatCard(card[0]), Card.whatCardNum(card[1]));
            cardSum += sumScore(card[1]);
            count++;
            System.out.println("Dealer Card" + (count + 1) + " : " + Card.completedCard(Card.whatCard(card[0]), Card.whatCardNum(card[1])));
            Thread.sleep(2000);

        }
        System.out.println("Dealer Score : " + cardSum);
        return cardSum;

    }

    //점수 더하기
    private static int sumScore(int card) {
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
            case 10, 11, 12 -> { return 10;
            }
            default -> {
                return 10;
            }
        }
    }

}
