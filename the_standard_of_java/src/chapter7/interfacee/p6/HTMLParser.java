package chapter7.interfacee.p6;

public class HTMLParser implements Parseable{

    @Override
    public void parse(String fileName) {
         /* ���� �м��۾��� �����ϴ� �ڵ带 ���´�. */ 
         System.out.println(fileName + "-HTML parsing completed.");
    }

}
