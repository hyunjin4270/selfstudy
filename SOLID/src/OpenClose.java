public class OpenClose {
    
    /**
     * Angle
     */
    public interface Shape {    //������ ���� �������̽�
        double calculateArea();
        
    }
    class Triangle implements Shape{    //�ﰢ���� ����
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
    
    class Rectangle implements Shape{   // �簢���� ����
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
