/**
 * @author jwkwon
 * @since 2023 / 01 / 05
 * @see https://www.acmicpc.net/problem/14681
 */

package solved;

import java.util.Scanner;

public class BOJ_14681 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int posX = scanner.nextInt();
        int posY = scanner.nextInt();

        if (posX > 0) {
            if (posY > 0) {
                System.out.println(1);
            } else if (posY < 0) {
                System.out.println(4);
            }
        } else if (posX < 0) {
            if (posY > 0) {
                System.out.println(2);
            } else if (posY < 0) {
                System.out.println(3);
            }
        }
    }
}

