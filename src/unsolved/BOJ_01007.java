package unsolved;

import java.io.*;
import java.util.*;

public class BOJ_01007 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		
		int r = N / 2;
		long t = f(N) / f(N - r);
		long result = t / f(r);
		
		int[][] vector = new int[N][2];
		for (int i = 0; i < N; i++) {
			String[] vectorStr = br.readLine().split(" ");
			vector[i][0] = Integer.parseInt(vectorStr[0]);
			vector[i][1] = Integer.parseInt(vectorStr[1]);
		}
		
		Set<Double> set = new HashSet<>();
		
		System.out.println("result: " + result);
		
		for (int i = 0; i < result; i++) {
			double x = 0;
			for (int j = 0; j < N; j++) {
				for (int k = 0; k < N; k++) {
					if (j > k) {
						x += d(vector[j][0], vector[j][1], vector[k][0], vector[k][1]);
					}
				}
			}
			set.add(x);
		}
		
		set.removeIf(d -> d == 0);
		
		bw.write(Arrays.toString(set.toArray()) + "\n");
		bw.write(Collections.min(set) + "");
		bw.close();
	}
	
	public static double d(int x1, int y1, int x2, int y2) {
		return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
	}
	
	public static long f(int n) {
		if (n <= 1) {
			return n;
		}
		
		return f(n - 1) * n;
	}
}
