package chapter7.polymorphism.p4;

public class BindingTest3 {

    public static void main(String[] args) {
        Parent p = new Child3();
        Child3 c = new Child3();

        System.out.println("p.x = " + p.x);
        p.method();
        System.out.println();

        System.out.println("c.x = " + c.x);
        c.method();
    }
    
}
