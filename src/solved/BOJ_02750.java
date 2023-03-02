/**
 * @author jwkwon
 * @since 2023 / 02 / 17
 * @see https://www.acmicpc.net/problem/2750
 */

package solved;

import java.io.*;

public class BOJ_02750 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        for (int i = arr.length - 1; i >= 0; i--) {
            bw.write(arr[i] + "\n");
        }
        bw.close();
    }
}
