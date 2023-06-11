package unsolved;

import java.io.*;
import java.util.*;

public class BOJ_01620 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int[] input = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		
		List<String> poketmons = new ArrayList<>();
		
		for (int i = 0; i < input[0]; i++) {
			String inputStr = br.readLine();
			poketmons.add(inputStr);
		}
		
		for (int i = 0; i < input[1]; i++) {
			String inputStr = br.readLine();
			
			boolean isNumber = true;
			try {
				Integer.parseInt(inputStr);
			} catch (NumberFormatException e) {
				isNumber = false;
			}
			
			if (isNumber) {
				int num = Integer.parseInt(inputStr);
				bw.write(poketmons.get(num - 1) + "\n");
			} else {
				for (int j = 0; j < poketmons.size(); j++) {
					if (poketmons.get(j).equals(inputStr)) {
						bw.write(j + 1 + "\n");
					}
				}
			}
		}
		
		bw.close();
	}
}
