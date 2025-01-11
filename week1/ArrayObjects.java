public class ArrayObjects {
    public static void main(String[] args) {
        Student[] students = new Student[3];
        students[0] = new Student("Parth",23);
        students[1] = new Student("John", 21);
        students[2] = new Student("Jane", 25);

        // Call to static method
        Student.display();

        for(Student student : students){
            student.displayStudent();
        }
    }
}

class Student{
    private String name;
    private int age;

    public Student(String name, int age){
        this.name = name;
        this.age = age;   
    }

    static void display(){
        System.out.println("This is a static method");
    }

    void displayStudent(){
        System.out.println("Student name : " + name + "\nStudent's age : " + age);
        }
}
