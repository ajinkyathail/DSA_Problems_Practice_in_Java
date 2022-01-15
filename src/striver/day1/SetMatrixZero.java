package striver.day1;

public class SetMatrixZero {
        static void setZeroes(int[][] matrix) {
            //set the column as 1 for true
            //initialize row number and column numbers
            int col0 = 1, rows = matrix.length, cols = matrix[0].length;

            //linear travels in the matrix
            for (int i = 0; i < rows; i++) {
                //1. the value of the 0 column if any 0th 'i' then we took column variable col0=0
                if (matrix[i][0] == 0) col0 = 0;
                ///2. then we started traversing from the first column for the operation column 0th column has been done
                for (int j = 1; j < cols; j++)
                    if (matrix[i][j] == 0)
                        //3. assign leftmost and rightmost value as zero and once have completely matrix traverse entire
                        //2d matrix
                        matrix[i][0] = matrix[0][j] = 0;
            }

            for (int i = rows - 1; i >= 0; i--) {
                for (int j = cols - 1; j >= 1; j--)
                    //left most is 0 OR top most is zero assigned a zero
                    if (matrix[i][0] == 0 || matrix[0][j] == 0)
                        matrix[i][j] = 0;
                //if col0 set assigned to zero
                //java everything passed by reference so automatically get changed u don't need to return anyinnthing
                if (col0 == 0) matrix[i][0] = 0;
            }
        }

        public static void main(String args[]) {
            int arr[][] = {{0, 1, 2, 0}, {3, 4, 5, 2}, {1, 3, 1, 5}};
            setZeroes(arr);
            System.out.println("The Final Matrix is ");
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[0].length; j++) {
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }
        }
    }

