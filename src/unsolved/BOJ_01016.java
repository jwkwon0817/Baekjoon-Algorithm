/**
 * @author jwkwon
 * @since 2023 / 02 / 25
 * @see https://www.acmicpc.net/problem/1016
 */

package unsolved;

import java.io.*;

public class BOJ_01016 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] num = br.readLine().split(" ");

        int count = 0;
        for (int i = Integer.parseInt(num[0]); i <= Integer.parseInt(num[1]); i++) {
            if (!isTrue(i)) {
               count++;
            }
        }

        bw.write(count + "");
        bw.close();
    }

    public static boolean isTrue(int num) {
        double[] arr = new double[num];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Math.pow(i + 2, 2);
        }

        for (double v : arr) {
            if (num % v == 0) {
                return true;
            }
        }
        return false;
    }
}
