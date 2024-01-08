public class Voting{
public static void main (String[]args){

final int votingAge = 18;
int userAge = 28;

if(userAge >= votingAge){
System.out.print("Eligible");
}

else if(userAge == votingAge){
System.out.print("Apply for voting.");
System.out.print("Eligible");
}

else{
System.out.print("Not Eligible");
}

//(Condition) ? (positive) : (negative)

String result = userAge > votingAge ? "Eligible" : "Not Eligible";
System.out.print(result);

switch(userAge){
  case 18:
  System.out.print("Eligible");
  break;
  
  default:
  System.out.print("default block");
}
}
}