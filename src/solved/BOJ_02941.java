/**
 * @author jwkwon
 * @since 2023 / 02 / 15
 * @see https://www.acmicpc.net/problem/2941
 */

package solved;

import java.io.*;
import java.util.Arrays;
import java.util.List;

public class BOJ_02941 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        List<String> str = Arrays.asList("c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z=");

        String[] inputStr = br.readLine().split("");

        int i = 0;
        while (i < inputStr.length) {
            if (str.contains(inputStr[i])) {
                inputStr[i] = "0";
            } else {
                if (i + 1 < inputStr.length) {
                    if (str.contains(inputStr[i] + inputStr[i + 1])) {
                        inputStr[i] = "0";
                        inputStr[i + 1] = ".";
                        i++;
                    } else {
                        if (i + 2 < inputStr.length) {
                            if (str.contains(inputStr[i] + inputStr[i + 1] + inputStr[i + 2])) {
                                inputStr[i] = "0";
                                inputStr[i + 1] = ".";
                                inputStr[i + 2] = ".";
                                i += 2;
                            }
                        }
                    }
                }
                i++;
            }
        }

        int count = 0;
        for (String s : inputStr) {
            if (!s.equals(".")) {
                count++;
            }
        }

        bw.write(count + "");
        bw.flush();
    }
}
