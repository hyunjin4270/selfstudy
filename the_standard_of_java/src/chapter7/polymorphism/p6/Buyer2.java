package chapter7.polymorphism.p6;

import java.util.Vector;    // Vector클래스를 사용하기 위해서 추가해 두었다.

class Buyer2 {          // 고객
    int money = 1000;   // 소유금액
    int bonusPoint = 0; // 보너스점수
    Vector item = new Vector();
    void buy (Product p) {
        if (money < p.price) {
            System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
            return;
        }

        money -= p.price;           // 가진 돈에서 구입한 제품의 가격을 뺀다.
        bonusPoint += p.bonusPoint; // 제품의 보너스 점수를 추가한다.
        item.add(p);                // 구입한 제품을 Vector에 저장한다.
        System.out.println(p + "을/를 구입하셨습니다.");
    }
    
    void refund(Product p) {
        if(item.remove(p)) {
            money += p.price;
            bonusPoint -= p.bonusPoint;
            System.out.println(p + "을/를 반품하셨습니다.");
        } else {                    // 제거에 실패했을 경우
            System.out.println("구입하신 제품 중 해당 제품이 없습니다.");
        }
    }
    
    void summary() {                // 구매한 물품에 대한 정보를 요약해서 보여 준다.
        int sum = 0;                // 구입한 물품의 가격합계
        String itemList = "";       // 구입한 물품목록
        
        if (item.isEmpty()) {       // Vector가 비어있는지 확인한다.
            System.out.println("구입하신 제품이 없습니다.");
            return;
            
        }
        
        // 반복문을 이용해서 구입한 물품의 총 가격과 목록을 만든다.
        for (int i = 0; i < item.size(); i++) {
            Product p = (Product) item.get(i);
            sum += p.price;
            itemList += (i == 0) ? "" + p : ", " + p;
            
        }
        System.out.println("구입하신 물품의 총금액은 " + sum + "만원 입니다.");
        System.out.println("구입하신 제품은 " + itemList + "입니다.");
    }
}
