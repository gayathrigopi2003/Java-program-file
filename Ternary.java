public class Ternary{
public static void main (String[]args){
int numberTocompare= 5;
for(int i =1; i<=10; i++){
System.out.println(i<numberTocompare ? "less than" + numberTocompare : "greater than" + numberTocompare);
if(i<numberTocompare){
System.out.println("less than" + numberTocompare );
}else if(i == numberTocompare){
System.out.println("equal to" + numberTocompare);
}else{
System.out.println("grater than" + numberTocompare);
}
String res =i<numberTocompare ? "lesser" : (i == numberTocompare ? "equal": "greater");
System.out.println(res);
}
}
}