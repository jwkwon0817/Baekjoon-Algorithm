package unsolved;

import java.io.*;
import java.util.Arrays;

public class BOJ_02775 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int a = Integer.parseInt(br.readLine());
		int n = Integer.parseInt(br.readLine());
		
		int[] zero = new int[n];
		int[][] array = new int[a][n];
		for (int i = 1; i <= zero.length; i++) {
			zero[i -1] = i;
		}
		
		array[0] = zero;
		for (int i = 1; i < array.length; i++) {
			for (int j = 1; j <= array[i - 1].length; j++) {
				int sum = 0;
				for (int k = 0; k < array[i - 1].length; k++) {
					sum += array[i - 1][k];
				}
				array[i][j - 1] = sum;
			}
			bw.write(Arrays.toString(array[i]) + "\n");
		}
		bw.close();
	}
}
