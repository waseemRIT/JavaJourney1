
public class NewTimeTable {
    public static void main(String[] args){

        int num1 = 5;
        int num2 = 5;

        int[][] timeTable = table(num1, num2);

        for(int i=0; i<timeTable.length; i++){
            for(int j=0; j<timeTable[0].length; j++)
                System.out.print(timeTable[i][j] + " ");
            System.out.println("\n");
        }

    }


    public static int[][] table(int rows, int columns){
        int[][] myTable = new int[rows][columns];
        for (int i = 0; i < rows; i++){
            for (int j = 0; j < columns; j++){
                myTable[i][j]= (i+1) * (j+1);
            }
        }
        return myTable;
    }




}

