public class AdvancePattern {
    public static void main(String[] args) {

//        butterflyPattern(5);
//        diamondPattern(5);
//        hollowButterfly(5);
//        hollowRhombus(9);
//        printHalfPyramid(6);
//        printInvertedHalfPyramid(8);

    }

    //    Butterfly Pattern
    public static void butterflyPattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            int space = 2 * (n - i);
            for (int j = 1; j <= space; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            int space = 2 * (n - i);
            for (int j = 1; j <= space; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void diamondPattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= (2 * i) - 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= (2 * i) - 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void hollowButterfly(int n) {
        for (int i = 1; i <= n; i++) {
            forHollow(i);
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print("  ");
            }
            forHollow(i);
            System.out.println();
        }
        for (int i = n; i >= 1; i--) {
            forHollow(i);
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print("  ");
            }
            forHollow(i);
            System.out.println();
        }
    }

    public static void forHollow(int i) {
        for (int j = 1; j <= i; j++) {
            if (i == 1 || j == 1 || j == i) {
                System.out.print("* ");
            } else {
                System.out.print("  ");
            }
        }
    }

    public static void hollowRhombus(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || j==1 || j==n) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void printHalfPyramid(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void printInvertedHalfPyramid(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = n - i + 1; j >= 1; j--) {
                System.out.print(i);
            }
            System.out.println();
        }
    }

//    public static void pascalTriangle(int)

}
