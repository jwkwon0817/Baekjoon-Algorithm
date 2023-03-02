/**
 * @author jwkwon
 * @since 2023 / 01 / 04
 * @see https://www.acmicpc.net/problem/3003
 */

package solved;

import java.util.Scanner;

public class BOJ_03003 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int kingInt = 1 - scanner.nextInt();
        int queenInt = 1 - scanner.nextInt();
        int rookInt = 2 - scanner.nextInt();
        int bishopInt = 2 - scanner.nextInt();
        int knightInt = 2 - scanner.nextInt();
        int pawnInt = 8 - scanner.nextInt();

        System.out.println(kingInt + " " + queenInt + " " + rookInt + " " + bishopInt + " " + knightInt + " " + pawnInt);
    }
}
