import java.util.*;

public class FunProblem{
   
   public static int avgThree(int a, int b, int c)
   {
    int sum = a+b+c;
    int av = sum /3;
    return av;
   }

   public static boolean isEven(int n){

    if( n % 2 == 0)
    {
        return true;
    }
    return false;
   }

   public static int reverse(int n){
    int rev =0;
    while(n > 0){
        int rem = n % 10;
          rev = (rev * 10 )+ rem;
          n = n / 10;
    }
    return rev;
   }

   public static boolean palindrome(int n)
   {
    if(reverse(n) == n)
    {
        return true;
    }
    return false;
   }

   public static int sumDigit(int n)
   {
   int sum =0;

    while(n >0)
    {
        int ld = n % 10;
        sum = sum + ld;
        n = n / 10;
    }
    return sum;
   }

    public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);
      //int n = sc.nextInt();  
      //System.out.print(avgThree(3,5,7));
      //System.out.print(isEven(n));
      //System.out.print(palindrome(n));
      //System.out.print(sumDigit(n));

      int a = 28;
      int b = 4;

      System.out.println("Maximun : "+Math.max(a,b));
      System.out.println("Minimum: "+Math.min(a,b));
      System.out.println("sqaure root: "+ Math.sqrt(a));
      System.out.println("Power: "+ Math.pow(2,b));
      System.out.println("Average: "+ Math.abs(23.44));
    }
}