package unsolved;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class BOJ_01325 {
	
	static List<List<Integer>> graph = new ArrayList<>();
	static List<Integer> dfsList = new ArrayList<>();
	
	static boolean[] visited;
	
	static int count = 0;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new java.io.InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new java.io.OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		for (int i = 0; i <= N; i++) {
			graph.add(new ArrayList<>());
		}
		
		visited = new boolean[N + 1];
		
		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			
			graph.get(A).add(B);
			graph.get(B).add(A);
		}
		
		for (int i = 1; i <= N; i++) {
			if (!visited[i]) {
				count = 0;
				dfs(i);
				visited = new boolean[N + 1];
				System.out.println(count);
			}
		}
	}
	
	private static void dfs(int start) {
		count++;
		visited[start] = true;
		dfsList.add(start);
		
		for (int node : graph.get(start)) {
			if (!visited[node]) {
				dfs(node);
			}
		}
	}
}
