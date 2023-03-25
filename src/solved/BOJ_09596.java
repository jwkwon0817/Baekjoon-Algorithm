/**
 * @author jwkwon
 * @since 2023 / 03 / 11
 * @see https://www.acmicpc.net/problem/9596
 */

package solved;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BOJ_09596 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		while (true) {
			int n = Integer.parseInt(br.readLine());
			if (n == -1) break;
			
			if (Arrays.stream(divisor(n)).sum() == n) {
				bw.write(n + " = ");
				for (int i = 0; i < divisor(n).length - 1; i++) {
					bw.write(divisor(n)[i] + " + ");
				}
				bw.write(divisor(n)[divisor(n).length - 1] + "\n");
			} else {
				bw.write(n + " is NOT perfect.\n");
			}
		}
		bw.close();
	}
	
	// 약수가 영어로 뭔지 출력해줘
	public static int[] divisor(int n) {
		List<Integer> array = new ArrayList<>();
		for (int i = 1; i < n; i++) {
			if (n % i == 0) {
				array.add(i);
			}
		}
		
		int[] resultArray = new int[array.size()];
		for (int i = 0; i < array.size(); i++) {
			resultArray[i] = array.get(i);
		}
		
		return resultArray;
	}
	
	public static boolean isPerfectNumber(int n) {
		return Arrays.stream(divisor(n)).sum() == n;
	}
}
