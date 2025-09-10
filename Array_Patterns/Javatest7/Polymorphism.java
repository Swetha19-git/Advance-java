
class Shape {
    double area() {
        return 0;
    }
}


class Circle extends Shape {
    
    double area(radius) {
        return 3.14 * radius * radius;
    }
}

class Rectangle extends Shape {
    double area(double length, double width) {
        return length * width;
    }
}

class Triangle extends Shape {
 
    double area(double base, double height) {
        return 0.5 * base * height;
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape rectangle = new Rectangle();
        Shape triangle = new Triangle();

        System.out.println("Circle area: " + circle.area(4));
        System.out.println("Rectangle area: " + rectangle.area(4,5));
        System.out.println("Triangle area: " + triangle.area(3,4));
    }
}

