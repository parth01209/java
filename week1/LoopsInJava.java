public class LoopsInJava {
    public static void main(String[] args) {
        // While Loop 
        int i = 2;
        while (i < 10){
            System.out.println(i);
            System.out.println("In Loop");
            i+=2;
        }
        System.out.println("BYE!!!!");

        // DO-WHILE LOOP - Execution happens atleast once
        int count = 1;
        do{
            System.out.println("Count is : " + count);
            count++;
        }while(count <= 5);

        // FOR LOOP 
        for(int j = 1; j <= 5; j++){
            System.out.println("Value of j is : " + j);
        }

        for(int k = 1; k <= 10; ++k){
            System.out.println("Value of k is : " + k);
        }
    }
}
