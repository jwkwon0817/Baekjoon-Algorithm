/**
 * @author jwkwon
 * @since 2023 / 02 / 24
 * @see https://www.acmicpc.net/problem/10813
 */

package solved;

import java.io.*;

public class BOJ_10813 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] str = br.readLine().split(" ");
        int[] array = new int[Integer.parseInt(str[0])];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
        int N = Integer.parseInt(str[1]);

        for (int i = 0; i < N; i++) {
            String[] numArr = br.readLine().split(" ");
            int a = Integer.parseInt(numArr[0]) - 1;
            int b = Integer.parseInt(numArr[1]) - 1;
            int temp = array[a];
            array[a] = array[b];
            array[b] = temp;
        }

        for (int j : array) {
            bw.write(j + " ");
        }
        bw.close();
    }
}