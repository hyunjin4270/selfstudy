package the_standard_of_java.object_oriented_programming2;

public class TVCR extends Tv {
    VCR vcr = new VCR();
    
    void play() {
        vcr.play();
    }
    void rew() {
        vcr.rew();
    }
    void ff() {
        vcr.ff();
    }
}
