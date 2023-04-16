/**
 * @author jwkwon
 * @since 2023 / 03 / 27
 * @see https://www.acmicpc.net/problem/10798
 */

package solved;

import java.io.*;

public class BOJ_10798 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int R = 5;
		
		String[][] arr = new String[R][];
		
		for (int i = 0; i < R; i++) {
			arr[i] = br.readLine().split("");
		}
		
		for (int i = 0; i < 15; i++) {
			for (int j = 0; j < R; j++) {
				if (arr[j].length > i) {
					bw.write(arr[j][i]);
				}
			}
		}
		
		bw.close();
	}
}
