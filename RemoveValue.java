 public class RemoveValue{
 
 public static void main(String[]args){
 
 int oldArr[] = {5, 6, 7, 8};
 int indexToBeRemoved = 1;
 int newArr[] = new int[oldArr.length-1];
 
 
 for(int i=0; i<oldArr.length; i++){
	 
 if(i!=indexToBeRemoved){
 newArr[i] = oldArr[1];
 i++;
 }
  for(int j=0; j<newArr.length; j++){
 System.out.println(newArr[j]);
 }

 }
 }
 }                           