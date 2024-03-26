package the_standard_of_java.object_oriented_programming2;

class CaptionTv extends Tv {
    boolean caption;    //д╦╪г╩Себ (on/off)
    void displayCaption (String text) {
        if (caption) {
            System.out.println(text);
        }
    }
 }
