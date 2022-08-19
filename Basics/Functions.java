import java.util.*;

public class Functions{
    public static void printHelloWorld(){
        System.out.print("Hello World");
        return;
    }

    public static int calculateSum(int num1, int num2){
      int sum = num1 + num2;
     // System.out.print(sum);
      return sum;
    }

    public static int productnum(int num1, int num2){
        int mul = num1 * num2;
        return mul;
    }

    public static int factorial(int a)
    {
        int pro = 1;
        for(int i=1; i<=a;i++)
        {
            pro *=i;
        }
        return pro;
    }

    public static int binoCoe(int n, int r){
      int fact_n = factorial(n);
      int fact_r = factorial(r);
      int fact_nr = factorial(n-r);

      int bC = fact_n/(fact_r * fact_nr);
      return bC;
    }

    public static int sum(int a, int b){
      return a+b;
    }
    public static int sum(int a, int b, int c)
    {
      return a+b+c;
    }

    public static float sum(float a, float b)
    {
      return a+b;
    }

    public static boolean isPrime(int n){
      for(int i=2; i<=Math.sqrt(n); i++)
      {
        if(n % i == 0)
        {
          return false;
        }
      }
     return true;
    }

    public static void primeInRange(int n)
    {
      
      for(int i=1 ; i<= n; i++)
      {
        if (isPrime(i) == true)
        {
          System.out.println(i);
        }
      }
    }

    public static void main(String args[]){
    //   printHelloWorld();
      Scanner sc = new Scanner(System.in);
      //int a = sc.nextInt();
     // int b = sc.nextInt();

    
    //  int sum = calculateSum(a,b);
    //  System.out.print(sum);
    // int mul = productnum(a,b);
    // System.out.print(mul);

    //int fac = factorial(a);
    // int n = sc.nextInt();
    // int r = sc.nextInt();
    // System.out.print(binoCoe(n,r));
    // System.out.println(sum(3,5));
    // System.out.println(sum(3,5,6));
    // System.out.println(sum(3.5f, 4.8f));
    //  System.out.println(isPrime(10));
    primeInRange(10);
    }
}