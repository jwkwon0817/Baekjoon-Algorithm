/**
 * @author jwkwon
 * @since 2023 / 04 / 16
 * @see https://www.acmicpc.net/problem/2003
 */

package solved;

import java.io.*;
import java.util.Arrays;

public class BOJ_02003 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		
		int N = arr[0];
		int M = arr[1];
		
		int[] array = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		
		int count = 0;
		
		int start = 0;
		int end = 0;
		
		int sum = 0;
		for (int i = start; i <= end; i++) {
			sum += array[i];
		}
		
		while (true) {
			try {
				if (sum == M) {
					count++;
					sum -= array[start];
					start++;
				} else if (sum < M) {
					end++;
					sum += array[end];
				} else if (sum > M) {
					sum -= array[start];
					start++;
				}
			} catch (Exception e) {
				break;
			}
		}
		
		bw.write(count + "");
		bw.close();
	}
}
