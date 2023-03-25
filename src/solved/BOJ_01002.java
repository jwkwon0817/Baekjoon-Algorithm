/**
 * @author jwkwon
 * @since 2023 / 02 / 24
 * @see https://www.acmicpc.net/problem/1002
 */

package solved;

import java.io.*;

public class BOJ_01002 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            String[] str = br.readLine().split(" ");
            int x1 = Integer.parseInt(str[0]);
            int y1 = Integer.parseInt(str[1]);
            int r1 = Integer.parseInt(str[2]);
            int x2 = Integer.parseInt(str[3]);
            int y2 = Integer.parseInt(str[4]);
            int r2 = Integer.parseInt(str[5]);
            int count;
            double distance = Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2);
            double radiusSum = Math.pow(r1 + r2, 2);

            if ((x1 == x2) && (y1 == y2) && (r1 == r2)) {
                count = -1;
            } else if (distance > radiusSum) {
                count = 0;
            } else if (distance < Math.pow(r1 - r2, 2)) {
                count = 0;
            } else if (distance == radiusSum) {
                count = 1;
            } else if (distance == Math.pow(r1 - r2, 2)) {
                count = 1;
            } else {
                count = 2;
            }
            bw.write(count + "\n");
        }
        bw.close();
    }
}