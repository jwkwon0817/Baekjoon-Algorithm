/**
 * @author jwkwon
 * @since 2023 / 03 / 27
 * @see https://www.acmicpc.net/problem/5073
 */

package solved;

import java.io.*;
import java.util.Arrays;

public class BOJ_05073 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		while (true) {
			int[] num = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
			if (num[0] == 0) break;
			
			int max = Arrays.stream(num).max().getAsInt();
			int sum = Arrays.stream(num).sum();
			int r = sum - max;
			
			if (max >= r) {
				bw.write("Invalid\n");
				continue;
			}
			
			if ((num[0] == num[1]) && (num[1] == num[2])) {
				bw.write("Equilateral");
			} else if ((num[0] ==  num[1]) || (num[1] == num[2]) || (num[0] == num[2])) {
				bw.write("Isosceles");
			} else {
				bw.write("Scalene");
			}
			
			bw.write("\n");
		}
		
		bw.close();
	}
}
