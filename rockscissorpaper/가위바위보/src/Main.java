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
                        system = false; // ������
                    } else {
                        System.out.println("Wrong answer ");
                    }
                }
              }/*catch (TimeoutException e) {
                boolean system2 = true;
                while (system2) {
                    System.out.println("�ð� ���� �Է� ���� ���Ͽ����ϴ�.");
                    System.out.println("�ٽ� �غ��ðڽ��ϱ�? (yes, no)");
                    String choose = scanner.nextLine();
                    if (choose.equals("yes")) {
                        system2 = false;
                    } 
                    else if (choose.equals("no")) {
                        system = false; // ������
                    } 
                    else {
                        System.out.println("�߸� �Է��ϼ̽��ϴ�.2 ");
                    }
                }
            }*/ catch (WrongInputException e) 
            {
                System.out.println("�߸��� �Է��Դϴ�.");
            } catch (InterruptedException e) 
            {
                System.out.println("���� �߻�!");
            }

        }
        scanner.close();
    }

}