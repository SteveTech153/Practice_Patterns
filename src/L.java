import java.util.Scanner;

public class L {
    public static void main(String[] args) {
        Scanner S = new Scanner( System.in);
        int n = S.nextInt();
        for(int i1=0;i1<n;i1++){
            for(int i2=0;i2<n;i2++){
                if(i1==n-1||i2==0)
                    System.out.print("* ");
                else
                    System.out.print(" ");
            }
            System.out.println("");
        }
    }
}
