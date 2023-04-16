/**
 * @author jwkwon
 * @since 2023 / 03 / 25
 * @see https://www.acmicpc.net/problem/10988
 */

package solved;

import java.io.*;

public class BOJ_10988 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String text = br.readLine();
		int textLength = text.length();
		
		for (int i = 0; i < textLength; i++) {
			int opposite = textLength - i - 1;
			String oppositeChar = text.substring(opposite, opposite + 1);
			String currentChar = text.substring(i, i + 1);
			if (!oppositeChar.equals(currentChar)) {
				bw.write(0 + "");
				bw.close();
				return;
			}
		}
		bw.write(1 + "");
		bw.close();
	}
}
