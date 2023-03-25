/**
 * @author jwkwon
 * @since 2023 / 03 / 09
 * @see https://www.acmicpc.net/problem/24265
 */

package solved;

import java.io.*;

public class BOJ_24265 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		long n = Long.parseLong(br.readLine());
		bw.write(n * (n - 1) / 2 + "\n");
		bw.write("2");
		bw.close();
	}
}
