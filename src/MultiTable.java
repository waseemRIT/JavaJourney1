public class MultiTable {
    public static void main(String[] args){

        int[][] copied_table = table_creation();
        int[][] copied_table1 = table_creation();

        for (int row = 0; row< copied_table.length; row++){
            for (int column = 0 ; column<5; column++){
                System.out.print(copied_table[row][column]+" ");
            }
            System.out.println("\n");
        }
    }

    public static int[][] table_creation(){
        int[][] table = new int[5][5];
        int i;
        int j;
        for (i=0; i<5; i++){
            for (j=0; j<5; j++){
                table[i][j] = (i+1) * (j+1);
            }
        }

        for (int row = 0; row< table.length; row++){
            for (int column = 0 ; column<5; column++){
                System.out.print(table[row][column]+" ");
            }
            System.out.println("\n");
        }

        return table;

    }


}
