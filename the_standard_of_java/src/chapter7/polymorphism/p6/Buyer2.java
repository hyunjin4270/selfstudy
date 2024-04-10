package chapter7.polymorphism.p6;

import java.util.Vector;    // VectorŬ������ ����ϱ� ���ؼ� �߰��� �ξ���.

class Buyer2 {          // ��
    int money = 1000;   // �����ݾ�
    int bonusPoint = 0; // ���ʽ�����
    Vector item = new Vector();
    void buy (Product p) {
        if (money < p.price) {
            System.out.println("�ܾ��� �����Ͽ� ������ �� �� �����ϴ�.");
            return;
        }

        money -= p.price;           // ���� ������ ������ ��ǰ�� ������ ����.
        bonusPoint += p.bonusPoint; // ��ǰ�� ���ʽ� ������ �߰��Ѵ�.
        item.add(p);                // ������ ��ǰ�� Vector�� �����Ѵ�.
        System.out.println(p + "��/�� �����ϼ̽��ϴ�.");
    }
    
    void refund(Product p) {
        if(item.remove(p)) {
            money += p.price;
            bonusPoint -= p.bonusPoint;
            System.out.println(p + "��/�� ��ǰ�ϼ̽��ϴ�.");
        } else {                    // ���ſ� �������� ���
            System.out.println("�����Ͻ� ��ǰ �� �ش� ��ǰ�� �����ϴ�.");
        }
    }
    
    void summary() {                // ������ ��ǰ�� ���� ������ ����ؼ� ���� �ش�.
        int sum = 0;                // ������ ��ǰ�� �����հ�
        String itemList = "";       // ������ ��ǰ���
        
        if (item.isEmpty()) {       // Vector�� ����ִ��� Ȯ���Ѵ�.
            System.out.println("�����Ͻ� ��ǰ�� �����ϴ�.");
            return;
            
        }
        
        // �ݺ����� �̿��ؼ� ������ ��ǰ�� �� ���ݰ� ����� �����.
        for (int i = 0; i < item.size(); i++) {
            Product p = (Product) item.get(i);
            sum += p.price;
            itemList += (i == 0) ? "" + p : ", " + p;
            
        }
        System.out.println("�����Ͻ� ��ǰ�� �ѱݾ��� " + sum + "���� �Դϴ�.");
        System.out.println("�����Ͻ� ��ǰ�� " + itemList + "�Դϴ�.");
    }
}
