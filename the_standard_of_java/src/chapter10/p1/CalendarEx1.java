package chapter10.p1;

import java.util.Calendar;

public class CalendarEx1 {
    public static void main(String[] args) { // �⺻������ ���糯¥�� �ð����� �����ȴ�.
        Calendar today = Calendar.getInstance();

        System.out.println("�� ���� �⵵ : " + today.get(Calendar.YEAR));
        System.out.println("��(0 ~ 11) 0:1�� : " + today.get(Calendar.MONTH));
        System.out.println("�� ���� �� ° �� : " + today.get(Calendar.WEEK_OF_YEAR));
        System.out.println("�� ���� �� ° �� : " + today.get(Calendar.WEEK_OF_MONTH));

        // DATE�� DAY_OF_MONTH�� ����.
        System.out.println("�� ���� �� �� : " + today.get(Calendar.DATE));
        System.out.println("�� ���� �� �� : " + today.get(Calendar.DAY_OF_MONTH));
        System.out.println("�� ���� �� �� : " + today.get(Calendar.DAY_OF_YEAR));
        System.out.println("����(1~7), 1:�Ͽ��� : " + today.get(Calendar.DAY_OF_WEEK));
        
    }
    
}
