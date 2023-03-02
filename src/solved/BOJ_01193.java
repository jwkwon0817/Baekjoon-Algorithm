/**
 * @author jwkwon
 * @since 2023 / 03 / 01
 * @see https://www.acmicpc.net/problem/1193
 */

package solved;

import java.io.*;
import java.util.Arrays;
import java.util.Collections;

public class BOJ_01193 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int number = Integer.parseInt(br.readLine());

        double num = (-1 + Math.sqrt(1 + 8 * number)) / 2;
        int numRes = (int) (num % 1.0 == 0.0 ? num : Math.floor(num + 1));

        int S = numRes * (numRes - 1) / 2;
        int x = number - S - 1;

        String[] array = new String[numRes];
        for (int i = 1; i <= array.length; i++) {
            array[i - 1] = i + "/" + (array.length - i + 1);
        }

        if (numRes % 2 != 0) {
            Collections.reverse(Arrays.asList(array));
        }

        bw.write(array[x] + "");
        bw.close();
    }
}