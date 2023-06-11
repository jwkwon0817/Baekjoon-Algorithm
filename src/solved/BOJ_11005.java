package solved;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BOJ_11005 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int[] inputs = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		
		int N = inputs[0];
		int M = inputs[1];
		
		List<Character> list = new ArrayList<>();
		while (N > 0) {
			if (N % M < 10) {
				list.add((char) (N % M + '0'));
			} else {
				list.add((char) (N % M - 10 + 'A'));
			}
			
			N /= M;
		}
		
		for (int i = list.size() - 1; i >= 0; i--) {
			bw.write(list.get(i));
		}
		
		bw.close();
	}
}
