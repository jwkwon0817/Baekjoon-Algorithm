/**
 * @author jwkwon
 * @since 2023 / 02 / 03
 * @see https://www.acmicpc.net/problem/1110
 */

package solved;

import java.io.*;
import java.util.StringTokenizer;

public class BOJ_01110 {
    public static void main(String[] args) throws IOException  {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int firstNum = Integer.parseInt(st.nextToken());
        int i = 0;

        int judge = firstNum;
        // 2
        // 6
        do {
            firstNum = ((firstNum % 10) * 10) + (((firstNum / 10) + (firstNum % 10)) % 10);
            i++;

        } while (judge != firstNum);

        bw.write(i + "");
        bw.flush();
    }
}
