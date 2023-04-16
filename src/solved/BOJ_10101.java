/**
 * @author jwkwon
 * @since 2023 / 03 / 27
 * @see https://www.acmicpc.net/problem/10101
 */

package solved;

import java.io.*;

public class BOJ_10101 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		int c = Integer.parseInt(br.readLine());
		
		if ((a + b + c) != 180) {
			bw.write("Error");
			bw.close();
			return;
		}
		
		if ((a == 60) && (b == 60) && (c == 60)) {
			bw.write("Equilateral");
		} else if ((a == b) || (b == c) || (c == a)) {
			bw.write("Isosceles");
		} else {
			bw.write("Scalene");
		}
		
		bw.close();
	}
}
