/**
 * @author jwkwon
 * @since 2023 / 02 / 09
 * @see https://www.acmicpc.net/problem/1152
 */

package solved;

import java.io.*;

public class BOJ_01152 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] limitArray = br.readLine().split(" ");

        if (limitArray.length != 0) {
            if (limitArray[0].equals("")) {
                bw.write(limitArray.length - 1 + "");
            } else {
                bw.write(limitArray.length + "");
            }
        } else {
            bw.write("0");
        }
        bw.close();
    }
}