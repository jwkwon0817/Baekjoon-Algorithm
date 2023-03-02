/**
 * @author jwkwon
 * @since 2023 / 02 / 08
 * @see https://www.acmicpc.net/problem/10807
 */

package solved;

import java.io.*;

public class BOJ_10807 {
    public static void main(String[] args) throws IOException  {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int limit = Integer.parseInt(br.readLine());

        String[] strArray = br.readLine().split(" ");
        String[] newArray = new String[limit];

        for (int i = 0; i < limit; i++) {
            newArray[i] = strArray[i];
        }

        int num = Integer.parseInt(br.readLine());
        int count = 0;

        for (int i = 0; i < limit; i++) {
            if (newArray[i].equals(Integer.toString(num))) {
                count++;
            }
        }

        bw.write(count + "");
        bw.close();
    }
}
