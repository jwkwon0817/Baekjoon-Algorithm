/**
 * @author jwkwon
 * @since 2023 / 03 / 08
 * @see https://www.acmicpc.net/problem/1009
 */

package solved;

import java.io.*;

public class BOJ_01009 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		
		int[] limitArray = {1, 1, 4, 4, 2, 1, 1, 4, 4, 2};
		
		for (int i = 0; i < N; i++) {
			String[] num = br.readLine().split(" ");
			int a = Integer.parseInt(num[0]);
			int b = Integer.parseInt(num[1]);
			int limit = a % 10;
			int[] regex = new int[limitArray[limit]];
			
			for (int j = 0; j < regex.length; j++) {
				regex[j] = (int) (Math.pow(a, j + 1) % 10);
			}
			
			int t = b % regex.length;
			int result = t == 0 ? regex.length - 1 : t - 1;
			if (regex[result] == 0) {
				bw.write("10\n");
			} else {
				bw.write(regex[result] + "\n");
			}
		}
		bw.close();
	}
}
