/**
 * @author jwkwon
 * @since 2023 / 03 / 09
 * @see https://www.acmicpc.net/problem/24264
 */

package solved;

import java.io.*;

public class BOJ_24264 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		long X = Integer.parseInt(br.readLine());
		
		bw.write(X * X + "\n2");
		bw.close();
	}
}