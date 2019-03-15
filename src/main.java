public class main {
    public static void main(String[] args) {
        int[][] myMatrix = new int[10][10];
        randomMatrixFiller(myMatrix,10);

        showMatrix(myMatrix);
        System.out.println("\n");
        showMatrix(matrixSquare(myMatrix));








    }

    //---------CALCULATE MATRIX SQUARE---------------
    public static int[][] matrixSquare(int[][] a ){
        int row = a.length-1;
        int column = a[row].length-1;

        //CREATRING A NEW MATRIX-solutionMatrix
        int[][] lastMatrix =new  int[row+1][column+1];


        //EACH LINE ONE BY ONE
        for (int i=0;i<=row ;i++){
            for (int j=0;j<=column;j++){
                //lastMatrix[row][column] = a[row][0]*a[0][column] + a[row][1]*a[1][column] + a[row][2]*a[2][column];
                //JUST PRODUCT RULES IN MATRIX

                for (int k=0;k<=row ;k++){
                    lastMatrix[i][j] = lastMatrix[i][j] + a[i][k]*a[k][j];

                }

            }
        }
        // RETURNING LAST MATRIX
        return lastMatrix;



    }


    //---------------------RANNDOM_LY FILL THE MATRIX-----------------
    public static int[][] randomMatrixFiller(int [][] a,int num){
        int row = a.length;
        int column = a[row-1].length;

        //0 TO num -RANDOMLY ENTER THE MATRIX
        for (int i=0 ;i<row ; i++){
            for (int j=0;j<column;j++){

                a[i][j] = (int)(Math.random()*num);


            }



        }

        return a;
    }


    //------------------PRINTING MATRIX-----------------
    public static void showMatrix(int[][] a){
        int row = a.length;
        int column = a[row-1].length;

        //WRITING EACH LINE ONE BY ONE
        for (int i=0 ;i<row ; i++){
            for (int j=0;j<column;j++){
                System.out.print(a[i][j]+"\t");

            }
            System.out.println();


        }

    }

}
