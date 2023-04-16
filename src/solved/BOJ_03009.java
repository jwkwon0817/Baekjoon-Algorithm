/**
 * @author jwkwon
 * @since 2023 / 03 / 25
 * @see https://www.acmicpc.net/problem/3009
 */

package solved;

import java.io.*;
import java.util.Arrays;

public class BOJ_03009 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int[] first = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		int[] second = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		int[] third = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		
		int[] x = {first[0], second[0], third[0]};
		int[] y = {first[1], second[1], third[1]};
		
		Arrays.sort(x);
		Arrays.sort(y);
		
		if (x[0] == x[1]) {
			bw.write(x[2] + " ");
		} else if (x[1] == x[2]){
			bw.write(x[0] + " ");
		}
		
		if (y[0] == y[1]) {
			bw.write(y[2] + " ");
		} else if (y[1] == y[2]){
			bw.write(y[0] + " ");
		}
		
		bw.close();
	}
}
