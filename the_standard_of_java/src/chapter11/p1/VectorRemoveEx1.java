package chapter11.p1;

import java.util.Vector;

public class VectorRemoveEx1 {
    public static void main(String[] args) {
        Vector v = new Vector(7);
        v.add("0");
        v.add("1");
        v.add("2");
        v.add("3");
        v.add("4");
        System.out.println("==== remove(2) 이전 ====");
        print(v);


        v.remove(2);
        System.out.println("==== remmove(2) 이후 ====");
        print(v);

    }
    static void print (Vector v) {
        System.out.println(v);
        System.out.println("size : " + v.size());
        System.out.println("capacity : " + v.capacity());
    }
}
