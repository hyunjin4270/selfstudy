package the_standard_of_java.object_oriented_programming;

class TvTest4 {
    public static void main(String[] args) {
        Tv[] tvarr = new Tv[3];

        for (int i = 0; i < tvarr.length; i++) {
            tvarr[i] = new Tv();
            tvarr[i].channel = i + 10;
        }
        for (int i = 0; i < tvarr.length; i++) {
            tvarr[i].channelUp();
            System.out.printf("tvarr[%d].channel=%d%n", i, tvarr[i].channel);
        }
    }
    
}
