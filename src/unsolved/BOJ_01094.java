package unsolved;

import java.io.*;
import java.util.stream.IntStream;

public class BOJ_01094 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int X = Integer.parseInt(br.readLine());
		
		int[] array = new int[10];
		while (true) {
			int sum = IntStream.of(array).sum();
			if (sum > X) {
				int min = IntStream.of(array).min().getAsInt();
				for (int i = 0; i < array.length; i++) {
					if (array[i] == min) {
						array[i] /= 2;
					}
				}
			}
		}
	}
}
