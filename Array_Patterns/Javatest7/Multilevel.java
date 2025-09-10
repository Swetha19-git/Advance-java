
class Animal {
    void sound() {
        System.out.println("The animal called");
    }
}

class Dog extends Animal {
  
    void sound() {
        System.out.println("The dog called");
    }
}

class Puppy extends Dog {
   
    void sound() {
        System.out.println(" The puppy called");
    }
}

public class Multilevel {
    public static void main(String[] args) {
        Puppy obj = new Puppy();
        obj.sound();
    }
}
