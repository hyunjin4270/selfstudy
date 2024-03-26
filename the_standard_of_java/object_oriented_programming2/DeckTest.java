package the_standard_of_java.object_oriented_programming2;

public class DeckTest {
    public static void main(String[] args) {
        Deck d = new Deck();
        Card c = d.pick(0);
        System.out.println(c);

        d.shuffle();
        c = d.pick();
        System.out.println(c);
    }
    
}
