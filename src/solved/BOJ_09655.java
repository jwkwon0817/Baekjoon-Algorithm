/**
 * @author jwkwon
 * @see https://www.acmicpc.net/problem/9655
 * @since 2023 / 05 / 31
 */

package solved;

import java.io.*;

public class BOJ_09655 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int number = Integer.parseInt(br.readLine());
		
		if (number % 2 != 0) {
			bw.write("SK");
		} else {
			bw.write("CY");
		}
		
		bw.close();
	}
}
