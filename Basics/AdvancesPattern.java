public class AdvancesPattern{
    
    public static void hollow_rectangle(int toRows, int toCols)
    {
        for(int i=1; i<= toRows; i++)
        {
            for(int j =1; j <= toCols; j++)
            {
                if(i ==1 || i == toRows || j == 1 || j == toCols)
                {
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void pyramid(int n)
    {
        for(int i=1; i<=n;i++)
        {
            for(int j=1; j<=n-i; j++)
            {
                System.out.print("  ");
            }
            for(int j=1; j<=i; j++)
            {
                System.out.print(" *");
            }
            System.out.println();
        }
    }

    public static void num_Pyramid(int n)
    {
        
        for(int i =1; i<=n;i++)
        {
            for(int j =1; j<= n-i+1; j++)
            {
                
                System.out.print(j);
            }
           
            System.out.println();
        }
    }

    public static void floyd(int n){
        int count =1;
        for(int i=1; i<=n;i++)
        {
            for(int j=1; j<=i;j++)
            {
                System.out.print(count +" ");
                count++;
            }
            System.out.println();
        }
    }

    public static void tri(int n)
    {
        for(int i=1; i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                if((i+j) % 2 == 0 )
                {
                    System.out.print("1");
                }else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }

    public static void butterfly(int n)
    {
        //1st half
        for(int i=1; i<=n;i++)
        {
            for(int j=1; j<=i; j++)
            {
                System.out.print("*");
            }
            for(int j =1; j<=(2*(n-i));j++)
            {
                System.out.print(" ");
            }
            for(int j=1; j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

        //2nd half
        for(int i=n; i>=1; i--)
        {
             for(int j=1; j<=i; j++)
            {
                System.out.print("*");
            }
            for(int j =1; j<=(2*(n-i));j++)
            {
                System.out.print(" ");
            }
            for(int j=1; j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void rhombus(int n){
        for(int i=1; i<=n;i++)
        {
            for(int j =1; j<=(n-i); j++)
            {
                System.out.print("  ");
            }
            for(int j=1; j<=n;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void hollow_rhom(int n)
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=1; j<=(n-i);j++)
            {
                System.out.print(" ");
            }
            for(int j=1; j<=n; j++)
            {
                if(i==1 || i==n || j==1 || j==n)
                {
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();

        }
    }

    public static void diamond(int n)
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n-i ;j++)
            {
                System.out.print(" ");
            }
            for(int j=1; j<=2*(i-1)+1; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i=n;i>=1;i--)
        {
           for(int j=1;j<=n-i ;j++)
            {
                System.out.print(" ");
            }
            for(int j=1; j<=2*(i-1)+1; j++)
            {
                System.out.print("*");
            }
            System.out.println(); 
        }
    }

    public static void numpyram(int n)
    {
        for(int i=1; i<=n;i++)
        {
            for(int j=1; j<=n-i; j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print(i +" ");
            }
            System.out.println();
        }
    }

    public static void paliNum(int n)
    {
      for(int i=1;i<=n;i++)
      {
        for(int j=1; j<=n-i;j++)
        {
            System.out.print(" ");
        }
        for(int j=i;j>=1;j--)
        {
            System.out.print(j);
        }
        for(int j=2; j<=i;j++)
        {
            System.out.print(j);
        }
        System.out.println();
      }
    }

    public static void main(String arg[])
    {
    //   hollow_rectangle(4, 5);
    //pyramid(4);
    //num_Pyramid(5);
    //floyd(5);
    //tri(5);
    //butterfly(4);
    //rhombus(5);
    //hollow_rhom(5);
    //diamond(4);
    //numpyram(5);
    paliNum(7);
    }
}