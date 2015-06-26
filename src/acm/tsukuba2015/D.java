package acm.tsukuba2015;

import java.io.*;
import java.util.Scanner;

public class D {
    public static int INF = Integer.MAX_VALUE;
    static Scanner sc;
    static PrintWriter pw;
    static String id = "D";
    static String input = "/Users/hiro/Downloads/" + id;
    static String output = "src/acm/tsukuba2015/out_" + id + ".txt";

    public static void main(String[] args) {
        init();

        System.out.println(1 << 10);
        System.out.println(1 << 100);
        while (true) {
            int n = ni();
            if (n == 0) {
                break;
            }
            int[] vs = new int[n];
            for (int i = 0; i < n; i++) {
                vs[i] = ni();
            }
        }
        end();
    }

    public static void init() {
        try {
            System.setProperty("line.separator", "\r\n");
            sc = new Scanner(new File(input));
            BufferedWriter bw = new BufferedWriter(new FileWriter(new File(output)));
            pw = new PrintWriter(bw);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void end() {
        sc.close();
        pw.close();
    }

    public static int ni() {
        return sc.nextInt();
    }

    public static String nl() {
        return sc.nextLine();
    }
}
