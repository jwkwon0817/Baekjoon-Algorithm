/**
 * @author jwkwon
 * @since 2023 / 04 / 01
 * @see https://www.acmicpc.net/problem/1076
 */

package solved;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class BOJ_01076 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		Map<String, Integer> valueMap = new HashMap<>();
		Map<Integer, Long> multiplyMap = new HashMap<>();
		valueMap.put("black", 0);
		valueMap.put("brown", 1);
		valueMap.put("red", 2);
		valueMap.put("orange", 3);
		valueMap.put("yellow", 4);
		valueMap.put("green", 5);
		valueMap.put("blue", 6);
		valueMap.put("violet", 7);
		valueMap.put("grey", 8);
		valueMap.put("white", 9);
		multiplyMap.put(0, 1L);
		multiplyMap.put(1, 10L);
		multiplyMap.put(2, 100L);
		multiplyMap.put(3, 1000L);
		multiplyMap.put(4, 10000L);
		multiplyMap.put(5, 100000L);
		multiplyMap.put(6, 1000000L);
		multiplyMap.put(7, 10000000L);
		multiplyMap.put(8, 100000000L);
		multiplyMap.put(9, 1000000000L);
		
		String a = br.readLine();
		String b = br.readLine();
		String c = br.readLine();
		
		long result = Integer.parseInt(valueMap.get(a) + String.valueOf(valueMap.get(b))) * multiplyMap.get(valueMap.get(c));
		bw.write(String.valueOf(result));
		bw.close();
	}
}
