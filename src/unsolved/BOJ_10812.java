package unsolved;

import java.io.*;
import java.util.Arrays;
import java.util.stream.IntStream;

public class BOJ_10812 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int[] input = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		
		int N = input[0];
		int M = input[1];
		
		int[] array = new int[N];
		for (int i = 0; i < N; i++) {
			array[i] = i + 1;
		}
		
		for (int i = 0; i < M; i++) {
			int[] inp = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
			array = swap(array, inp[0], inp[1], inp[2]);
		}
		
		bw.write(Arrays.toString(array).replace("[", "").replace("]", "").replace(",", ""));
		bw.close();
	}
	
	public static int[] swap(int[] array, int a, int b, int c) {
		int[] temp = Arrays.copyOfRange(array, a, b);
		
		int[] tempArr = Arrays.copyOf(temp, c);
		int[] restArr = Arrays.copyOfRange(temp, temp.length - c, temp.length);
		
		return IntStream.concat(Arrays.stream(restArr), Arrays.stream(tempArr)).toArray();
	}
}
