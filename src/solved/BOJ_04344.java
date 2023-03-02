/**
 * @author jwkwon
 * @since 2023 / 02 / 09
 * @see https://www.acmicpc.net/problem/4344
 */

package solved;

import java.io.*;

public class BOJ_04344 {
    public static void main(String[] args) throws IOException  {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int totalLimit = Integer.parseInt(br.readLine());

        for (int i = 0; i < totalLimit; i++) {
            String[] line = br.readLine().split(" ");
            int limit = Integer.parseInt(line[0]);

            int[] arr = new int[limit];
            for (int j = 1; j <= limit; j++) {
                arr[j - 1] = Integer.parseInt(line[j]);
            }

            int sum = 0;
            for (int j = 0; j < arr.length; j++) {
                sum += arr[j];
            }

            int avg = sum / arr.length;

            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] > avg) {
                    count++;
                }
            }

            double num = (double) count / arr.length * 100;
            double ratio = Math.round(num * 1000) / 1000.0;

            bw.write(String.format("%.3f", ratio) + "%\n");
        }

        bw.close();
    }
}

