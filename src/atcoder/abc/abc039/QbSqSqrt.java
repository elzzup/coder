package atcoder.abc.abc039;

import java.util.Scanner;

public class QbSqSqrt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int i = 1;
        while (i * i * i * i < x) {
            i++;
        }
        System.out.println(i);
    }
}
