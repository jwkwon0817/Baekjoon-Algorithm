/**
 * @author jwkwon
 * @since 2023 / 05 / 07
 * @see https://www.acmicpc.net/problem/1764
 */

package solved;

import java.io.*;
import java.util.*;

public class BOJ_01764 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int[] input = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		int N = input[0];
		int M = input[1];

		Set<String> setN = new HashSet<>();
		List<String> listM = new ArrayList<>();

		for (int i = 0; i < N; i++) {
			String inputName = br.readLine();
			setN.add(inputName);
		}

		for (int i = 0; i < M; i++) {
			String inputName = br.readLine();
			if (setN.contains(inputName)) {
				listM.add(inputName);
			}
		}

		Collections.sort(listM);

		bw.write(listM.size() + "\n");
		for (String item : listM) {
			bw.write(item + "\n");
		}
		bw.close();
	}
}
