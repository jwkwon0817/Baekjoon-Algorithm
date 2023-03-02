/**
 * @author jwkwon
 * @since 2023 / 01 / 05
 * @see https://www.acmicpc.net/problem/2753
 */

package solved;

import java.util.Scanner;

public class BOJ_02753 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int year = scanner.nextInt();

        if ((year % 4 == 0) && !(year % 100 == 0)){
            System.out.println(1);
        } else if (year % 400 == 0) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}

