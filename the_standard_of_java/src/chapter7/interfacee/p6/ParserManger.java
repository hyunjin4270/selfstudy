package chapter7.interfacee.p6;

public class ParserManger {
    // ����Ÿ���� Parseable�������̽��̴�.
    public static Parseable getParser(String type) {
        if (type.equals("XML")) {
            return new XMLParser();
        } else {
            Parseable p = new HTMLParser();
            return p;
            // return new HTMLParser();
        }

    }
    
}
