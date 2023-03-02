/**
 * @author jwkwon
 * @since 2023 / 02 / 09
 * @see https://www.acmicpc.net/problem/1157
 */

package solved;

import java.io.*;
import java.util.*;

public class BOJ_01157 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        HashMap<String, Integer> map = new HashMap<>();

        String[] limitArray = br.readLine().split("");

        for (int i = 0; i < limitArray.length; i++) {
            limitArray[i] = limitArray[i].toLowerCase();
        }

        Set<String> set = new HashSet<>(Arrays.asList(limitArray));
        for (String str : set) {
            map.put(str, Collections.frequency(Arrays.asList(limitArray), str));
        }

        int[] values = map.values().stream().mapToInt(i -> i).toArray();

        Arrays.sort(values);

        if (values.length == 1) {
            bw.write(limitArray[0].toUpperCase());
        } else {
            if (Collections.max(map.values()) == values[values.length - 2]) {
                bw.write("?");
            } else {
                for (String key : map.keySet()) {
                    if (Objects.equals(map.get(key), Collections.max(map.values()))) {
                        bw.write(key.toUpperCase());
                    }
                }
            }
        }
        bw.close();
    }
}
