package unsolved;

import java.io.*;

public class BOJ_01020 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] digital = {6, 2, 5, 5, 4, 5, 6, 3, 7, 5};

        String input = br.readLine();
        String[] nums = input.split("");
        int N = nums.length;

        int sum = 0;
        for (String num : nums) {
            sum += digital[Integer.parseInt(num)];
        }
        System.out.println("sum: " + sum);

        int count = 0;
        long arg = Long.parseLong(input);
        int now = 0;
        while (sum != now) {
            if (String.valueOf(arg).length() > N) {
                arg = 0;
            } else {
                System.out.printf(count + ". " + "%0" + N + "d (" + getDigitalNumber(String.format("%0" + N + "d", arg)) + ")\n", arg);
            }
            count++;
            arg += 1;
            now = getDigitalNumber(String.format("%0" + N + "d", arg));
        }

        System.out.printf(count + ". " + "%0" + N + "d (" + getDigitalNumber(String.format("%0" + N + "d", arg)) + ")\n", arg);
        bw.write(count + "");
        bw.close();
    }

    public static int getDigitalNumber(String n) {
        String[] nums = n.split("");
        int[] digital = {6, 2, 5, 5, 4, 5, 6, 3, 7, 5};

        int sum = 0;
        for (String num : nums) {
            sum += digital[Integer.parseInt(num)];
        }
        return sum;
    }
}
