public class TypeConCast {
    public static void main(String[] args) {
        
        int a = 257;
        byte b = 127;
        System.out.println(a + " "+ b);
    
        // b = a; // This is not allowed as b cannot accomodate anything more than 127. Big in small box
        // a = b; // Conversion. This is allowed. Small in big box
        System.out.println(a);
        byte k = (byte) a;
        System.out.println(k); // Casting 257 % 256

        float f = 4.5f;
        int i = (int) f;
        System.out.println(i);

        byte m = 90;
        byte n = 87;

        int res = m * n;
        System.out.println(res);

        
    }
    
}
