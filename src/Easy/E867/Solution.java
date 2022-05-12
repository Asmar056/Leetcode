package Easy.E867;

import java.util.Arrays;
import java.util.Scanner;

// 867. Transpose Matrix
// https://leetcode.com/problems/transpose-matrix/
public class Solution {
    public static int[][] transpose(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        int[][] ans = new int[m][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                ans[j][i] = matrix[i][j];
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(Arrays.deepToString(transpose(arr)));
    }
}
