/**
 * @author jwkwon
 * @since 2023 / 01 / 04
 * @see https://www.acmicpc.net/problem/18108
 */

package solved;

import java.util.Scanner;

public class BOJ_18108 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int yearStr = scanner.nextInt();
        int result = yearStr - 543;
        System.out.println(result);
    }
}
