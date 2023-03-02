/**
 * @author jwkwon
 * @since 2023 / 02 / 09
 * @see https://www.acmicpc.net/problem/1065
 */

package solved;

import java.io.*;

public class BOJ_01065 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int limit = Integer.parseInt(br.readLine());

        int count = 0;
        for (int i = 1; i <= limit; i++) {
            if (d(i)) {
                count++;
            }
        }

        bw.write(String.valueOf(count));
        bw.close();
    }

    public static boolean d(int a) {
        String[] strA = String.valueOf(a).split("");

        if (a < 10) {
            return true;
        }
        int sub = Integer.parseInt(strA[1]) - Integer.parseInt(strA[0]);
        for (int i = 0; i < strA.length - 1; i++) {
            int num = Integer.parseInt(strA[i + 1]) - Integer.parseInt(strA[i]);
            if (num != sub) {
                return false;
            }
        }
        return true;
    }
}
