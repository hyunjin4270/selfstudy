package the_standard_of_java.object_oriented_programming1;

public class ReferenceParamEx {
    public static void main(String[] args) {
        Data d = new Data();
        d.x = 10;
        System.out.println("main () : x = " + d.x);
        
        change (d);
        System.out.println("After change(d.x)");
        System.out.println("main () : x = " + d.x);
        
    }
    static void change (Data d) {
        d.x = 1000;
        System.out.println("change() : x = " + d.x);
    }
}
