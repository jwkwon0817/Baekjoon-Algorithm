/**
 * @author jwkwon
 * @since 2023 / 02 / 03
 * @see https://www.acmicpc.net/problem/25304
 */

package solved;

import java.util.Scanner;

public class BOJ_25304 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalPrice = scanner.nextInt();
        int limit = scanner.nextInt();
        int sum = 0;

        for (int i = 0; i < limit; i++) {
            int price = scanner.nextInt();
            int count = scanner.nextInt();
            sum += price * count;
        }

        if (sum == totalPrice) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
