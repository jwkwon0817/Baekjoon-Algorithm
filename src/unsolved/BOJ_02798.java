package unsolved;

import java.io.*;
import java.util.Arrays;

public class BOJ_02798 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int[] input = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		int N = input[0];
		int M = input[1];
		
		int[] nums = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		
		Arrays.sort(nums);
		
		System.out.println(Arrays.toString(nums));
	}
}
