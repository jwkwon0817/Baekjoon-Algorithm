/**
 * @author jwkwon
 * @since 2023 / 03 / 25
 * @see https://www.acmicpc.net/problem/27323
 */

package solved;

import java.io.*;

public class BOJ_27323 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int width = Integer.parseInt(br.readLine());
		int height = Integer.parseInt(br.readLine());
		
		int result = width * height;
		
		bw.write(result + "");
		bw.close();
	}
}
