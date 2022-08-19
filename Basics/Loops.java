import java.util.*;

public class Loops{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        // int counter = sc.nextInt();
        // int i =1;

        // while(i<= counter){
        //     System.out.println("Hello World");
        //     i++;
        // }
        // System.out.println("Printed HW "+counter+" times");

        // int counter =1;
        // while(counter<=100){
        //     System.out.print(counter+" ");
        //     counter++;
        // }

        // int counter = sc.nextInt();
        // int i=1;
        // while(i<= counter){
        //     System.out.print(i + " ");
        //     i++;
        // }

        // int n = sc.nextInt();
        // int sum =0;
        // int i =1;
        // while(i<=n){
        //     sum = sum+i;
        //     i++;
        // }
        // System.out.print("Sum: "+sum);

        //for loop

        // for(int i=1;i<=100;i++)
        // {
        //     System.out.println(" Hello World ");
        // }

    //   for(int line =1; line <=4;line++)
    //   {
    //     System.out.println("* * * *");
    //   }

    // int line =1;
    // while(line <=4){
    //     System.out.println("* * * *");
    //     line++;
    // }

    // int num =10899;
    // while(num >0)
    // {
    //     int lastDigit = num % 10;
    //     System.out.print(lastDigit);
    //     num = num / 10;
    // }

    // int rev =0;
    // int n =10899;
    // while(n > 0)
    // {
    //     int lastDigit = n%10;
    //     rev = (rev * 10)+ lastDigit;
    //     n = n/10;
    // }
    // System.out.print(rev);

    // for(int i=1;i<=5;i++)
    // {
    //     if(i == 3){
    //         break;
    //     }
    //     System.out.println(i);
    // }
    // System.out.println("I am out of the loop");

    // do{
    //     System.out.print("Enter Your Number: ");
    //     int n = sc.nextInt();
    //     if(n % 10 == 0){
    //         break;
    //     }
    //     System.out.println(n);
    // }while(true);

    //  for(int i=1; i<=5;i++)
    //  {
    //     if(i == 3){
    //         continue;
    //     }
    //     System.out.println(i);
    //  }

    // do{
    //     System.out.print("Enetr number: ");
    //     int n = sc.nextInt();

    //     if(n % 10 ==0){
    //         continue;
    //     }
    //     System.out.println(n);
    // }while(true);

    // for(int i=0; i<5;i++)
    // {
    //     System.out.print("Hello");
    //     i+=2;
    // }

    // int num = sc.nextInt();
    //  int fac=1;
    // for(int i=1; i<=num;i++)
    // {
       
    //     fac *=i;

    // }
    // System.out.println(fac);
    // }

    //  int number;
    //  int choice;
    //  int evenSum = 0;
    //  int oddSum = 0;

    //  do{
    //     System.out.print("Enter the number ");
    //     number = sc.nextInt();

    //     if(number % 2 == 0){
    //         evenSum += number;
    //     }else {
    //         oddSum += number;
    //     }

    //     System.out.print("Do you want to continue? Press 1 for yes or 0 for 1 no");

    //     choice = sc.nextInt();
    //  } while(choice == 1);

    //  System.out.println("Sum of even numbers: "+ evenSum);
    //  System.out.println("Sum of odd numbers: "+ oddSum);


    System.out.print("Enter number: ");
    int n = sc.nextInt();
    for(int i=1; i<=10; i++)
    {
        System.out.println(n + " * "+ i + " = "+ n*i);
    }
}
}