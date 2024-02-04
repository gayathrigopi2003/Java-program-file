public class ArrayparameterMethod{


int[]add (int a , int b){
int c [] = new int [9];
 c[0] = a+b;
 c[1] =a-b;
 c[2] =a*b;
return c;
}

public static void main (String[]args){

ArrayparameterMethod m = new ArrayparameterMethod();
int result[] = m.add(4, 8);
System.out.println(result[0]);
System.out.println(result[1]);

System.out.println(result[2]);
}
}