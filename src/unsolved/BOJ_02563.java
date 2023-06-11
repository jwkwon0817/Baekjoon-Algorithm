package unsolved;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.Arrays;

public class BOJ_02563 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new java.io.InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new java.io.OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		
		boolean[][] isPainted = new boolean[100][100];
		int area = 0;
		
		for (int i = 0; i < N; i++) {
			int[] pos = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
			for (int j = pos[0]; j < pos[0] + 10; j++) {
				for (int k = pos[1]; k < pos[1] + 10; k++) {
					if (!isPainted[k][j]) {
						isPainted[k][j] = true;
						area++;
					}
				}
			}
		}
		
		bw.write(area + "");
		bw.close();
	}
}
