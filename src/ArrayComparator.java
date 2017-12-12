public class ArrayComparator {


    boolean compare(int[][] tab1, int[][] tab2) {
        boolean result=true;
        if (tab1.length != tab2.length || tab1[0].length != tab2[0].length)
            result = false;

        for (int i = 0; i < tab1.length && result; i++) {
            for (int j = 0; j < tab1[i].length; j++) {
                if (tab1[i][j] != tab2[i][j]) {
                    result = false;
                }
            }
        }
        return result;
    }

}

