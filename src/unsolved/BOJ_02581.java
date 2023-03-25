package unsolved;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BOJ_02581 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T = Integer.parseInt(br.readLine());
		int N = Integer.parseInt(br.readLine());
		List<Integer> primeNumbers = new ArrayList<>();
		
		for (int i = T; i <= N; i++) {
		}
		
		bw.write(Arrays.toString(primeNumbers.toArray()) + "\n");
		if (primeNumbers.size() == 0) {
			bw.write(-1 + "");
		} else {
			bw.write(primeNumbers.stream().mapToInt(Integer::intValue).sum() + "\n");
			bw.write(Collections.min(primeNumbers) + "");
		}
		bw.close();
	}
}
