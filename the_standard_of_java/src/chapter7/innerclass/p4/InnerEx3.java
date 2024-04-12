package chapter7.innerclass.p4;

public class InnerEx3 {
    private int outerIv = 0;
    static int outerCv = 0;

    class InstanceInner {
        int iiv = outerCv; // 외부 클래스의 private멤버도 접근가능하다.
        int iiv2 = outerCv;

    }

    static class StaticInner {
        int siv = outerCv;
        static int scv = outerCv;
    }

    void myMethod() {
        int lv = 0;
        final int LV = 0;   // JDK1.8부터 final생략 가능

        class LocalInner {
            int liv = outerIv;
            int liv2 = outerCv;
            int liv3 = lv;
            int liv4 = LV;
        }
    }
    
}
