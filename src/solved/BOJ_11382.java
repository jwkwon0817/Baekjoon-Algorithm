/**
 * @author jwkwon
 * @since 2023 / 02 / 24
 * @see https://www.acmicpc.net/problem/11382
 */

package solved;

import java.io.*;
import java.util.Scanner;

public class BOJ_11382 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        String[] nums = scanner.nextLine().split(" ");

        System.out.println((Long.parseLong(nums[0]) + Long.parseLong(nums[1]) + Long.parseLong(nums[2]) + ""));
    }
}
