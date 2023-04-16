package unsolved;

import java.io.*;

public class BOJ_15894 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		long value = Long.parseLong(br.readLine());
		bw.write(value * 4 + "");
		bw.close();
	}
}
