/**
 * @author jwkwon
 * @since 2023 / 03 / 25
 * @see https://www.acmicpc.net/problem/27866
 */

package solved;

import java.io.*;

public class BOJ_27866 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String text = br.readLine();
		int index = Integer.parseInt(br.readLine());
		
		bw.write(text.substring(index - 1, index));
		bw.close();
	}
}
