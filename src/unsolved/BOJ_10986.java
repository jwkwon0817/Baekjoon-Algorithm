package unsolved;

import java.io.*;
import java.util.Arrays;

public class BOJ_10986 {
	static int N;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int[] T = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		N = T[0];
		int M = T[1];
		
		long result = 0;
		long[] S = new long[N + 1];
		long[] C = new long[M];
		
		int arr[] = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		
		int count = 0;
		
		for (int i = 0; i < N; i++) {
			for (int j = i; j < N + 1; j++) {
				int sum = arr[j] - arr[i];
				if (sum % M == 0) count++;
			}
		}
		
		bw.write(count + "");
		bw.close();
	}
}
