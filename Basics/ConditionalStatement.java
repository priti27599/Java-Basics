import java.util.*;

public class ConditionalStatement{
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        // int A = sc.nextInt();
        // int B = sc.nextInt();

        // if(A >= B)
        // {
        //     System.out.print("A is Greater");
        // }else{
        //     System.out.print("B is Greater");
        // }
        // int num = sc.nextInt();

        // if(num %2 == 0)
        // {
        //     System.out.print("Even");
        // }else{
        //     System.out.print("Odd");
        // }

        // int income = sc.nextInt();
        // int tax;

        // if(income < 500000){
        //    tax =0;
        // }else if(income >=500000 && income <1000000)
        // {
        //     tax =  (int)(income * 0.2);
        // }
        // else{
        //     tax = (int)(income * 0.3);
        // }

        // System.out.print("Your tax is "+ tax);

        // int A =1;
        // int B =3;
        // int C = 6;

        // if((A >= B) && (A >= C))
        // {
        //     System.out.println("A is largest.");
        // }
        // else if(B >=C)
        // {
        //     System.out.println("B is largest.");
        // }
        // else{
        //     System.out.println("C is largest.");
        // }

    //    int marks = sc.nextInt();
    //    String Result = ((marks>= 33)? "Pass":"Fail");
    //    System.out.println(Result);

    // int number =2;
    // switch(number){
    //     case 1: System.out.println("samosa");
    //     break;
    //     case 2: System.out.println("burger");
    //     break;
    //     case 3: System.out.println("Mango Shake");
    //     break;
    //     default: System.out.println("We wake up");
    // }
// System.out.print("Enter a Value: ");
//     int a = sc.nextInt();
//     System.out.print("Enter b Value: ");
//     int b = sc.nextInt();
//     System.out.print("Enter operator: ");
//     char operator = sc.next().charAt(0);

//     switch(operator){
//         case '+': System.out.println(a + b);
//         break;

//         case '-': System.out.println(a - b);
//         break;

//         case '*': System.out.println(a * b);
//         break;

//         case '/': System.out.println(a/b);
//         break;

//         case '%': System.out.println(a%b);
//         break;

//         default: System.out.println("Wrong operator");
//     }


// int num = sc.nextInt();

// if( num >0){
//     System.out.print("Positive");
// }else{
//     System.out.print("Negative");
// }

//    double temp = 103.5;

//    if( temp > 100)
//    {
//     System.out.print("You have a fever");
//    }
//    else{
//     System.out.print("You don't have a fever.");
//    }

//    int num = sc.nextInt();

//    switch(num){
//     case 1: System.out.print("Sunday");
//     break;

//     case 2: System.out.println("Monday");
//     break;

//     case 3: System.out.println("Tuesday");
//     break;

//     case 4: System.out.println("Wednesday");
//     break;

//     case 5: System.out.println("Thusday");
//     break;

//     case 6: System.out.println("Friday");
//     break;

//     case 7: System.out.println("Saturday");
//     break;

//     default: System.out.print("Wrong week Number");
//    }


// int a = 63, b=36;
// boolean x = (a<b)? true: false;
// int y = (a>b)? a:b;
// System.out.println(x);
// System.out.println(y);


//   int year = sc.nextInt();

//   if(year % 4 ==0){
//     if(year % 100 == 0)
//     {
//       if(year % 400 == 0)
//       {
//         System.out.println("Leap Year");
//       }
//     }else{
//         System.out.println("Leap Year");
//     }
//   }else{
//     System.out.println("Not a Leap year");
//   }


System.out.print("Input the year: ");
int year = sc.nextInt();

boolean x = (year % 4)==0;
boolean y = (year % 100) != 0;
boolean z = ((year % 100 == 0) && (year % 400 == 0));

if(x && (y || z)){
    System.out.println(year +" is a leap year");
}else {
    System.out.println(year + " is not a leap year");
}

    }
}