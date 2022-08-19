public class Binary{

    public static void binToDec(int binNUM){
        int myNum = binNUM;
        int pow =0;
        int dec =0;

        while(binNUM > 0)
        {
            int lastD = binNUM % 10;
            dec = dec + (lastD * (int) Math.pow(2, pow));
            pow++;
            binNUM = binNUM /10;
        }
        System.out.print("deciaml of "+ myNum +" = "+ dec);
    }

    public static void decToBin(int num){
        int myNum1 = num;
        int pow =0;
        int bin =0;
        while(num > 0)
        {
           int rem = num % 2;
           bin = bin + rem *(int) Math.pow(10, pow);
           pow++;
           num = num /2;
        }
        System.out.print("binary form of "+ myNum1+" = "+ bin);
    }

    public static void main(String args[]){
    //   binToDec(1000);
    decToBin(11);
    }
}