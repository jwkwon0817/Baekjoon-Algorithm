/**
 * @author jwkwon
 * @since 2023 / 02 / 27
 * @see https://www.acmicpc.net/problem/2743
 */

package solved;

import java.io.*;

public class BOJ_27433 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());
        bw.write(factorial(num) + "");
        bw.close();
    }

    public static long factorial(int n) {
        long result = 1;
        while (n > 0) {
            result *= n;
            n--;
        }
        return result;
    }
}