import java.util.Scanner;

public class invertedPyramid {
    public static void main(String[] args) {
        Scanner S = new Scanner( System.in);
        int n = S.nextInt();
        int t = n*2-1;
        for(int i1=0;i1<n;i1++){
            for(int i2=0;i2<t;i2++){
                if(i2>=i1&&i2<t-i1)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println("");

        }
    }
}
