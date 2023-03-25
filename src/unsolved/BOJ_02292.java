package unsolved;

import java.io.*;

public class BOJ_02292 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		/*
		6, 12, 18 -> 6n
		
		(6n + 6)*n / 2
		3n^2 + 3n = N
		3n^2 + 3n - N = 0
		-3 + sqrt(9 - 12N) / 6
		 */
		int N = Integer.parseInt(br.readLine());
		
		double result = (-3 + Math.sqrt(9 + 12 * N)) / 6;
		int result2 = result % 1.0 == 0 ? (int) result : (int) (Math.floor(result + 1) + 1);
		if (N == 1) {
			result2 = 1;
		}
		bw.write(result2 + "");
		bw.close();
	}
}