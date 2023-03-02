/**
 * @author jwkwon
 * @since 2023 / 02 / 25
 * @see https://www.acmicpc.net/problem/10871
 */

package solved;

import java.io.*;

public class BOJ_10871 {
    public static void main(String[] args) throws IOException  {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] arr = br.readLine().split(" ");

        int limit = Integer.parseInt(arr[0]);
        int num = Integer.parseInt(arr[1]);

        String[] strArray = br.readLine().split(" ");
        String[] newArray = new String[limit];

        for (int i = 0; i < limit; i++) {
            newArray[i] = strArray[i];
        }

        int[] count = new int[limit];

        for (int i = 0; i < limit; i++) {
            if (Integer.parseInt(newArray[i]) < num) {
                count[i] = Integer.parseInt(newArray[i]);
            }
        }

        for (int i = 0; i < limit; i++) {
            if (count[i] != 0) {
                bw.write(count[i] + " ");
            }
        }

        bw.close();
    }
}

