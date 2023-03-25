package solved;

import java.io.*;

public class BOJ_02444 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		
		int r = 2 * n - 1;
		for (int i = 1; i <= n; i++) {
			int x = r - (2 * i - 1);
			bw.write(" ".repeat(x / 2) + "*".repeat(2 * i - 1) + "\n");
		}
		
		for (int i = n - 1; i >= 1; i--) {
			int x = r - (2 * i - 1);
			bw.write(" ".repeat(x / 2) + "*".repeat(2 * i - 1) + "\n");
		}
		bw.close();
	}
}
