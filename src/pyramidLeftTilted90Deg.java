public class pyramidLeftTilted90Deg {

    public static void main(String[] args)
    {
        int n = 10;
        for(int i1=0;i1<n;i1++){
            for(int i2=n-1;i2>=0;i2--){
                if(i2<=i1)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println("");
        }
        int n1 = n-1;
        for(int i1=0;i1<n1;i1++){
            System.out.print("  ");
            for(int i2=0;i2<n1;i2++){
                if(i2>=i1)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println("");
        }


    }
}
