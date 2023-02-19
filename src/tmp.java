public class tmp {
    public static void main(String[] args) {
        int n =30;

        for (int i1 = 0; i1 < n; i1++) {
            //K
            for (int i2 = 0; i2 < n; i2++) {
                if ((i2 == Math.abs( i1 - (n / 2 - 1) ) || i2 == 0))
                    System.out.print("*");
                else
                    System.out.print(" ");
//                if (i1 < n / 2) {
//                    if ((i2 == n - 1 - i1 - 2 || i2 == 0))
//                        System.out.print("*");
//                    else
//                        System.out.print(" ");
//                }
//                else {
//                    if (i1 >= n / 2 && (i2 == i1 - (n / 2 - 1) || i2 == 0))
//                        System.out.print("*");
//                    else
//                        System.out.print(" ");
//                }

            }
            System.out.println();
        }
    }
}
