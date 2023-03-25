/**
 * @author jwkwon
 * @since 2023 / 03 / 09
 * @see https://www.acmicpc.net/problem/1085
 */

package solved;

import java.io.*;
import java.util.Arrays;
import java.util.Collections;

public class BOJ_01085 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] pos = br.readLine().split(" ");
		bw.write(Collections.min(Arrays.asList(Integer.parseInt(pos[1]), Integer.parseInt(pos[0]), Integer.parseInt(pos[2]) - Integer.parseInt(pos[0]), Integer.parseInt(pos[3]) - Integer.parseInt(pos[1]))) + "");
		bw.close();
	}
}
