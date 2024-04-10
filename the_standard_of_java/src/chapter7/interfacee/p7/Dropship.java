package chapter7.interfacee.p7;

public class Dropship extends AirUnit implements Repairable{

    Dropship() {
        super(125);
        hitPoint = MAX_HP;
    }

    @Override
    public String toString() {
        return "Dropship";
    }
    // ...

}
