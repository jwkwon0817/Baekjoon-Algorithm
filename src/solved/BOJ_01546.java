/**
 * @author jwkwon
 * @since 2023 / 01 / 28
 * @see https://www.acmicpc.net/problem/1546
 */

package solved;

import java.util.Arrays;
import java.util.Scanner;

public class BOJ_01546 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int subjects = scanner.nextInt();

        double[] scoreArr = new double[subjects];

        for (int i = 0; i < subjects; i++) {
            scoreArr[i] = scanner.nextInt();
        }

        double maxScore = Arrays.stream(scoreArr).max().getAsDouble();
        double sum = 0;

        for (int i = 0; i < subjects; i++) {
            sum += (scoreArr[i] / maxScore) * 100;
        }

        double result = sum / (double) subjects;
        System.out.println(result);
    }
}