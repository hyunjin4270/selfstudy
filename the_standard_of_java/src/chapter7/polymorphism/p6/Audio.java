package chapter7.polymorphism.p6;

public class Audio extends Product{
    Audio() {
        super(50);
    }

    @Override
    public String toString() {
        return "Audio";
    }
}
