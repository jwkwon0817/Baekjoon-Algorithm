package unsolved;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class BOJ_01181 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		List<String> words = new ArrayList<>();
		
		for (int i = 0; i < N; i++) {
			words.add(br.readLine());
		}

		words = words.stream().distinct().collect(Collectors.toList());
		Collections.sort(words);
		
		for (int i = 0; i < words.size(); i++) {
			for (int j = i + 1; j < words.size(); j++) {
				if (words.get(i).length() > words.get(j).length()) {
					String temp = words.get(i);
					words.set(i, words.get(j));
					words.set(j, temp);
				}
			}
		}
		
		for (String word : words) {
			bw.write(word + "\n");
		}
		bw.close();
	}
}
