package unsolved;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BOJ_09012 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new java.io.InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new java.io.OutputStreamWriter(System.out));
		
		int T = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < T; i++) {
			String input = br.readLine();
			
			List<String> inputs = new ArrayList<>(Arrays.asList(input.split("")));
			int left = Collections.frequency(inputs, "(");
			int right = Collections.frequency(inputs, ")");
			
			if (left != right) {
				bw.write("NO\n");
				continue;
			}
			
			if (inputs.get(0).equals(")")) {
				bw.write("NO\n");
				continue;
			}
			
			if (inputs.get(inputs.size() - 1).equals("(")) {
				bw.write("NO\n");
				continue;
			}
			
			int strange = Collections.frequency(inputs, "((") + Collections.frequency(inputs, "))");
			
			if (strange > 0) {
				bw.write("NO\n");
				continue;
			}
			
			bw.write("YES\n");
		}
		
		bw.close();
	}
}
