/**
 * @author jwkwon
 * @since 2023 / 02 / 24
 * @see https://www.acmicpc.net/problem/10810
 */

package solved;

import java.io.*;

public class BOJ_10810 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] str = br.readLine().split(" ");
        int[] array = new int[Integer.parseInt(str[0])];
        int N = Integer.parseInt(str[1]);

        for (int i = 0; i < N; i++) {
            String[] numArr = br.readLine().split(" ");
            for (int j = Integer.parseInt(numArr[0]) - 1; j <= Integer.parseInt(numArr[1]) - 1; j++) {
                array[j] = Integer.parseInt(numArr[2]);
            }
        }

        for (int i = 0; i < array.length; i++) {
            bw.write(array[i] + " ");
        }
        bw.close();
    }
}
