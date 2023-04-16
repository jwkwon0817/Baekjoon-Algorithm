/**
 * @author jwkwon
 * @since 2023 / 03 / 27
 * @see https://www.acmicpc.net/problem/2566
 */

package solved;

import java.io.*;
import java.util.Arrays;

public class BOJ_02566 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int[] nums = new int[81];
		
		int secondX = 0;
		int secondY = 0;
		
		for (int i = 0; i < 9; i++) {
			int[] inputNums = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
			System.arraycopy(inputNums, 0, nums, i * 9, 9);
		}
		
		int max = Arrays.stream(nums).max().getAsInt();
		int searchResult = search(nums, max);
		
		bw.write(max + "\n");
		bw.write(searchResult / 9 + 1 + " " + (searchResult % 9 + 1));
		bw.close();
	}
	
	static int search(int arr[], int key) {
		int i;
		
		for (i = 0; i < arr.length; i++) {
			if (arr[i] == key) {
				return i;
			}
		}
		
		return -1;
	}
}
