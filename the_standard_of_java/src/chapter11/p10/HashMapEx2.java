package chapter11.p10;

import java.util.*;

public class HashMapEx2 {
    public static void main(String[] args) {
        HashMap map = new HashMap();    //Hashmap타입 map에 HashMap()객체 생성 후 참조
        map.put("김자바", 100);         //값 100을 가진 key "김자바"를 map 변수안에 집어넣기
        map.put("이자바", 100);         //값 100을 가진 key "이자바"를 map 변수안에 집어넣기
        map.put("강자바", 80);          //값 80을 가진 key "강자바"를 map 변수안에 집어넣기
        map.put("안자바", 90);          //값 90을 가진 key "안자바"를 map 변수안에 집어넣기

        Set set = map.entrySet();       //map에 저장된 key와 value값을 쌍으로 set변수에 저장
        Iterator it = set.iterator();   //Iterator타입 it에 set을 Iterator값으로 변환 후 저장

        while (it.hasNext()) {                          //it변수의 읽어올 요소가 남아 있을 때 까지
            Map.Entry e = (Map.Entry) it.next();        //키와 값을 쌍으로 나타낼 수 있는 e 변수에 집어넣기
            System.out.println("이름 : " + e.getKey()
                    + ", 점수 : " + e.getValue());
        }
        set = map.keySet();                             //map의 모든 키를 Set형태로 set에 저장
        System.out.println("참가자 명단 : " + set);

        Collection values = map.values();               //map의 모든 값을 Collection형태로 values에 저장
        it = values.iterator();                         //values를 Iteratior형태로 변환 후 it에 대입

        int total = 0;                                  //총점을 계산하기 위한 total변수 생성
        while(it.hasNext()) {
            total += ((Integer) it.next()).intValue();                      //총점에 점수 더하기
        }

        System.out.println("총점 : " + total);
        System.out.println("평균 : " + (float)total / set.size());
        System.out.println("최고점수 : " + Collections.max(values));
        System.out.println("최저점수 : " + Collections.min(values));
    }
}
