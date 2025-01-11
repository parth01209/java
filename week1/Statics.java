public class Statics {
    public static void main(String[] args) {
        Example obj1 = new Example();
        Example obj2 = new Example();

        obj1.increment();
        obj2.increment();

        Example.displayCount();

        System.out.println(Example.sum(7, 8)) ;
        System.out.println(Example.product(1, 2)) ;
        System.out.println(Example.staticVar);
    }
}


class Example {
    static int count = 0;
    static int staticVar; // static variable. This cannot be declared inside a static block

    public void increment(){
        count++;
    }

    public static void displayCount(){
        System.out.println("Count: " + count);
    }

    static int sum(int a, int b){
        return a + b;
    }

    static int product(int a, int b){
        return a * b;
    }

    static{
        System.out.println("Static block executed");
         staticVar = 909;
    }
}


// A static variable is shared among all instances of a class.
// All objects of the class refer to the same memory location for a static variable.

// Static variables can be accessed without creating an instance of the class, using the class name.

// Stored in :-
// 1. Stored in method area
// 2. Shared by all instances of the class
// 3. Memory allocated only once when class is loaded into memory by ClassLoader