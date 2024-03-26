package the_standard_of_java.object_oriented_programming2;

class Circle extends Shape {
    Point center;   //���� ������ǥ
    int r;          //������

    Circle() {
        this(new Point(0, 0), 100);
    }
    Circle(Point center, int r) {
        this.center = center;
        this.r = r;
    }

    void draw() {   //���� �׸��� ��ſ� ���� ������ ����ϵ��� �ߴ�.
        System.out.printf("[center=(%d, %d), r=%d, color=%s]%n", center.x, center.y, r, color);
    }

    
    
}
