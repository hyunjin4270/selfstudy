package the_standard_of_java.object_oriented_programming2;

class CaptionTvTest {
    public static void main(String[] args) {
        CaptionTv ctv = new CaptionTv();
        ctv.channel = 10;
        ctv.channelUp();
        System.out.println(ctv.channel);
        ctv.displayCaption("Hello World!");
        ctv.caption = true;
        ctv.displayCaption("Hello World!");

    }
    
}
