/**
 * @author jwkwon
 * @since 2023 / 02 / 24
 * @see https://www.acmicpc.net/problem/25314
 */

package solved;

import java.io.*;

public class BOJ_25314 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());

        bw.write("long ".repeat(num / 4) + "int");
        bw.close();
    }
}