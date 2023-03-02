/**
 * @author jwkwon
 * @since 2023 / 01 / 04
 * @see https://www.acmicpc.net/problem/10869
 */

package solved;

import java.util.Scanner;

public class BOJ_10869 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);
    }
}
