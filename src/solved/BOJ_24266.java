/**
 * @author jwkwon
 * @since 2023 / 03 / 09
 * @see https://www.acmicpc.net/problem/24266
 */

package solved;

import java.io.*;

public class BOJ_24266 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		long N = Long.parseLong(br.readLine());
		
		bw.write(N * N * N + "\n3");
		bw.close();
	}
}
