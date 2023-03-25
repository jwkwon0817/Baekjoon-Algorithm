/**
 * @author
 * @since 2023 / 03 / 25
 * @see https://www.acmicpc.net/problem/2743
 */

package solved;

import java.io.*;

public class BOJ_02743 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String text = br.readLine();
		
		bw.write(text.length() + "");
		bw.close();
	}
}
