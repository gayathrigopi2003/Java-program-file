import java.util.Scanner; 

public class ScannerEx{
public static void main (String[]args){

Scanner scan = new Scanner(System.in);
int i=0;
while(i<=10){
System.out.println("name:");
String str = scan.nextLine();

System.out.println("age:");
int n = scan.nextInt();

System.out.println("isMarried");
boolean b = scan.nextBoolean();
i++;

String s = scan.nextLine();

System.out.println("1."+str );
System.out.println("2."+n);
System.out.println("3."+b);
}

}
}tr