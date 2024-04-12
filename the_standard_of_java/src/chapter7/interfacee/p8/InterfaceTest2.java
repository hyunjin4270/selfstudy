package chapter7.interfacee.p8;

public class InterfaceTest2 {

    public static void main(String[] args) {
        A2 a = new A2();
        a.autoPlay(new B2());   //void autoPlay(I i) 호출
        a.autoPlay(new C2());   //void autoPlay(I i) 호출
    }
    
}
