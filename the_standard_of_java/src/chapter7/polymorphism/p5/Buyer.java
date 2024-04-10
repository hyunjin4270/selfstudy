package chapter7.polymorphism.p5;

class Buyer {           // ��
    int money = 1000;   // �����ݾ�
    int bonusPoint = 0; // ���ʽ�����

    void buy (Product p) {
        if (money < p.price) {
            System.out.println("�ܾ��� �����Ͽ� ������ �� �� �����ϴ�.");
            return;
        }

        money -= p.price;           // ���� ������ ������ ��ǰ�� ������ ����.
        bonusPoint += p.bonusPoint; // ��ǰ�� ���ʽ� ������ �߰��Ѵ�.
        System.out.println(p + "��/�� �����ϼ̽��ϴ�.");
    }
}
