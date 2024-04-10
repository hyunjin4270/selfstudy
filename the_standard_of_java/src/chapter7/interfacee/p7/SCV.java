package chapter7.interfacee.p7;

public class SCV extends GroundUnit implements Repairable{
    SCV() {
        super(60);
        hitPoint = MAX_HP;
    }

    public void repair(Repairable r) {
        if (r instanceof Unit) {
            Unit u = (Unit)r;
            while(u.hitPoint != u.MAX_HP) {
                /* Unit�� HP�� ������Ų��. */
                u.hitPoint++;
            }
            System.out.println(u.toString() + "�� ������ �������ϴ�.");
        }
    }
    //...

}
