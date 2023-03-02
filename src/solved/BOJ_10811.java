/**
 * @author jwkwon
 * @since 2023 / 03 / 01
 * @see https://www.acmicpc.net/problem/10811
 */

package solved;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_10811 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer str = new StringTokenizer(br.readLine());

        int first = Integer.parseInt(str.nextToken()); // 5
        int[] limitArray = new int[first];
        int second = Integer.parseInt(str.nextToken()); // 4

        for (int i = 0; i < limitArray.length; i++) { // 얘가 아마 1, 2, 3, 4, 5 이런식으로 되겠네요
            limitArray[i] = i + 1;
        }

        for (int i = 0; i < second; i++) { // b만큼 루프 돌려서 계산한는 곳
            StringTokenizer str1 = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(str1.nextToken());
            int b = Integer.parseInt(str1.nextToken());
            int[] array;
            if (a != b) {
                array = Arrays.copyOfRange(limitArray, a - 1, b);
                for (int j = a - 1; j < b; j++) {
                    limitArray[j] = array[b - j - 1];
                }
            }
        }

        for (int i : limitArray) {
            bw.write(i+ " ");
        }
        bw.close();
    }
}