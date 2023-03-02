/**
 * @author jwkwon
 * @since 2023 / 01 / 23
 * @see https://www.acmicpc.net/problem/2525
 */

package solved;

import java.util.Scanner;

public class BOJ_02525 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ovenHour = scanner.nextInt();
        int ovenMinute = scanner.nextInt();
        int ovenTime = scanner.nextInt();

        int totalMinute = ovenHour * 60 + ovenMinute;
        totalMinute += ovenTime;
        int hour = (totalMinute / 60) % 24;
        int minute = totalMinute % 60;
        System.out.println(hour + " " + minute);
    }
}

