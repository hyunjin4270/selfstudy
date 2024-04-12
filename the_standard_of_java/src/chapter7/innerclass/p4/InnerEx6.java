package chapter7.innerclass.p4;

public class InnerEx6 {

    public static void main(String[] args) {
        Outer2 outer = new Outer2();
        Outer2.Inner inner = outer. new Inner();
        inner.method1();
    }
    
}
