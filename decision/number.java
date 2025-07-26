import java.util.Scanner;

 class number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

System.out.print("Enter number: ");

int number = sc.nextInt();

switch(number){
case 1:
System.out.print("Today is sunday ");
break;
case 2:
System.out.print("Today is Monday ");
break;
case 3:
System.out.print("Today is Tuesday");
break;
case 4:
System.out.println("Today is Wednesday");
break;
case 5:
System.out.println(" Today is Thursday");
break;
case 6:
System.out.println("Today is Friday");
break;
case 7:
System.out.println("Today is saturday");
break;
default:
System.out.println("Invalid number");
}
}
}

