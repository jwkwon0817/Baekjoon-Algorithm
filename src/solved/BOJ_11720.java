/**
 * @author jwkwon
 * @since 2023 / 01 / 28
 * @see https://www.acmicpc.net/problem/11720
 */

package solved;

import java.util.Scanner;

public class BOJ_11720 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String limitStr = scanner.nextLine();
        int limitNum = Integer.parseInt(limitStr);

        String numStr = scanner.nextLine();
        String[] numArr = numStr.split("");

        int sum = 0;

        for (int i = 0; i < limitNum; i++) {
            sum += Integer.parseInt(numArr[i]);
        }

        System.out.println(sum);
    }
}
