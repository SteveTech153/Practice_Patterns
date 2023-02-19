import java.util.Scanner;

public class kalai {
    public static void main(String[] args) {
        Scanner S = new Scanner( System.in);
        int n = S.nextInt();
        int t=n-1;
        for(int i1=0;i1<n;i1++){
            //K
            for (int i2 = 0; i2 < n; i2++) {
                if ((i2 == Math.abs( i1 - (n / 2 ) ) || i2 == 0))
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            //K
            //A
            for(int i2=0;i2<n*2-1;i2++){
                if(i2==t-i1||i2==t+i1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            //A
            //L
            for(int i2=0;i2<n;i2++){
                if(i1==n-1&&i2!=0)
                    System.out.print(" *");
                else if(i2==0)
                    System.out.print("   *");
                else
                    System.out.print("  ");
                if(i2==n-1)
                    System.out.print("  ");
            }
            //L

            //A
            for(int i2=0;i2<n*2-1;i2++){
                if(i2==t-i1||i2==t+i1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            //A

            //I
            System.out.print("   *");

            System.out.println("");

        }
    }
}
