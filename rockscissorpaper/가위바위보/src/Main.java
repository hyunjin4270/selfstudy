import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("start");
        boolean system = true;
        while (system) {
            try {
                Thread.sleep(1000);
                System.out.println("rock");
                Thread.sleep(1000);
                System.out.println("scissor");
                Thread.sleep(1000);
                System.out.println("paper!");
                
                
                System.out.print("Player :");
                String input = scanner.nextLine();
                if (!input.equals("scissor") && !input.equals("rock") && !input.equals("paper")) {
                    throw new WrongInputException("");
                }

                String judge = Rule.Whatbehavior(input);
                Rule.getAIbehavior();
                Thread.sleep(1000);
                if (judge.equals("win")) {
                    System.out.println("Player is Win!");
                } else if (judge.equals("due")) {
                    System.out.println("Due");
                } else {
                    System.out.println("Player is lose");
                }

                boolean system2 = true;
                while (system2) {
                    System.out.println("Would you like to try again? (yes, no)");
                    String choose = scanner.nextLine();
                    if (choose.equals("yes")) {
                        system2 = false;
                    } else if (choose.equals("no")) {
                        system = false; // 나가기
                    } else {
                        System.out.println("Wrong answer ");
                    }
                }
              }/*catch (TimeoutException e) {
                boolean system2 = true;
                while (system2) {
                    System.out.println("시간 내로 입력 하지 못하였습니다.");
                    System.out.println("다시 해보시겠습니까? (yes, no)");
                    String choose = scanner.nextLine();
                    if (choose.equals("yes")) {
                        system2 = false;
                    } 
                    else if (choose.equals("no")) {
                        system = false; // 나가기
                    } 
                    else {
                        System.out.println("잘못 입력하셨습니다.2 ");
                    }
                }
            }*/ catch (WrongInputException e) 
            {
                System.out.println("잘못된 입력입니다.");
            } catch (InterruptedException e) 
            {
                System.out.println("예외 발생!");
            }

        }
        scanner.close();
    }

}