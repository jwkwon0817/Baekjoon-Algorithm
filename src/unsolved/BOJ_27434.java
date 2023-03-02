package unsolved;

import java.io.*;

public class BOJ_27434 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] num = br.readLine().split("");

        long n = 1;

        for (int i = 0; i < num.length; i++) {
            n += Math.pow(10, (i + 1)) * Integer.parseInt(num[i]);
        }

        bw.write(n + "");
        bw.close();
    }
}
