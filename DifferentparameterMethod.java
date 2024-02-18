public class DifferentparameterMethod{

int add(int a , int b){
int c = a+b;
return c;
}
void add(String a){
System.out.println(a);
}

public static void main (String []args){

 DifferentparameterMethod m = new  DifferentparameterMethod();
 int result = m.add(4,6);
 System.out.println(result);
  m.add("Gayu");

}
}