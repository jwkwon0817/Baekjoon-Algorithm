/**
 * @author jwkwon
 * @since 2023 / 02 / 08
 * @see https://www.acmicpc.net/problem/10818
 */

package solved;

import java.io.*;
import java.util.Arrays;

public class BOJ_10818 {
    public static void main(String[] args) throws IOException  {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int limit = Integer.parseInt(br.readLine());

        String[] strArray = br.readLine().split(" ");
        int[] newArray = new int[limit];

        for (int i = 0; i < limit; i++) {
            newArray[i] = Integer.parseInt(strArray[i]);
        }

        Arrays.sort(newArray);

        int min = newArray[0];
        int max = newArray[limit - 1];

        bw.write(min + " " + max);
        bw.close();
    }
}

