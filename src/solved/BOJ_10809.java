/**
 * @author jwkwon
 * @since 2023 / 02 / 09
 * @see https://www.acmicpc.net/problem/10809
 */

package solved;

import java.io.*;

public class BOJ_10809 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String limit = br.readLine();

        for (int i = 97; i <= 122; i++) {
            bw.write(limit.indexOf((char) i) + " ");
        }

        bw.close();
    }
}

