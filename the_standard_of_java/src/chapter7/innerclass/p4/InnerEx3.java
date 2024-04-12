package chapter7.innerclass.p4;

public class InnerEx3 {
    private int outerIv = 0;
    static int outerCv = 0;

    class InstanceInner {
        int iiv = outerCv; // �ܺ� Ŭ������ private����� ���ٰ����ϴ�.
        int iiv2 = outerCv;

    }

    static class StaticInner {
        int siv = outerCv;
        static int scv = outerCv;
    }

    void myMethod() {
        int lv = 0;
        final int LV = 0;   // JDK1.8���� final���� ����

        class LocalInner {
            int liv = outerIv;
            int liv2 = outerCv;
            int liv3 = lv;
            int liv4 = LV;
        }
    }
    
}
