import java.util.Scanner;

public class MirroredRightAngleTriangle {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        int n = S.nextInt();
        for (int i1 = 0; i1 < n; i1++) {
            for (int i2 = n-1; i2>=0; i2--) {
                if (i2 == 0 || i2 == i1 && i2 <n/2)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println("");
        }
    }
}