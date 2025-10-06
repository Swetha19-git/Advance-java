import java.util.*;
public class Nonrepeating {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter sstring");
        
        String s=sc.next();
        char ch[]=s.toCharArray();
      
        
        for(int i=0;i<ch.length;i++){
            int count=0;
            for(int j=0;j<ch.length;j++){
                if(i!=j){
                    if(ch[i]==ch[j]){
                        count++;
                    }
                }
            }
            if(count==0){
                System.out.println("First non repeating character is: "+ch[i]);
                break;
            }
        }
        
    }
    
}
