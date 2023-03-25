/**
 * @author jwkwon
 * @since
 * @see https://www.acmicpc.net/problem/1003
 */

package unsolved;

import java.io.*;

public class BOJ_01003 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int T = Integer.parseInt(br.readLine());
        
        for (int i = 0; i < T; i++) {
            int N = Integer.parseInt(br.readLine());
            int a = 0;
            for (int j = 0; j < N; j++) {
                a += j - 1 + j - 2;
                bw.write(j + "");
            }
        }
        bw.close();
    }

    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}
