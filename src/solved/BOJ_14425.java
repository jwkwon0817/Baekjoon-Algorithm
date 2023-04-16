/**
 * @author jwkwon
 * @since 2023 / 04 / 01
 * @see https://www.acmicpc.net/problem/14425
 */

package solved;

import java.io.*;
import java.util.*;

public class BOJ_14425 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int[] num = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		
		Set<String> N = new HashSet<>();
		for (int i = 0; i < num[0]; i++) {
			N.add(br.readLine());
		}
		int result = 0;
		
		for (int i = 0; i < num[1]; i++) {
			String input = br.readLine();
			if (N.contains(input)) {
				result++;
			}
		}
		
		bw.write(result + "");
		bw.close();
	}
}
