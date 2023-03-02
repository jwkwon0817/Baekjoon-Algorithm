/**
 * @author jwkwon
 * @since 2023 / 02 / 09
 * @see https://www.acmicpc.net/problem/11654
 */

package solved;

import java.io.*;

public class BOJ_11654 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String limit = br.readLine();
        char limitChar = limit.charAt(0);

        bw.write((int) limitChar + "");
        bw.close();
    }
}

