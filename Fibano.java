import java.util.Scanner;
class Fibano{

public static void main (String[]args){
	Scanner scan = new Scanner(System.in);
	 int num;

	 System.out.println("Enter a number: ");
	 num = scan.nextInt();
 int num1 = 3;
 int n1 = 0;
 int n2 = 1;

 int sum = 0 ;
 do{
 //for(int i = 0; i<num; i++){
 sum = n1 + n2;
 n2 = n1;
 n1 = sum;
 num++;
 }while(num<=num1);
System.out.println(sum);
}
}