class Students {
    static int count = 0;

    Students() {
        count++;
    }
}

public class Student {
    public static void main(String[] args) {
        Students s1 = new Students();
        Students s2 = new Students();
        Students s3 = new Students();

        System.out.println("Total students: " + Students.count);
    }
}