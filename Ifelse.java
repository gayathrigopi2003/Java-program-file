public class Ifelse{
public static void main(String[]args){
final int votingAge =18;
int userAge = 21;

if(userAge > votingAge){
System.out.println("Eligible");
}
else if(userAge ==votingAge){
System.out.println("Apply for voting.");
System.out.println("Eligible");
}
else{
System.out.println("Not Eligible");
}
// (condition) ? (positive) : (negative)
String result = userAge > votingAge ? "Eligible" : "Not Eligible";
System.out.println(result);

switch(userAge){
case 18:
System.out.println("Eligible");
break;
default:
System.out.println("default block");
}
}
}