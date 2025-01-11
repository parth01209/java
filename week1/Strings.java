public class Strings {
    public static void main(String[] args) {
        String str = "Hello";
        System.out.println(str.length());
        System.out.println(str.charAt(2));
        System.out.println(str.substring(0, 3));
        String str2 = "World!";
        System.out.println(str + " " + str2);
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());
        String str3 ="Hello";
        System.out.println(str.equals(str3));
        String str4 = new String("Hello");
        System.out.println(str == str4);

        // Mutable strings 
        StringBuilder sb = new StringBuilder("Parth");
        sb.append(" World");
    }
    
}
