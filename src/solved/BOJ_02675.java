/**
 * @author jwkwon
 * @since 2023 / 02 / 09
 * @see https://www.acmicpc.net/problem/2675
 */

package solved;

import java.io.*;

public class BOJ_02675 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int limit = Integer.parseInt(br.readLine());

        for (int i = 1; i <= limit; i++) {
            String[] strArr = br.readLine().split(" ");
            int num = Integer.parseInt(strArr[0]);
            String[] str = strArr[1].split("");
            for (int j = 0; j < str.length; j++) {
                bw.write(str[j].repeat(num));
            }
            bw.write("\n");
        }

        bw.close();
    }
}

