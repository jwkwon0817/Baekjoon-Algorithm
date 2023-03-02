/**
 * @author jwkwon
 * @since 2023 / 02 / 03
 * @see https://www.acmicpc.net/problem/10951
 */

package solved;

import java.io.*;
import java.util.StringTokenizer;

public class BOJ_10951 {
    public static void main(String[] args) throws IOException  {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        while (true) {
            try {
                st = new StringTokenizer(br.readLine());
                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());
                int result = a + b;
                bw.write(result + "\n");
            } catch (Exception e) {
                bw.flush();
                break;
            }
        }


    }
}
