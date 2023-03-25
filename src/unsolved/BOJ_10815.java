package unsolved;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BOJ_10815 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		String[] num = br.readLine().split(" ");
		List<String> numList = new ArrayList<>(Arrays.asList(num).subList(0, n));
		
		int x = Integer.parseInt(br.readLine());
		String[] check = br.readLine().split(" ");
		for (int i = 0; i < x; i++) {
			if (numList.contains(check[i])) {
				bw.write("1 ");
			} else {
				bw.write("0 ");
			}
		}
		bw.close();
	}
}
