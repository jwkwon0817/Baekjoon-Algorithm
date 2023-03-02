/**
 * @author jwkwon
 * @since 2023 / 01 / 29
 * @see https://www.acmicpc.net/problem/11659
 */

package solved;

import java.util.Scanner;

public class BOJ_11659 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] strN = scanner.nextLine().split(" ");
        int row = Integer.parseInt(strN[0]);
        int col = Integer.parseInt(strN[1]);

        String[] data = scanner.nextLine().split(" " );

        // Prefix Sum 배열 계산
        int sum = 0;
        int[] prefixSum = new int[row + 1];
        prefixSum[0] = 0;
        for (int i = 0; i < row; i++) {
            sum += Integer.parseInt(data[i]);
            prefixSum[i + 1] = sum;
        }

        for (int i = 0; i < col; i++) {
            int left = scanner.nextInt();
            int right = scanner.nextInt();
            System.out.println(prefixSum[right] - prefixSum[left - 1]);
        }
    }
}