/**
 * @author jwkwon
 * @since 2023 / 03 / 12
 * @see https://www.acmicpc.net/problem/1075
 */

package solved;

import java.io.*;
import java.util.*;

public class BOJ_01075 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		String num = String.valueOf(a).substring(0, String.valueOf(a).length() - 2);
		
		List<Integer> numList = new ArrayList<>();
		for (int i = 0; i <= 9; i++) {
			for (int j = 0; j <= 9; j++) {
				int num2 = Integer.parseInt(num+ i + j);
				if (num2 % b == 0) {
					numList.add(num2);
				};
			}
		}
		int min = Collections.min(numList);
		String result = String.valueOf(min).substring(String.valueOf(min).length() - 2);
		bw.write(result);
		bw.close();
	}
}
