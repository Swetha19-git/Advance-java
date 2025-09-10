class Person {
    String name;
    int age;

 Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
class Student extends Person {
    int roll_no;

    Student(String name, int age, int roll_no) {
        super(name, age);
        this.roll_no = roll_no;
    }
    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Roll No: " + roll_no);
    }
}
public class SingleInheritence {
    public static void main(String[] args) {
        Student obj = new Student("Swetha", 20, 123);
        obj.displayDetails();
    }
}
