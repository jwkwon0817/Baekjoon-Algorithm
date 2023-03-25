package unsolved;

import java.io.*;
import java.util.Arrays;

public class BOJ_01015 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		
		String[] numArray = br.readLine().split(" ");
		int[] nums = new int[N];
		for (int i = 0; i < nums.length; i++) {
			nums[i] = Integer.parseInt(numArray[i]);
		}
		int findIndex = Arrays.stream(nums).min().getAsInt();
		
		int startIndex = 0; // Array
		int[] resultArray = new int[N]; // 정답
		while (startIndex < nums.length) {
			for (int i = 0; i < nums.length; i++) {
				if (findIndex == nums[i]) {
					resultArray[i] = startIndex++;
				}
			}
			findIndex++;
		}
		
		for (int j : resultArray) {
			bw.write(j + " ");
		}
		bw.close();
	}
}
