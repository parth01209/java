public class ConditionalStatements {
    public static void main(String[] args) {
        int x = 5;
        int y = 8;
        int res = 0;


        if(x>y) System.out.println("x > y");
        else System.out.println("x !> y");

        // Terney operator
        res = x%2 == 0 ? 10 : 20;
        System.out.println("res = " + res);

    }
    
}
