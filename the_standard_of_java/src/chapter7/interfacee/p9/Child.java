package chapter7.interfacee.p9;

class Child extends Parent implements MyInterface, MyInterface2{
    public void method1() {
        System.out.println("method1() in Child");
    }
}
