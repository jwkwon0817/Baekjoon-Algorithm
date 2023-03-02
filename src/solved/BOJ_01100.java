/**
 * @author jwkwon
 * @since 2023 / 02 / 27
 * @see https://www.acmicpc.net/problem/1100
 */

package solved;

import java.io.*;

public class BOJ_01100 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = 8;

        int count = 0;
        String[][] nums = new String[N][N];
        for (int i = 0; i < N; i++) {
            nums[i] = br.readLine().split("");
            for (int j = 0; j < N; j++) {
                if ((i + 1) % 2 == 0) {
                    if ((j + 1) % 2 == 0) {
                        if (nums[i][j].equals("F")) {
                            count++;
                        }
                    }
                } else {
                    if ((j + 1) % 2 != 0) {
                        if (nums[i][j].equals("F")) {
                            count++;
                        }
                    }
                }
            }
        }
        bw.write(count + "");
        bw.close();
    }
}
