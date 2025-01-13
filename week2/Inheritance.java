import java.util.Scanner;

// Single Inheritance
class Animal{
    void eat(String name){
        System.out.println(name + " is Eating...");
    }
}

class Dog extends Animal{
    void bark(String name){
        System.out.println(name + " is Barking...");
    }
}

// Multilevel Inheritance

class vehicle {
    void move(){
        System.out.println("Vehicle is Moving...");

    }
}

class motorcycle extends vehicle{
    String brand = "Yamaha";
    void skid(){
        System.out.println("Motorcycle is Skidding...");
    }
}

class sportsbike extends motorcycle{
    String brand = "Honda";
    void skid(){
        super.skid();
        System.out.println("Sports Bike is Skidding...");
    }
    void speed(){
        System.out.println("Sports Bike is Speeding...");
    }

    void showType(){
        System.out.println(brand + " - Sportsbike");
        System.out.println(super.brand + " - Motorcycle");
    }
}

// Method Overriding 
class Parent {
    void display(){
        System.out.println("Parent Class Method");
    }
}

class Child extends Parent{
    @Override
    void display(){
        System.out.println("Child Class Method");
        }
    }

public class Inheritance{
    public static void main(String[] args) {
        Dog bunny = new Dog();
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        bunny.bark(name);
        bunny.eat(name);

        // Multilevel Inheritance
        sportsbike sb = new sportsbike();
        sb.speed();
        sb.skid();
        sb.move();

        // Method Overriding
        Parent p = new Child(); // 1. Upcasting. 2. Dynamic method dispatch - method to be executed is determined at runtime
        // p stored in stack. Child object is created in Heap
        p.display();
        
        sc.close();
    }
}