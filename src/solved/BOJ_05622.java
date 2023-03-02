/**
 * @author jwkwon
 * @since 2023 / 02 / 09
 * @see https://www.acmicpc.net/problem/5622
 */

package solved;

import java.io.*;

public class BOJ_05622 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[][] dial = {
                {""},
                {"A", "B", "C"},
                {"D", "E", "F"},
                {"G", "H", "I"},
                {"J", "K", "L"},
                {"M", "N", "O"},
                {"P", "Q", "R", "S"},
                {"T", "U", "V"},
                {"W", "X", "Y", "Z"}
        };

        String[] input = br.readLine().split("");

        int count = 0;

        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < dial.length; j++) {
                for (int k = 0; k < dial[j].length; k++) {
                    if (input[i].equals(dial[j][k])) {
                        count += j + 2;
                    }
                }
            }
        }

        bw.write(count + "");
        bw.close();
    }
}
