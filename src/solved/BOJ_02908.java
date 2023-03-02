/**
 * @author jwkwon
 * @since 2023 / 02 / 09
 * @see https://www.acmicpc.net/problem/2908
 */

package solved;

import java.io.*;

public class BOJ_02908 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] array = br.readLine().split(" ");

        String firstNum = array[0];
        String secondNum = array[1];

        String[] firstNumArray = firstNum.split("");
        String[] secondNumArray = secondNum.split("");

        String temp = firstNumArray[0];
        firstNumArray[0] = firstNumArray[2];
        firstNumArray[2] = temp;

        temp = secondNumArray[0];
        secondNumArray[0] = secondNumArray[2];
        secondNumArray[2] = temp;

        StringBuilder firstSb = new StringBuilder();
        for (String str : firstNumArray) {
            firstSb.append(str);
        }

        StringBuilder secondSb = new StringBuilder();
        for (String str : secondNumArray) {
            secondSb.append(str);
        }

        int firstInt = Integer.parseInt(firstSb.toString());
        int secondInt = Integer.parseInt(secondSb.toString());

        bw.write(Integer.max(firstInt, secondInt) + "");
        bw.close();
    }
}

