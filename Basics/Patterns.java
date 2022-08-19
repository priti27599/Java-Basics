import java.util.*;

public class Patterns{
    public static void main(String args[]){
    //    for(int i=1; i<=4;i++)
    //    {
    //     for(int j=1; j<=i; j++)
    //     {
    //         System.out.print("*");
    //     }
    //     System.out.println();
    //    }

     Scanner sc = new Scanner (System.in);
     int n = sc.nextInt();

    //  for(int i=n; i>=1; i--)
    //  {
    //     for(int j = 1; j<=i ;j++)
    //     {
    //         System.out.print("*");
    //     }
    //     System.out.println();
    //  }
     
    //  for(int i=1; i<=n ;i++)
    //  {
    //     for(int star = 1; star<= n-i+1; star++)
    //     {
    //         System.out.print("*");
    //     }
    //     System.out.println();
    //  }

    // for(int i=1; i<=n; i++)
    // {
    //     for(int j=1;j<=i;j++)
    //     {
    //         System.out.print(j+" ");
    //     }
    //     System.out.println();
    // }

    char ch = 'A';

    for(int line = 1; line<=n ; line++)
    {
        for(int chars = 1; chars<=line; chars++)
        {
            System.out.print(ch);
            ch++;
        }
        System.out.println();
    }
    }
}