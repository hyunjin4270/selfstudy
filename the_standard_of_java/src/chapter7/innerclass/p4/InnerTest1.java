package chapter7.innerclass.p4;

import chapter7.innerclass.p4.InnerEx1.*;   //import

public class InnerTest1 {

    public static void main(String[] args) {
        InnerEx1 i = new InnerEx1();
        InstanceInner ic = i.new InstanceInner();   //인스턴스 클래스 구현
        
        System.out.println(ic.iv);
        System.out.println(ic.cv);
        System.out.println(ic.CONST);
        System.out.println(InnerEx1.StaticInner.cv);
    }
    
}
