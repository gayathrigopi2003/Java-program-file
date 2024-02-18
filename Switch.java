public class Switch{
public static void main(String[]args){
int num = 4;
String numberInwords ="";
//data types not allowed for cases : boolean, float, double, long
switch(num){
case 0:
numberInwords = "Zero";
break;
case 1:
numberInwords = "one";
break;
case 2:
numberInwords = "two";
break;
case 3:
case 4:
numberInwords = "three";
break;
case 5:
numberInwords = "five";
break;
default:
numberInwords = "no cases matched";
}
System.out.println(numberInwords);
}
}