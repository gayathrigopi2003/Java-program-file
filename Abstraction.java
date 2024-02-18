// Abstraction = data hiding 

 abstract class Animals{
 abstract void ();
 void eat(){
 System.out.println("eat");
}
 }
class Dog extends Animals{
 void sleep(){
System.out.println("sleep");
}
}

public class Abstraction{

public static void main (String[]args){

new Dog.sleep();
new Dog.eat();
}
}