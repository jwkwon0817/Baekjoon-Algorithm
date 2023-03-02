/**
 * @author jwkwon
 * @since 2023 / 01 / 05
 * @see https://www.acmicpc.net/problem/2588
 */

package solved;

import java.util.Scanner;
import java.util.stream.Stream;

public class BOJ_02588 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNum = scanner.nextInt();
        int secondNum = scanner.nextInt();

        System.out.println(firstNum * Stream.of(String.valueOf(secondNum).split("")).mapToInt(Integer::parseInt).toArray()[2]);
        System.out.println(firstNum * Stream.of(String.valueOf(secondNum).split("")).mapToInt(Integer::parseInt).toArray()[1]);
        System.out.println(firstNum * Stream.of(String.valueOf(secondNum).split("")).mapToInt(Integer::parseInt).toArray()[0]);
        System.out.println(firstNum * secondNum);
    }
}

