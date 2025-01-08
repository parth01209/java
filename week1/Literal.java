public class Literal {
    public static void main(String[] args) {
        int num = 10_00_00_00;
        double num1 = 12e10;
        char c = 'a';
        c++;
        int num2 = 0b1010; // binary rep of 10
        int octalRep = 017; // octal rep of 15

        System.out.println(num1);
        System.out.println(num);
        System.out.println(c);
        System.out.println(num2);
        System.out.println(octalRep);
    }
    
}
