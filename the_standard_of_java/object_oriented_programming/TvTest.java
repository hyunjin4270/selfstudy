package the_standard_of_java.object_oriented_programming;

class TvTest {
    public static void main(String[] args) {
        Tv t;           //Tv�ν��Ͻ��� �����ϱ� ���� ���� t�� ����
        t = new Tv();   //Tv�ν��Ͻ��� �����Ѵ�
        t.channel = 7;  //Tv�ν��Ͻ��� ������� channel�� ���� 7�� �ʱ�ȭ
        t.channelDown();//Tv�ν��Ͻ��� �޼��� channelDown() �� ȣ���Ѵ�
        System.out.println("���� ä���� " + t.channel + " �Դϴ�.");
        
        
    }
    
}
