/**
 * @author jwkwon
 * @since 2023 / 02 / 08
 * @see https://www.acmicpc.net/problem/5597
 */

package solved;

import java.io.*;

public class BOJ_05597 {
    public static void main(String[] args) throws IOException  {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = 30;

        int[] array = new int[N];
        for (int i = 0; i < 30; i++) {
            array[i] = i + 1;
        }

        for (int i = 0; i < 28; i++) {
            array[Integer.parseInt(br.readLine()) - 1] = 0;
        }

        for (int i = 0; i < N; i++) {
            if (array[i] != 0) {
                System.out.println(array[i]);
            }
        }
    }
}

