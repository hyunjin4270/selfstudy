package chapter7.polymorphism.p5;

class Tv extends Product{

    Tv() {
        // ����Ŭ������ ������ Product (int price)�� ȣ���Ѵ�.
        super(100); // Tv�� ������ 100�������� �Ѵ�.
    }

    //ObjectŬ������ toString()�� �������̵��Ѵ�.
    @Override
    public String toString() {
        return "Tv";
    }

}
