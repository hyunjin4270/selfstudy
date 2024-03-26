package the_standard_of_java.object_oriented_programming2;

class Circle extends Shape {
    Point center;   //원의 원점좌표
    int r;          //반지름

    Circle() {
        this(new Point(0, 0), 100);
    }
    Circle(Point center, int r) {
        this.center = center;
        this.r = r;
    }

    void draw() {   //원을 그리는 대신에 원의 정보를 출력하도록 했다.
        System.out.printf("[center=(%d, %d), r=%d, color=%s]%n", center.x, center.y, r, color);
    }

    
    
}
