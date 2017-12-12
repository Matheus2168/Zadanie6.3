public class ArrayTest {


    public static void main(String[] args) {


        ArrayComparator ac= new ArrayComparator();

        int[][] tab1 = new int[3][];
        tab1[0] = new int[]{1,2,3,5};
        tab1[1] = new int[]{1,2,3,4};
        tab1[2] = new int[]{1,2,3,4};

        int[][] tab2 = new int[3][];
        tab2[0] = new int[]{1,2,3,4};
        tab2[1] = new int[]{1,2,3,4};
        tab2[2] = new int[]{1,2,3,4};

        System.out.println(ac.compare(tab1,tab2));

    }

}
