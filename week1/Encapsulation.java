public class Encapsulation {
    public static void main(String[] args) {
        Student student = new Student("Parth", 22);
        // student.setAge(20);
        // student.setName("John");
        System.out.println(student.getAge());
        System.out.println(student.getName());

        new Calculator().add(2, 3); // Anonymous objects
    }

    
}

// Class for anonymous object
class Calculator{
    public void add(int a, int b){
        System.out.println("Sum is: "+(a+b));
    }
}

class Student{
    private String name;
    int age;

    public Student(){
        name= "John Doe";
        age = 20;
    }

    public Student(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        if (age > 0){
            this.age = age;
        }
        else{
            System.out.println("Invalid age");
        }
    }
}
