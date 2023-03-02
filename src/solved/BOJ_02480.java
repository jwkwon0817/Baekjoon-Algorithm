/**
 * @author jwkwon
 * @since 2023 / 02 / 03
 * @see https://www.acmicpc.net/problem/2480
 */

package solved;

import java.util.*;

public class BOJ_02480 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nums = scanner.nextLine();
        String[] num = nums.split(" ");

        int maxNum;

        if (num[0].equals(num[1]) && num[1].equals(num[2])) {
            maxNum = Integer.parseInt(num[0]) * 1000 + 10000;
        } else if (num[0].equals(num[1]) || num[0].equals(num[2])) {
            maxNum = Integer.parseInt(num[0]) * 100 + 1000;
        } else if (num[1].equals(num[2])) {
            maxNum = Integer.parseInt(num[1]) * 100 + 1000;
        } else {
            Arrays.sort(num);
            maxNum = Integer.parseInt(num[2]) * 100;
        }

        System.out.println(maxNum);
    }
}
