/**
 * @author jwkwon
 * @since 2023 / 01 / 05
 * @see https://www.acmicpc.net/problem/2884ß
 */

package solved;

import java.util.Scanner;

public class BOJ_02884 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int timeH = scanner.nextInt();
        int timeM = scanner.nextInt();

        if (timeM < 45) {
            timeH--;
            timeM = 60 - (45 - timeM);
            if (timeH < 0) {
                timeH = 23;
            }
        } else {
            timeM -= 45;
        }

        System.out.println(timeH + " " + timeM);
    }
}
