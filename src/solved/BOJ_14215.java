/**
 * @author jwkwon
 * @since 2023 / 03 / 27
 * @see https://www.acmicpc.net/problem/14215
 */

package solved;

import java.io.*;
import java.util.Arrays;

public class BOJ_14215 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int[] num = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		int max = Arrays.stream(num).max().getAsInt();
		int sum = Arrays.stream(num).sum();
		int r = sum - max;
		
		while (max >= r) {
			max--;
		}
		
		bw.write(max + r + "");
		bw.close();
	}
}
