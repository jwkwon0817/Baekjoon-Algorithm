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

        int N = Integer.parseInt(br.readLine());
        int[] nums = new int[N];
        for (int i = 0; i < N; i++) {
            nums[i] = Integer.parseInt(br.readLine());
        }

        fibonacci(bw, nums);
    }

    public static int fibonacci(BufferedWriter bw, int ...n) throws IOException {
        int zero = 0;
        int one = 0;
        for (int i : n) {
            zero = 0;
            one = 0;
            if (i == 0) {
                zero++;
                return 0;
            } else if (i == 1) {
                one++;
                return 1;
            } else {
                return fibonacci(bw, i - 1) + fibonacci(bw, i - 2);
            }
        }
        bw.write(zero + " " + one + "\n");
        bw.flush();
        return 0;
    }
}
