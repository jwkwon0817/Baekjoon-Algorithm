/**
 * @author jwkwon
 * @since 2023 / 02 / 17
 * @see https://www.acmicpc.net/problem/25305
 */

package solved;

import java.io.*;

public class BOJ_25305 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] n = br.readLine().split(" ");

        String[] arr = br.readLine().split(" ");

        for (int i = 0; i < Integer.parseInt(n[0]); i++) {
            for (int j = 0; j < Integer.parseInt(n[0]) - 1; j++) {
                if (Integer.parseInt(arr[j]) < Integer.parseInt(arr[j + 1])) {
                    int temp = Integer.parseInt(arr[j]);
                    arr[j] = arr[j + 1];
                    arr[j + 1] = String.valueOf(temp);
                }
            }
        }

        bw.write(arr[Integer.parseInt(n[1]) - 1]);
        bw.close();
    }
}
