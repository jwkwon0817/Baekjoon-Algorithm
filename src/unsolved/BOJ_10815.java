package unsolved;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class BOJ_10815 {
	
	static List<Integer> list = new ArrayList<>();
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			list.add(Integer.parseInt(st.nextToken()));
		}
		
		Collections.sort(list);
		
		int M = Integer.parseInt(br.readLine());
		
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < M; i++) {
			int currentNumber = Integer.parseInt(st.nextToken());
			if (hasNumber(currentNumber, 0, N - 1)) {
				bw.write("1 ");
			} else {
				bw.write("0 ");
			}
		}
		
		bw.close();
	}
	
	private static boolean hasNumber(int key, int low, int high) {
		int mid;
		
		while (low <= high) {
			mid = (low + high) / 2;
			
			if (key == list.get(mid)) {
				return true;
			} else if (key < list.get(mid)) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}
		
		return false; // 탐색 실패
	}
}
