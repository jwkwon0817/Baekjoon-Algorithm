/**
 * @author jwkwon
 * @since 2023 / 01 / 04
 * @see https://www.acmicpc.net/problem/1000
 */

package solved;

import java.util.Scanner;

public class BOJ_01000 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int result = a + b;
        System.out.println(result);
    }
}