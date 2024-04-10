package chapter7.interfacee.p6;

public class ParserManger {
    // 리턴타입이 Parseable인터페이스이다.
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
