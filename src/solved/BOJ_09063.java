/**
 * @author jwkwon
 * @since 2023 / 03 / 27
 * @see https://www.acmicpc.net/problem/9063
 */

package solved;

import java.io.*;
import java.util.Arrays;

public class BOJ_09063 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		
		int[][] pos = new int[N][2];
		
		for (int i = 0; i < N; i++) {
			String[] num = br.readLine().split(" ");
			pos[i][0] = Integer.parseInt(num[0]);
			pos[i][1] = Integer.parseInt(num[1]);
		}
		
		int[] x = new int[N];
		int[] y = new int[N];
		
		for (int i = 0; i < N; i++) {
			x[i] = pos[i][0];
			y[i] = pos[i][1];
		}
		
		int maxX = Arrays.stream(x).max().getAsInt();
		int minX = Arrays.stream(x).min().getAsInt();
		int maxY = Arrays.stream(y).max().getAsInt();
		int minY = Arrays.stream(y).min().getAsInt();
		
		int result = (maxX - minX) * (maxY - minY);
		
		bw.write(result + "");
		bw.close();
	}
}
