import java.util.*;

public class Reverseword {
    public static void main(String args[]){
        Scanner c=new Scanner(System.in);
        String s=c.next();
       
        String[] words = s.split(" ");  

        for (String word : words) {
            String reversed = "";

            for (int i = word.length() - 1; i >= 0; i--) {
                reversed += word.charAt(i);
            }

            System.out.print(reversed + " ");
        }
    }
}
