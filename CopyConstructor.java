public class CopyConstructor{
    private String name;
    private int age;

    public CopyConstructor() {
    }

 
    public CopyConstructor(String name, int age) {
        this.name = name;
        this.age = age;
    }

  
    public CopyConstructor(CopyConstructor otherPerson) {
       
        this.name = otherPerson.name;
        this.age = otherPerson.age;
    }

       public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public static void main(String[] args) {
      
        CopyConstructor person1 = new CopyConstructor("John", 25);

      
       CopyConstructor person2 = new CopyConstructor(person1);

        System.out.println("Person 1: Name - " + person1.getName() + ", Age - " + person1.getAge());
        System.out.println("Person 2: Name - " + person2.getName() + ", Age - " + person2.getAge());
    }
}

