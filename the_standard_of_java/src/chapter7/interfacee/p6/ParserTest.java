package chapter7.interfacee.p6;

public class ParserTest {

    public static void main(String[] args) {
        Parseable parser = ParserManger.getParser("XML");
        parser.parse("documet.xml");
        parser = ParserManger.getParser("HTML");
        parser.parse("document2.html");
    }
    
}
