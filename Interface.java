interface  Animals{
  void eat();
}

 interface  Animals2{
 void sleep();
}


class Dog implements Animals, Animals2{
public void eat(){
System.out.println("Eating the food");
}
public void sleep(){
System.out.println("Sleep is eating foods");
}
}


public class Interface{
public static void main (String[]args){
 
Dog n = new Dog(); 
n.eat();
n.sleep();
}

}