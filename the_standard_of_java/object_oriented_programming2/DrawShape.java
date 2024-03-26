package the_standard_of_java.object_oriented_programming2;

class DrawShape {
    public static void main(String[] args) {
        Point[] p = {
            new Point (100, 100),
            new Point (140, 50),
            new Point (200, 100)
        };
        Triangle t = new Triangle(p);
        Circle c = new Circle (new Point(150, 150), 50);

        t.draw();   //삼각형을 그린다
        c.draw();   //원을 그린다
    }
    
}
