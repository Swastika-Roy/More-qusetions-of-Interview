package dsaProblems;

import java.util.Arrays;

public class TransposeMatrix {

    static int[][] transpose(int arr[][]) {
      int row = arr.length;
      int col = arr[0].length;
      int ans[][] = new int[row][col];
      for(int i=0; i < row;i++){
          for (int j=0; j < col; j++){
              ans[j][i] = arr[i][j];
          }
      }
      return ans;
    }

    public static void main(String[] args) {
        int arr[][] = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int[][] transposed = transpose(arr);

        // Option 1: Print using deepToString
        System.out.println(Arrays.deepToString(transposed));

//        // Option 2: Print matrix neatly
//        for (int[] row : transposed) {
//            System.out.println(Arrays.toString(row));
//        }
    }
}
