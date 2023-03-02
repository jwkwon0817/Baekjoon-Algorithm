/**
 * @author jwkwon
 * @since 2023 / 01 / 04
 * @see https://www.acmicpc.net/problem/1008
 */

package solved;

import java.util.Scanner;

public class BOJ_01008 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a = scanner.nextInt();
        double b = scanner.nextInt();

        double result = a / b;
        System.out.println(result);
    }
}
