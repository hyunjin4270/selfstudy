package chapter7.interfacee.p6;

public class XMLParser implements Parseable {
   
    @Override
    public void parse(String fileName) {
         /* ���� �м��۾��� �����ϴ� �ڵ带 ���´�. */
        System.out.println(fileName + "- XML parsing completed");
    }

}
