abstract class Shape{

abstract int name();

}

class Circle extends Shape{
int CourseName;

 Circle(int courseName){
this.CourseName = CourseName;
}

int name(){
return CourseName+CourseName;
}
}
public class AbstractExample{
public static void main(String[]args){

Circle circles = new Circle(20);
int abc = circles.name();

System.out.println(abc);
}
}