package unsolved;

import java.io.*;
import java.util.Arrays;

public class BOJ_01055 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String firstInput = br.readLine();
		String format = br.readLine();
		int limit = Integer.parseInt(br.readLine());
		int[] range = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		
		String result = format.replace("$", firstInput);
		
		for (int i = 0; i < limit - 1; i++) {
			result = format.replace("$", result);
			if (result.length() > range[1]) break;
		}
		
		String output = result;
		
		bw.write(output + "\n");
		
		if (output.length() < range[1]) {
			output += "-".repeat(range[1] - output.length());
		} else {
			output = result.substring(range[0] - 1, range[1]);
		}
		
		bw.write(output);
		bw.close();
	}
}
