/**
 * @author jwkwon
 * @since 2023 / 03 / 25
 * @see https://www.acmicpc.net/problem/24313
 */

package solved;

import java.io.*;
import java.util.Arrays;

public class BOJ_24313 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int[] fn = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		int a1 = fn[0];
		int a0 = fn[1];
		
		int c = Integer.parseInt(br.readLine());
		int n0 = Integer.parseInt(br.readLine());
		
		if (((a1 * n0 + a0) <= (c * n0)) && (a1 <= c)) {
			bw.write("1");
		} else {
			bw.write("0");
		}

		bw.close();
	}
}
