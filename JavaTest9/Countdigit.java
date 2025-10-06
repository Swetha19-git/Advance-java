import java.util.*;

public class Countdigit {
    public static void main(String args[]){
  Scanner sc=new Scanner(System.in);
        String str = sc.next();  

        boolean digits = true;

        for (int i = 0; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i))) {
                digits = false;
                break;
            }
        }

        System.out.println("Contains only digits: " + digits);
    }
}
