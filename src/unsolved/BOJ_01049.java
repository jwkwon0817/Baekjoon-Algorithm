package unsolved;
import java.io.*;
import java.util.Arrays;

public class BOJ_01049 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int[] inputs = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		
		int N = inputs[0];
		int M = inputs[1];
		
		Integer min = null;
		for (int i = 0; i < M; i++) {
			int[] brands = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
			int pkg = brands[0];
			int one = brands[1];
			
			int count = (int) Math.ceil(N % 6);
			
			int current = Math.min(pkg * count, one * N);
			if (min == null) {
				min = current;
			} else {
				if (current < min) {
					min = current;
				}
			}
		}
		
		bw.write(min + "");
		bw.close();
	}
}
