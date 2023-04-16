/**
 * @author jwkwon
 * @since 2023 / 04 / 01
 * @see https://www.acmicpc.net/problem/2745
 */

package solved;

import java.io.*;

public class BOJ_02745 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] input = br.readLine().split(" ");
		
		String str = input[0];
		int numMethod = Integer.parseInt(input[1]);
		int length = str.length();
		int nums[] = new int[length];
		for (int i = 0; i < length; i++) {
			if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
				nums[i] = str.charAt(i) - 48;
			} else {
				nums[i] = str.charAt(i) - 55;
			}
		}
		
		int result = 0;
		for (int i = 0; i < length; i++) {
			result += nums[i] * (long) Math.pow(numMethod, length - i - 1);
		}

		bw.write(result + "");
		bw.close();
	}
}
