package chapter7.interfacee.p6;

public class XMLParser implements Parseable {
   
    @Override
    public void parse(String fileName) {
         /* 구문 분석작업을 수행하는 코드를 적는다. */
        System.out.println(fileName + "- XML parsing completed");
    }

}
