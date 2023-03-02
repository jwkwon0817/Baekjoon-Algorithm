/**
 * @author jwkwon
 * @since 2023 / 02 / 09
 * @see https://www.acmicpc.net/problem/8958
 */

package solved;

import java.io.*;

public class BOJ_08958 {
    public static void main(String[] args) throws IOException  {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int limit = Integer.parseInt(br.readLine());

        int[] result = new int[limit];

        for (int i = 0; i < limit; i++) {
            int count = 0;
            int add = 0;

            String str = br.readLine();
            String[] strArr = str.split("");
            for (int j = 0; j < strArr.length; j++) {
                if (strArr[j].equals("O")) {
                    add++;
                } else {
                    add = 0;
                }
                count += add;
            }
            result[i] = count;
        }

        for (int i = 0; i < limit; i++) {
            bw.write(result[i] + "\n");
        }

        bw.close();
    }
}
