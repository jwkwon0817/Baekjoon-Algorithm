/**
 * @author jwkwon
 * @see https://www.acmicpc.net/problem/1003
 * @since 2023 / 05 / 31
 */

package solved;

import java.io.*;

public class BOJ_01003 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < T; i++) {
			int N = Integer.parseInt(br.readLine());
			bw.write(fibonacci(N) + "\n");
		}
		
		bw.close();
	}
	
	public static String fibonacci(int n) {
		int zero = 1;
		int one = 0;
		
		for (int i = 0; i < n; i++) {
			int newOne = zero + one;
			
			zero = newOne - zero;
			one = newOne;
		}
		
		return zero + " " + one;
	}
}
