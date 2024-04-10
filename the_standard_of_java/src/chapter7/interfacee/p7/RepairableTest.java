package chapter7.interfacee.p7;

class RepairableTest {

    public static void main(String[] args) {
        Tank tank = new Tank();
        Dropship dropship = new Dropship();

        Marine marine = new Marine();
        SCV scv = new SCV();

        scv.repair(tank);   //SCV�� Tank�� �����ϵ��� �Ѵ�.
        scv.repair(dropship);
        //scv.repair(marine); ����- repair(Repairable) in SCV cannot be applied to (Marine)
    }
    
}
