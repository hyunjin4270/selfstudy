package chapter7.polymorphism.p2;


public class CastingTest1 {
    
    public static void main(String[] args) {
        Car car = null;
        FireEngine fe = new FireEngine();
        FireEngine fe2 = null;

        fe.water();
        car = fe;   // car = (Car)fe;���� ����ȯ�� ������ ���´�.
        //car.water(); ������ ���� CarŸ���� ���������δ� water()�� ȣ���� �� ����.
        fe2 = (FireEngine)car;  // �ڼ�Ÿ�� <- ����Ÿ��
        fe2.water();
        }
}
