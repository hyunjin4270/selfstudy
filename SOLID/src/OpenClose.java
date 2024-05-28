public class OpenClose {
    
    /**
     * Angle
     */
    public interface Shape {    //도형의 공용 인터페이스
        double calculateArea();
        
    }
    class Triangle implements Shape{    //삼각형의 정보
        private double width;
        private double height;

        Triangle(int width, int height) {
            this.width = width;
            this.height = height;
        }

        @Override
        public double calculateArea() {
            return (width * height) / 2;
        }

    }
    
    class Rectangle implements Shape{   // 사각형의 정보
        private double width;
        private double height;

        Rectangle(int width, int height) {
            this.width = width;
            this.height = height;
        }

        @Override
        public double calculateArea() {
            return width * height;
        }
    }

    class AreaCalculator {
        public double calculateArea(Shape shape) {
            return shape.calculateArea();
        }
    }
}
