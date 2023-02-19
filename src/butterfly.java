import java.util.Scanner;

public class butterfly {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        int n = S.nextInt();
        int half = n/2;
        for(int i1=1;i1<=n;i1++){
            for(int i2=1;i2<=n;i2++){
                if(i2<=i1 || i2> (n-i1))
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println("");
        }
    }
}
