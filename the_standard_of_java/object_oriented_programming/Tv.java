package the_standard_of_java.object_oriented_programming;

class Tv {
    //Tv�� �Ӽ� (�������)
    String color;
    boolean power;
    int channel;

    //Tv�� ���(�޼���)
    void power() {
        power = !power;     //TV�� �Ѱų� ���� ����� �ϴ� �޼���

    }
    void channelUp() {
        ++channel;          //TV�� ä���� ���̴� ����� �ϴ� �޼���
    }
    void channelDown() {
        --channel;          //TV�� ä���� ���ߴ� ����� �ϴ� �޼���
    }
    
}