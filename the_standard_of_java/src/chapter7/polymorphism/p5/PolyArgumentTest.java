package chapter7.polymorphism.p5;

class PolyArgumentTest {
    
    public static void main(String[] args) {
        Buyer b = new Buyer();

        b.buy(new Tv());
        b.buy(new Computer());

        System.out.println("���� ���� ���� " + b.money + "�����Դϴ�.");
        System.out.println("���� ���ʽ������� " + b.bonusPoint + "�� �Դϴ�.");
    }
}