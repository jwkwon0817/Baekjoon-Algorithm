/**
 * @author jwkwon
 * @since 2023 / 02 / 08
 * @see https://www.acmicpc.net/problem/3052
 */

package solved;

import java.io.*;
import java.util.HashSet;
import java.util.Set;

public class BOJ_03052 {
    public static void main(String[] args) throws IOException  {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = 10;

        int[] array = new int[N];

        for (int i = 0; i < N; i++) {
            array[i] = Integer.parseInt(br.readLine());
        }

        int[] result = new int[N];

        for (int i = 0; i < N; i++) {
            result[i] = array[i] % 42;
        }

        Set<Integer> set = new HashSet<>();

        for (int i : result) {
            set.add(i);
        }

        bw.write(set.size() + "");
        bw.close();
    }
}

