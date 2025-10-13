class Vehicle{
    String color;
    int speed;
    
    Vehicle(String color, int speed){
        this.color=color;
        this.speed=speed;
    }
    public void display(){
        System.out.println("color is "+color + " speed is "+speed );
    }
}

class Car extends Vehicle{
    int model;
    String brand;
    
    Car(int model, String brand,String color,int speed){
        super(color,speed);
        this.model=model;
        this.brand=brand;
    }
    public void display(){
        super.display();
        System.out.println("moded is "+model + " brand is "+brand );
    }
}

public class Inheritance {
    public static void main(String args[]){
        Car c=new Car(10,"nano","red",153);
        c.display();
        
    }
    
}
