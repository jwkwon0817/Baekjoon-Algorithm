/**
 * @author jwkwon
 * @since 2023 / 02 / 03
 * @see https://www.acmicpc.net/problem/8393
 */

package solved;

import java.util.Scanner;

public class BOJ_08393 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int sum = 0;

        for (int i = 1; i <= num; i++) {
            sum += i;
        }

        System.out.println(sum);
    }
}