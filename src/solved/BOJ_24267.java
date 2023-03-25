/**
 * @author jwkwon
 * @since 2023 / 03 / 09
 * @see https://www.acmicpc.net/problem/24267
 */

package solved;

import java.io.*;

public class BOJ_24267 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		long n = Long.parseLong(br.readLine());
		
		long result = ((n * n * n) - 3 * (n * n) + 2 * n) / 6;

		bw.write(result + "\n3");
		bw.close();
	}
}
