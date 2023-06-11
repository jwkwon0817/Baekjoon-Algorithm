package unsolved;

import java.io.*;

public class BOJ_10757 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] num = br.readLine().split(" ");
		
		StringBuilder a = new StringBuilder();
		for (int i = 0; i < num[0].length(); i++) {
			for (int j = 0; j < num[1].length(); j++) {
				a.append(Integer.parseInt(String.valueOf(num[0].charAt(i))) + Integer.parseInt(String.valueOf(num[1].charAt(j))));
			}
		}
		
		bw.write(a + " "  + "");
		bw.close();
	}
}
