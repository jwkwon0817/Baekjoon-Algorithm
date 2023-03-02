/**
 * @author jwkwon
 * @since 2023 / 02 / 08
 * @see https://www.acmicpc.net/problem/2562
 */

package solved;

import java.io.*;

public class BOJ_02562 {
    public static void main(String[] args) throws IOException  {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] newArray = new int[9];

        for (int i = 0; i < 9; i++) {
            newArray[i] = Integer.parseInt(br.readLine());
        }

        int result = newArray[0];
        int index = 0;

        for (int i = 1; i < 9; i++) {
            if (newArray[i] > result) {
                result = newArray[i];
                index = i;
            }
        }

        bw.write(result + "\n");
        bw.write(index + 1 + "");
        bw.close();
    }
}

