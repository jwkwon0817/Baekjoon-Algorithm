/**
 * @author jwkwon
 * @since 2023 / 02 / 27
 * @see https://www.acmicpc.net/problem/1037
 */

package solved;

import java.io.*;
import java.util.Arrays;

public class BOJ_01037 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        String[] nums = br.readLine().split(" ");
        int[] numArray = new int[N];
        for (int i = 0; i < nums.length; i++) {
            numArray[i] = Integer.parseInt(nums[i]);
        }

        Arrays.sort(numArray);
        bw.write((numArray[0] * numArray[numArray.length - 1]) + "");
        bw.close();
    }
}
