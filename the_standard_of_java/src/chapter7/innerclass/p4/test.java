package chapter7.innerclass.p4;

import chapter7.innerclass.p4.InnerEx1.InstanceInner;

public class test {
    
    public static void main(String[] args) {
        InnerEx1 i = new InnerEx1();
        InstanceInner a = i.new InstanceInner();
        System.out.println(a.cv);
        System.out.println(a.CONST);
    }
}
