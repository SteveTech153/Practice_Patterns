import java.util.Scanner;

public class pyramid {
    public static void main(String[] args) {
        Scanner S = new Scanner( System.in);
        int n = S.nextInt();
        int t=n-1;
        for(int i1=0;i1<n;i1++){
            for(int i2=0;i2<n*2-1;i2++){
                if((i2==t-i1||i2==t+i1) ||i1==t)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println("");
        }
    }
}
