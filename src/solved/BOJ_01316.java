 /**
 * @author jwkwon
 * @since 2023 / 05 / 28
 * @see https://www.acmicpc.net/problem/1316
 */

package solved;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class BOJ_01316 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N  = Integer.parseInt(br.readLine());
		
		
		int count = 0;
		for (int i = 0; i < N; i++) {
			String input = br.readLine();
			if (isGroupWord(input)) {
				count++;
			}
		}
		
		bw.write(count + "");
		bw.close();
	}
	
	private static boolean isGroupWord(String word) {
		List<String> currentSequences = new ArrayList<>();
		currentSequences.add(String.valueOf(word.charAt(0)));
		String currentSequence = String.valueOf(word.charAt(0));
		for (int i = 1; i < word.length(); i++) {
			String currentChar = String.valueOf(word.charAt(i));
			
			if (currentSequences.contains(currentChar) && !currentSequence.equals(currentChar)) {
				return false;
			}
			
			currentSequences.add(String.valueOf(word.charAt(i)));
			currentSequence = String.valueOf(word.charAt(i));
		}
		return true;
	}
}
