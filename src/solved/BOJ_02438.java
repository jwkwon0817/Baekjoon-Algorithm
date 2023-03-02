/**
 * @author jwkwon
 * @since 2023 / 02 / 03
 * @see https://www.acmicpc.net/problem/2438
 */

package solved;

import java.io.*;

public class BOJ_02438 {
    public static void main(String[] args) throws IOException  {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int limit = Integer.parseInt(br.readLine());

        for (int i = 1; i <= limit; i++) {
            bw.write("*".repeat(i) + "\n");
        }

        bw.close();
    }
}
