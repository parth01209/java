import java.lang.Math;

public class Operators {
    public static void main(String[] args) {

        // Arithmetic Operators
        System.out.println("------------------------- ARITHMETIC OPERATORS -------------------------");

        int num1 = 9;
        int num2 = 8;

        int result = num1 + num2;
        int product = num1 * num2;
        int difference = num1 - num2;
        int quotient = num1 / num2;
        int remainder = num1 % num2;
        int modulus = num1 % num2;
        int exponent = (int) Math.pow(num1, num2);
        int squareRoot = (int) Math.sqrt(num1);
        int cubeRoot = (int) Math.cbrt(num1);
        System.out.println("Addition: " + result);
        System.out.println("Product: " + product);
        System.out.println("Difference: " + difference);
        System.out.println("Quotient: " + quotient);
        System.out.println("Remainder: " + remainder);
        System.out.println("Modulus: " + modulus);
        System.out.println("Exponent: " + exponent);
        System.out.println("Square Root: " + squareRoot);
        System.out.println("Cube Root: " + cubeRoot);

        num1 += 3; // 12 
        num1++; // 13
        ++num1; //14

        int postIncremented  = num1++;
        System.out.println("Post Incremented: " + postIncremented);
        int preIncremented = ++num1; // 16
        System.out.println("Pre Incremented: " + preIncremented);
        System.out.println(num1);

        System.out.println("------------------------- RELATIONAL OPERATORS -------------------------");

        // Relational Operators
        int x = 6;
        int y = 5;

        boolean res = x < y;
        System.out.println(res);
        res = x > y;
        System.out.println(res);
        res = x != y;
        System.out.println(res);
        res = x == y;
        System.out.println(res);
        System.out.println("------------------------- LOGICAL OPERATORS -------------------------");
        // Logical Operators
        int var1 = 3;
        int var2 = 4;
        int var3 = 4;
        int var4 = 6;

        boolean logicalAndRes = (var1 > var2) && (var3 > var4);
        System.out.println(logicalAndRes);
        boolean logicalOrRes = (var1 > var2) || (var3 > var4);
        System.out.println(logicalOrRes);

    }
    
}
