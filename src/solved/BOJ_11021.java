/**
 * @author jwkwon
 * @since 2023 / 02 / 03
 * @see https://www.acmicpc.net/problem/11021
 */

package solved;

import java.io.*;
import java.util.StringTokenizer;

public class BOJ_11021 {
    public static void main(String[] args) throws IOException  {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int limit = Integer.parseInt(br.readLine());

        for (int i = 1; i <= limit; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int result = a + b;
            bw.write("Case #" + i + ": " + result + "\n");
        }

        bw.close();
    }
}
