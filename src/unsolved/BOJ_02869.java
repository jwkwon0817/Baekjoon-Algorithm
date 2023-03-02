package unsolved;

import java.io.*;

public class BOJ_02869 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] num = br.readLine().split(" ");
        bw.write(method(Long.parseLong(num[0]), Long.parseLong(num[1]), Long.parseLong(num[2])) + "");
        bw.close();
    }

    public static long method(long a, long b, long goal) {
        int now = 0;
        int count = 1;
        do {
            now += a;
            if (now >= goal) {
                break;
            }
            now -= b;
            count++;
        } while (now < goal);
        return count;
    }
}

















