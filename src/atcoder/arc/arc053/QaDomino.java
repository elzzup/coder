package atcoder.arc.arc053;

import java.util.Scanner;

public class QaDomino {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        System.out.println((h - 1) * w + (w - 1) * h);
    }
}
