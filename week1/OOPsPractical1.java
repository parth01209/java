public class OOPsPractical1 {
    public static void main(String[] args) {
        // Creating an object of the class
        // This is implementation of the idea
        Calculator calc = new Calculator(5, 8);
        System.out.println("Addition: " + calc.getSum());
        System.out.println("Product: " + calc.getProduct());
        Calculator.printSomeStuff("A static method");
        System.out.println("Overloaded Call");
        calc.getSum(9, 6, 0);

    }
    
}

class Calculator{
    private int num1;
    private int num2;

    public Calculator(int num1, int num2){
        this.num1 = num1;
        this.num2 = num2;
    }

    // Static method - Do not need any instance (object) to call. Can call directly using class.
    static void printSomeStuff(String str){
        System.out.println(str);
    }

    // This is idea. What this idea is supposed to do and what would be the output
    int getSum(){
        return num1 + num2;
    }

    int getSum(int a, int b, int c){
        return a + b + c;
    }

    // This is idea. What this idea is supposed to do and what would be the output
    int getProduct(){
        return num1 * num2;
    }
}
