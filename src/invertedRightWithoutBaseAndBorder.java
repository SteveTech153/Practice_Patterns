import java.util.Scanner;

public class invertedRightWithoutBaseAndBorder {
    public static void main(String[] args) {
        Scanner S = new Scanner( System.in);
        int n = S.nextInt();
        int n1 = n/2;
        int t;
        for(int i1=0;i1<n1;i1++){
            for (int i2 = n1-1; i2>=0; i2--) {
                if (i2 == 0 || i2 == i1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }


            System.out.println("");
        }
        
    }

}
