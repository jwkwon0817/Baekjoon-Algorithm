/**
 * @author jwkwon
 * @since 2023 / 03 / 25
 * @see https://www.acmicpc.net/problem/25206
 */

package solved;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class BOJ_25206 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		Map<String, Double> rankMap = new HashMap<>(Map.of("A+", 4.5, "A0", 4.0, "B+", 3.5, "B0", 3.0, "C+", 2.5, "C0", 2.0, "D+", 1.5, "D0", 1.0, "F", 0.0));
		
		double allSum = 0;
		double sum = 0;
		while (true) {
			try {
				String[] text = br.readLine().split(" ");
				double score = Double.parseDouble(text[1]);
				String rank = text[2];
				
				if (rank.equals("P")) continue;
				
				allSum += score;
				
				sum += score * rankMap.get(rank);
			} catch (Exception e) {
				break;
			}
			
		}
		
		bw.write(String.valueOf(sum / allSum));
		bw.close();
	}
}
