package acm.domestic.y2015;

import java.util.ArrayList;
import java.util.Scanner;

// 2015 C問題, compiler
public class C {
    public static int INF = Integer.MAX_VALUE;
    static Scanner sc;

    public static void main(String[] args) {
        init();

        while (true) {
            int n = ni();
            if (n == 0) {
                break;
            }
            nl();

            Element root;
            String ls = nl();
            if (ls.equals("+")) {
                root = new Plus();
            } else if (ls.equals("*")) {
                root = new Multi();
            } else {
                root = new Operand(Integer.parseInt(ls));
            }

            for (int i = 1; i < n; i++) {
                String l = nl();
                int level = l.length() - 1;
                String value = "" + l.charAt(l.length() - 1);
                if (value.equals("+")) {
                    root.add(level, new Plus());
                } else if (value.equals("*")) {
                    root.add(level, new Multi());
                } else {
                    root.add(level, new Operand(Integer.parseInt(value)));
                }
            }
            System.out.println(root.calc());
        }

        end();
    }
    public static void init() {
        sc = new Scanner(System.in);
    }
    public static void end() {
        sc.close();
    }
    public static int ni() {
        return sc.nextInt();
    }
    public static String nl() {
        return sc.nextLine();
    }
}

interface Element {
    int calc();
    void add(int level, Element value);
}

abstract class Operator implements Element {
    public ArrayList<Element> elements;
    public Operator making;
    public Operator() {
        this.elements = new ArrayList<>();
    }
    public void add(int level, Element value) {
        if (level == 1) {
            this.elements.add(value);
            if (value instanceof Operator) {
                this.making = (Operator) value;
            }
            return;
        }
        making.add(level - 1, value);
    }
}

class Operand implements Element {
    int value;
    public int calc() {
        return value;
    }
    public void add(int level, Element value) {
    }
    Operand(int value) {
        this.value = value;
    }
}

class Plus extends Operator {
    public int calc() {
        int ans = 0;
        for (Element e : elements) {
            ans += e.calc();
        }
        return ans;
    }
}

class Multi extends Operator {
    public int calc() {
        int ans = 1;
        for (Element e : elements) {
            ans *= e.calc();
        }
        return ans;
    }
}
