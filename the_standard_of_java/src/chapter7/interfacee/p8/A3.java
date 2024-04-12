package chapter7.interfacee.p8;

public class A3 {
    void methodA() {
        I3 i = InstanceManager.getInstance();
        i.methodB();
        System.out.println(i.toString());
    }
}
