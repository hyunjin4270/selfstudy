package chapter7.polymorphism.p6;

class Computer extends Product {

    Computer() {
        super(200);
    }

    @Override
    public String toString() {
        return "Computer";
    }
}
