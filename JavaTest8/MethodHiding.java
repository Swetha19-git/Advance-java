class Parent {
    static void display() {
        System.out.println("Parent display");
    }
}

class Child extends Parent {
    static void display() {
		
        System.out.println("Child display");
    }
}

public class MethodHiding {
    public static void main(String[] args) {
		
        Child.display(); 
        Parent.display();		

        
    }
}