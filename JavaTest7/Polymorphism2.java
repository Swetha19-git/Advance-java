class Number {
    int num;

    Number(int num) {
        this.num = num;
    }

    public int digitSum() {
        int sum = 0;
        int temp = num;
        while (temp > 0) {
            sum += temp % 10;
            temp /= 10;
        }
        return sum;
    }
}

class SpecialNumber extends Number {
    SpecialNumber(int num) {
        super(num);
    }
    int digitSum() {
        int sum = super.digitSum();
        System.out.println("Is palindrome: " + isPalindrome());
        return sum;
    }

    boolean isPalindrome() {
        int temp = num;
        int reverse = 0;
        while (temp > 0) {
            reverse = reverse * 10 + temp % 10;
            temp /= 10;
        }
        return num == reverse;
    }
}
class ArmstrongNumber extends Number {
    ArmstrongNumber(int num) {
        super(num);
    }
    int digitSum() {
        int sum = super.digitSum();
        System.out.println("Is Armstrong number: " + isArmstrong());
        return sum;
    }

    boolean isArmstrong() {
        int temp = num;
        int sum = 0;
        int digit = 0;
        while (temp > 0) {
             digit = temp % 10;
            sum += digit*digit*digit;
            temp /= 10;
        }
        return num == sum;
    }
}

public class Polymorphism2{
    public static void main(String[] args) {
        Number n = new Number(123);
        SpecialNumber s = new SpecialNumber(121);
        ArmstrongNumber a = new ArmstrongNumber(371);

        System.out.println("Sum of digits of number: " + n.digitSum());
        System.out.println("Sum of digits of special number: " + s.digitSum());
        System.out.println("Sum of digits of Armstrong number: " + a.digitSum());
    }
}
