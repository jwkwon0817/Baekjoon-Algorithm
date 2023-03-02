/**
 * @author jwkwon
 * @since 2023 / 01 / 30
 * @see https://www.acmicpc.net/problem/11660
 */

package solved;

import java.util.Scanner;

public class BOJ_11660 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] strN = scanner.nextLine().split(" ");
        int array = Integer.parseInt(strN[0]);
        int col = Integer.parseInt(strN[1]);

        int[][] A = new int[array][array];
        String[] B;

        for (int i = 0; i < array; i++) {
            B = scanner.nextLine().split(" ");
            for (int j = 0; j < array; j++) {
                A[i][j] = Integer.parseInt(B[j]);
            }
        }

        int[][] D = new int[array + 1][array + 1];

        D[1][1] = A[0][0];
        for (int i = 1; i <= array; i++) {
            D[i][1] = D[i - 1][1] + A[i - 1][0];
        }
        for (int j = 1; j <= array; j++) {
            D[1][j] = D[1][j - 1] + A[0][j - 1];
        }

        for (int i = 1; i <= array; i++) {
            for (int j = 1; j <= array; j++) {
                D[i][j] = D[i - 1][j] + D[i][j - 1] - D[i - 1][j - 1] + A[i - 1][j - 1];
            }
        }

        int[] result = new int[col];

        for (int i = 1; i <= col; i++) {
            String[] value = scanner.nextLine().split(" ");
            int x1 = Integer.parseInt(value[0]);
            int y1 = Integer.parseInt(value[1]);
            int x2 = Integer.parseInt(value[2]);
            int y2 = Integer.parseInt(value[3]);
            result[i - 1] = D[x2][y2] - D[x1 - 1][y2] - D[x2][y1 - 1] + D[x1 - 1][y1 - 1];
        }

        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
}