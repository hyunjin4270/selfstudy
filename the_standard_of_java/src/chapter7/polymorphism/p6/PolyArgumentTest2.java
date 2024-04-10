package chapter7.polymorphism.p6;

class PolyArgumentTest2 {
    
    public static void main(String[] args) {
        Buyer2 b = new Buyer2();
        Tv tv = new Tv();
        Computer computer = new Computer();
        Audio audio = new Audio();

        b.buy(tv);
        b.buy(computer);
        b.buy(audio);
        b.summary();
        System.out.println();
        b.refund(computer);
        b.summary();
    }
}
