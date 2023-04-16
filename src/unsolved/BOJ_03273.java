package unsolved;

import java.io.*;
import java.util.Arrays;

public class BOJ_03273 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		int[] array = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		int x = Integer.parseInt(br.readLine());
		
		int count = 0;
		
		Arrays.sort(array);
		
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				int sum = array[i] + array[j];
				
				if (sum == x) {
					count++;
				} else if (sum > x) {
					break;
				}
			}
		}
		
		bw.write(count + "");
		bw.close();
	}
}
