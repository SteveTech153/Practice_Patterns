import java.util.Scanner;

public class reverseLeftTriangle {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        int n = 3;
       for(int i1=0;i1<n;i1++){
           for(int i2=0;i2<n;i2++){
               if(i2>=i1)
                    System.out.print("*");
               else
                   System.out.print(" ");

           }
           System.out.println("");
       }
    }
}
