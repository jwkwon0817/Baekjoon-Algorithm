/**
 * @author jwkwon
 * @since 2023 / 02 / 09
 * @see https://www.acmicpc.net/problem/4673
 */

package solved;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class BOJ_04673 {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] arr = new int[10000];
        for (int i = 0; i < 10000; i++) {
            arr[i] = i + 1;
        }

        for (int i = 1; i <= 10000; i++) {
            if (d(i) <= 10000) {
                arr[d(i) - 1] = 0;
            }
        }

        for (int i = 0; i < 10000; i++) {
            if (arr[i] != 0) {
                bw.write(arr[i] + "\n");
            }
        }

        bw.close();
    }

    public static int d(int a) {
        String[] strA = String.valueOf(a).split("");
        int sum = a;
        for (int i = 0; i < strA.length; i++) {
            sum += Integer.parseInt(strA[i]);
        }

        return sum;
    }
}
