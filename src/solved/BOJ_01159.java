/**
 * @author jwkwon
 * @since 2023 / 02 / 27
 * @see https://www.acmicpc.net/problem/1159
 */

package solved;

import java.io.*;
import java.util.*;

public class BOJ_01159 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        String[] firstLetter = new String[N];
        for (int i = 0; i < firstLetter.length; i++) {
            firstLetter[i] = br.readLine().split("")[0];
        }

        Set<String> names = new HashSet<>(Arrays.asList(firstLetter));
        List<String> namesList = new ArrayList<>(names);
        List<String> result = new ArrayList<>();
        for (int i = 0; i < names.size(); i++) {
            int count = Collections.frequency(Arrays.asList(firstLetter), namesList.get(i));
            if (count >= 5) {
                result.add(namesList.get(i));
            }
        }

        List<Character> sorted = new ArrayList<>();
        for (int i = 0; i < result.size(); i++) {
            sorted.add(result.get(i).charAt(0));
        }

        Collections.sort(sorted);

        if (result.isEmpty()) {
            bw.write("PREDAJA");
        } else {
            for (Character character : sorted) {
                bw.write(character);
            }
        }
        bw.close();
    }
}
