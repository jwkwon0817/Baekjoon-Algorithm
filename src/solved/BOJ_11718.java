/**
 * @author jwkwon
 * @since 2023 / 03 / 01
 * @see https://www.acmicpc.net/problem/11718
 */

package solved;

import java.io.*;

public class BOJ_11718 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        while (true) {
            try {
                String str = br.readLine();
                if ((str == null) || (str.length() == 0)) break;
                bw.write(str + "\n");
            } catch (NullPointerException e) {
                break;
            }
        }
        bw.write(sb.toString());
        bw.close();
    }
}
