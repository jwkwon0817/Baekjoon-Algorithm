package solved;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.*;

public class BOJ_01260 {
	
	public static boolean[] isVisited;
	
	static List<List<Integer>> graph = new ArrayList<>();
	
	static List<Integer> dfsList = new ArrayList<>();
	static List<Integer> bfsList = new ArrayList<>();
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new java.io.InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new java.io.OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int node = Integer.parseInt(st.nextToken());
		int line = Integer.parseInt(st.nextToken());
		int start = Integer.parseInt(st.nextToken());
		
		isVisited = new boolean[node + 1];
		
		for (int i = 0; i <= node; i++) {
			graph.add(new ArrayList<>());
		}
		
		for (int i = 0; i < line; i++) {
			st = new StringTokenizer(br.readLine());
			int u = Integer.parseInt(st.nextToken());
			int v = Integer.parseInt(st.nextToken());
			
			graph.get(u).add(v);
			graph.get(v).add(u);
		}
		
		for (List<Integer> integers : graph) {
			Collections.sort(integers);
		}
		
		dfs(start);
		bw.write(dfsList.toString().replace("[", "").replace("]", "").replace(",", "") + "\n");
		
		isVisited = new boolean[node + 1];
		
		bfs(start);
		bw.write(bfsList.toString().replace("[", "").replace("]", "").replace(",", ""));
		
		bw.close();
	}
	
	
	private static void dfs(int start) {
		isVisited[start] = true;
		
		dfsList.add(start);
		
		for (int i : graph.get(start)) {
			if (!isVisited[i]) {
				dfs(i);
			}
		}
	}
	
	private static void bfs(int start) {
		isVisited[start] = true;
		
		Queue<Integer> queue = new LinkedList<>();
		queue.add(start);
		
		
		while (!queue.isEmpty()) {
			int value = queue.poll();
			bfsList.add(value);
			
			for (int i : graph.get(value)) {
				if (!isVisited[i]) {
					queue.add(i);
					isVisited[i] = true;
				}
			}
		}
	}
}