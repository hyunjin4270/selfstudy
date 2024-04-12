package chapter7.interfacee.p9;

interface MyInterface2 {
    default void method1() {
        System.out.println("method1() in MyInterface");
    }
    static void staticMethod() {
        System.out.println("staticMethod() in My Interface2");
    }
}
