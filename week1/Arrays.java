import java.lang.Math;

public class Arrays {
    public static void main(String[] args) {
        // dataType[] arrayName;
        int[] array1 = new int[5];
        int[] array2 = {1,2,3,4,5,6};
        int[] array3 = new int[]{1,2,3,4,5,6};

        System.out.println(array3[3]);
        System.out.println(array1[1]);
        System.out.println(array2[2]);

        System.out.println("");

        // multi dimensional arrays
        int[][] array4 = new int[3][4];

        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 4; j++){
                int temp = (int)(Math.random() * 100);
                array4[i][j] = temp;
            }
        }
        
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 4; j++){
                System.out.print(array4[i][j]);
                System.out.print(' ');
            }
            System.out.println("  ");
        }

        System.out.println();

        for(int[] row : array4){
            for(int val : row){
                System.out.print(val + " ");
            }
            System.out.println();
        }

        int[][] jaggedArray = new int[3][];
        jaggedArray[0] = new int[]{1, 2};
        jaggedArray[1] = new int[]{3, 4, 5};
        jaggedArray[2] = new int[]{6, 7, 8, 9, 10};

        for(int i = 0; i < 3; i++){
            for(int j = 0; j < jaggedArray[i].length; j++){
                System.out.print(jaggedArray[i][j] + " ");
            }
            System.out.println();
        }
        
    }
}

// Drawback	                            Issue	                                Alternative
// No type safety.	                    Using raw types.                        Use parameterized types

// Fixed size	                        Cannot grow dynamically	                Use ArrayList or LinkedList.

// Inefficient insertion/deletion	    Requires shifting elements	            Use LinkedList.

// Lack of built-in methods	Sorting,
// searching, etc.                      need manual coding	                    Use Collections or Streams.

// Sequential memory allocation	        Requires contiguous memory	            Use LinkedList.

// No dynamic resizing	                Size cannot be changed	                Use ArrayList.

// Performance drawbacks	            Slow searching in unsorted arrays	    Use HashMap or TreeMap.