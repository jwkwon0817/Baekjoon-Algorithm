package unsolved;

import java.io.*;
import java.util.Arrays;

public class BOJ_02470 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		int[] array = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		
		Arrays.sort(array);
		
		int[] best = {array[0], array[1]};
		
		for (int i = 0; i < N; i++) {
			for (int j = i + 1; j < N; j++) {
				int current = d(new int[]{array[i], array[j]});
				
				if (current > d(best)) {
					break;
				} else if (current < d(best)) {
					best = new int[] {array[i], array[j]};
				}
			}
		}
		
		for (int i : best) {
			bw.write(i + " ");
		}
		bw.close();
	}
	
	public static int d(int[] array) {
		return Math.abs(array[0] + array[1]);
	}
}
