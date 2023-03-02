/**
 * @author jwkwon
 * @since 2023 / 02 / 03
 * @see https://www.acmicpc.net/problem/10950
 */

package solved;

import java.util.Scanner;

public class BOJ_10950 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String limitStr = scanner.next();
        int limit = Integer.parseInt(limitStr);

        for (int i = 0; i < limit; i++) {
            int numA = scanner.nextInt();
            int numB = scanner.nextInt();
            System.out.println(numA + numB);
        }
    }
}
