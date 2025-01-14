public class Polymorphism {
    public static void main(String[] args) {
        // Compile Time Polymorphism - Static Polymorphism
        Calculator calc = new Calculator();
        System.out.println(calc.add(78, 11));
        System.out.println(calc.add(6.4, 4.7));
        System.out.println(calc.add(23, 45, 56));

        // Run Time Polymorphism - Dynamic Polymorphism
        Animal animal;
        animal = new Animal();
        animal.sound();
        animal = new Dog(); // Upcasting
        animal.sound(); 
        animal = new Cat();
        animal.sound();

        // Downcasting
        Dog dog = (Dog) animal;
        dog.fetch();
        

        // Static method usage for polymorphism
        A obj = new A();
        obj.test(); // A's test method is called
        obj = new B();
        obj.test(); // A's test method is called
    } 
}

class Calculator{
    int add(int a, int b){
        return a+b;
    }
    // Overloading
    double add(double a, double b){
        return a+b;
    }
    // Overloading
    int add(int a, int b, int c){
        return a+b+c;
    }
}

class Animal{
    void sound(){
        System.out.println("Animal makes a sound");
    }

    final void finalMethod(){
        System.out.println("Final method called");
    }
}

class Dog extends Animal{
    @Override
    void sound(){
        System.out.println("Dog barks");
    }

    void fetch(){
        System.out.println("Dog is fetching");
    }

    // Not allowed
    // void finalMethod(){
    //     System.out.println("Dog's final method called");
    // }
}

class Cat extends Animal{
    @Override
    void sound(){
        System.out.println("Cat meows");
    }
}


// Important to note :->

// Static Methods and Polymorphism: Static methods belong to the class, not an instance, so they cannot be overridden. 
// They are hidden if redefined in a subclass.

// Implementation 

class A {
    static void test(){
        System.out.println("A's static test method");
    }
}

class B extends A {
    static void test(){
        System.out.println("B's static test method");
    }
}