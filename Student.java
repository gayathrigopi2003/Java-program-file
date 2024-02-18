 public class Student{
    private int id;
    private String name;
    private char grade;
    private String address;

   public void setName(String name){
   // this.id = id;
   this.name = name;
  // this.grade = grade;
   // this.address = address;
     }

     public String getName(){
     return name;
    }

    public static void main(String[]args){
    Student N = new Student();
    N.setName("gayu");
    N.getName();

    }
 }