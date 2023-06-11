package unsolved;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class BOJ_02720 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < T; i++) {
			int C = Integer.parseInt(br.readLine());
			bw.write(printList(getCoins(C)));
		}
		
		bw.close();
	}
	
	private static List<Integer> getCoins(int n) {
		int[] coinValues = { 25, 10, 5, 1 };
		List<Integer> coins = new ArrayList<>();
		
		for (int coin : coinValues) {
			int count = n / coin;
			coins.add(count);
			n -= count * coin;
		}
		
		return coins;
	}
	
	private static String printList(List<Integer> list) {
		StringBuilder sb = new StringBuilder();
		for (int item : list) {
			sb.append(item).append(" ");
		}
		
		sb.append("\n");
		
		return sb.toString();
	}
}
