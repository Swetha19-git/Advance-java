class Circle {
    static double PI = 3.14;
    double radius = 5;
    double area() {
        return PI * radius * radius;
    }
}

public class Area {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println("Area of circle: " + circle.area());

       
       Circle.PI = 3.14159; 
    }
}