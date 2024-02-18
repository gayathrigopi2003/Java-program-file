class SumofDigits{

public static void main (String[]args){
int a  = 5;
int b;
int num = 0;
while(a != 0){

b = a% 10;
num = num + b;
a = a/10;
 
}
System.out.println(num);
}
}
