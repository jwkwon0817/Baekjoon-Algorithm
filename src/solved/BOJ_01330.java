/**
 * @author jwkwon
 * @since 2023 / 01 / 05
 * @see https://www.acmicpc.net/problem/1330
 */

package solved;

import java.util.Scanner;

public class BOJ_01330 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNum = scanner.nextInt();
        int secondNum = scanner.nextInt();

        if (firstNum > secondNum) {
            System.out.println(">");
        } else if (firstNum < secondNum) {
            System.out.println("<");
        } else {
            System.out.println("==");
        }
    }
}

