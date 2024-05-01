import java.util.Random;

public class Rule {
    private Rule() {
    }

    static String Whatbehavior(String behavior) {
        Player.setRSP(behavior);
        Rule.AI.playbehavior();
        return WhoIsWinner();
    }

    static String WhoIsWinner() {
        if (Player.getRSP() == 1) {
            if (Rule.AI.getRSP() == 2) {
                return "win";
            } else if (Rule.AI.getRSP() == 1) {
                return "due";
            } else {
                return "lose";
            }
        } else if (Player.getRSP() == 2) {
            if (Rule.AI.getRSP() == 3) {
                return "win";
            } else if (Rule.AI.getRSP() == 2) {
                return "due";
            } else {
                return "lose";
            }
        } else if (Player.getRSP() == 3) {
            if (Rule.AI.getRSP() == 1) {
                return "win";
            } else if (Rule.AI.getRSP() == 3) {
                return "due";
            } else {
                return "lose";
            }
        }
        return null;
    }

    static void getAIbehavior() {
        if (Rule.AI.getRSP() == 1) {
            System.out.println("Guest: rock");
        } else if (Rule.AI.getRSP() == 2) {
            System.out.println("Guest: scissor");
        } else if (Rule.AI.getRSP() == 3) {
            System.out.println("Guest: paper");
        }
    }

    private static class Player {
        private static int RSP = 0;
        // 1 = rock, 2 = scissor, 3 = paper

        private static void setRSP(String str) {
            if (str.equals("rock")) {
                RSP = 1;
                Rule.AI.PlusPaperPoint();
            } else if (str.equals("scissor")) {
                RSP = 2;
                Rule.AI.PlusRockPoint();
            } else if (str.equals("paper")) {
                RSP = 3;
                Rule.AI.PlusScissorPoint();
            }
        }

        private static int getRSP() {
            return RSP;
        }

    }

    private static class AI {
        private static Random random = new Random();
        private static int RSP = 0;
        private static int rockPoint = 10;
        private static int scissorPoint = 10;
        private static int paperPoint = 10;
        private static int rockBehavior = 0;
        private static int scissorBehavior = 0;
        private static int paperBehavior = 0;

        private static void playbehavior() {
            boolean system = true;
            while (system) {
                rockBehavior = (random.nextInt(30) + 1) + rockPoint;
                scissorBehavior = (random.nextInt(30) + 1) + scissorPoint;
                paperBehavior = (random.nextInt(30) + 1) + paperPoint;
                System.out.println(rockPoint);
                System.out.println(scissorPoint);
                System.out.println(paperPoint);
                if (rockBehavior == scissorBehavior || rockBehavior == paperBehavior
                        || scissorBehavior == paperBehavior) {
                    system = true;

                } else {
                    system = false;
                }
            }
            if (rockBehavior > scissorBehavior) {
                if (rockBehavior > paperBehavior) {
                    RSP = 1;
                }
            }
            if (scissorBehavior > rockBehavior) {
                if (scissorBehavior > paperBehavior) {
                    RSP = 2;
                }
            }
            if (paperBehavior > rockBehavior) {
                if (paperBehavior > scissorBehavior) {
                    RSP = 3;
                }
            }
        }

        private static void PlusRockPoint() {
            rockPoint += 2;
            scissorPoint -= 1;
            paperPoint -= 1;
        }

        private static void PlusScissorPoint() {
            rockPoint -= 1;
            scissorPoint += 2;
            paperPoint -= 1;
        }

        private static void PlusPaperPoint() {
            rockPoint -= 1;
            scissorPoint -= 1;
            paperPoint += 2;
        }

        public static int getRSP() {
            return RSP;
        }
    }
}
