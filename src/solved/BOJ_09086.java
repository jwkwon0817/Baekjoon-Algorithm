/**
 * @author jwkwon
 * @since 2023 / 03 / 25
 * @see https://www.acmicpc.net/problem/9086
 */

package solved;

import java.io.*;

public class BOJ_09086 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < T; i++) {
			String text = br.readLine();
			String first = text.substring(0, 1);
			String last = text.substring(text.length() - 1, text.length());
			bw.write(first + last + "\n");
		}
		bw.close();
	}
}
