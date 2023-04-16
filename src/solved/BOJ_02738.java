/**
 * @author jwkwon
 * @since 2023 / 03 / 27
 * @see https://www.acmicpc.net/problem/2738
 */

package solved;

import java.io.*;

public class BOJ_02738 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] input = br.readLine().split(" ");
		int N = Integer.parseInt(input[0]);
		int M = Integer.parseInt(input[1]);
		
		int[][] A = new int[N][M];
		int[][] B = new int[N][M];
		
		for (int i = 0; i < N; i++) {
			String[] inputA = br.readLine().split(" ");
			for (int j = 0; j < M; j++) {
				A[i][j] = Integer.parseInt(inputA[j]);
			}
		}
		
		for (int i = 0; i < N; i++) {
			String[] inputB = br.readLine().split(" ");
			for (int j = 0; j < M; j++) {
				B[i][j] = Integer.parseInt(inputB[j]);
			}
		}
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				bw.write((A[i][j] + B[i][j]) + " ");
			}
			bw.write("\n");
		}
		
		bw.close();
	}
}
