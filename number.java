import java.util.Scanner;

 class numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

System.out.print("Enter numbers: ");
String num = sc.next();
for(int i=0; i<num.length();i++){
char ch= num.charAt(i);
switch(ch){
case '1':
System.out.print("one ");
break;
case '2':
System.out.print("two ");
break;
case '3':
System.out.print("three");
break;
case'4':
System.out.println("four");
break;
case '5':
System.out.println("five");
break;
default:
System.out.println("enter");
}
}
}
}

