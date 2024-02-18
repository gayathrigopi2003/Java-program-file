class AnotherClass{

 int VOTING_AGE;
// non-parameterized constructor
 //AnotherClass(){
//}
// parameterized Constructor 
private AnotherClass(int n){
VOTING_AGE = n;
}

String isVotingAge(int age){
	
if(age>=VOTING_AGE)
return "true";

else
return "false";

}
}

class Another{


public static void main(String []args){

AnotherClass m = new AnotherClass();
m.VOTING_AGE(18);
System.out.println(m.isVotingAge(15));
}
}
