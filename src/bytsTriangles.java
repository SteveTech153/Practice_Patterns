import java.util.Scanner;

public class bytsTriangles {
    public void bytsTrianglePatter(int n){
        int initialSpace = 0,initialSpaceAdder = 0;
        int btwSpace = 1, btwSpaceAdder = 1;
        int colSub=0;
        for(int i1=0;i1<n;i1++){
            //INITIAL SPACE - i3
            if(i1==1) initialSpace=1;
            for(int i3=0;i3<initialSpace;i3++){
                System.out.print(" ");
            }
            initialSpace+=initialSpaceAdder;
            if(initialSpaceAdder==1)
                initialSpaceAdder+=1;
            else
                initialSpaceAdder+=2;

            //
            btwSpace = 0;
            for(int i2=0;i2<n-colSub;i2++){
                //for printing numbers
                for(int i3=0;i3<=i1;i3++){
                    System.out.print((i3+1));
                    if(i3!=i1)
                        System.out.print(" ");
                }
                //for printing spaces btw
                if(i1==0 && i2==0) btwSpace=1;
                for(int i4=0;i4<btwSpace;i4++){
                    System.out.print(" ");
                }
                if(btwSpace==1)
                    btwSpace+=1;
                else
                    btwSpace+=2;
            }
            colSub++;
            System.out.println("");
        }
    }
    public static void main(String[] args) {
        Scanner S = new Scanner( System.in);
        //int n = S.nextInt();
        //int i1,i2,i3,i4,i5;
       new bytsTriangles().bytsTrianglePatter(10);

    }
}
