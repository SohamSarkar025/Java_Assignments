/*
1.Input a year and find whether it is a leap year or not.
2.Take two numbers and print the sum of both.
3.Take a number as input and print the multiplication table for it.
4.Take 2 numbers as inputs and find their HCF and LCM.
5.Keep taking numbers as inputs till the user enters ‘x’, after that print sum of all.
 */
import java.util.Scanner;
public class Basics_Day01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //Main Function for First Program.
        System.out.print("Enter a Year: ");
        int year = in.nextInt();
        String result = leapYear(year);
        System.out.println(result);

        //Main Function for Second Program.
        System.out.print("Enter first number:");
        double n1= in.nextDouble();
        System.out.print("Enter second number:");
        double n2=in.nextDouble();
        double res = twoSum(n1,n2);
        System.out.print("The sum is : "+res);

        //Main Function for Third Program.

        System.out.println(" ");
        System.out.print("Enter the number(Multiplication Table): ");
        int multiplicationVar = in.nextInt();
        multiplicationTable(multiplicationVar);

        //Main Function for Fifth Program.
        double sum =0;
        while(true){
            System.out.print("Enter a number or Press X to exit: ");
            String input = in.next();
            if (input.equalsIgnoreCase("x")) {
                break;
            }

            int number = Integer.parseInt(input);
            sum += number;
        }
        System.out.println("The sum of inputed Number is :"+sum);

        System.out.println("Find HCF & LCM");
        System.out.print("Enter first number: ");
        int num1 = in.nextInt();
        System.out.println(" ");
        System.out.print("Enter second number: ");
        int num2= in.nextInt();
        int hcfRes = findHcf(num1,num2);
        System.out.print("The HCF is :"+hcfRes);
        int lcmRes = findLcm(num1,num2);
        System.out.println(" ");
        System.out.print("The LCM is :"+lcmRes);
    }

//    1900 → divisible by 100 but not 400 → ❌ Not a Leap Year
//    2000 → divisible by 100 and 400 → ✅ Leap Year
    public static String leapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)){
            return "Leap Year";
        }
        return "Not Leap Year.";
    }

    public static double twoSum(double n1,double n2){
        return n1+n2;
    }

    public static void multiplicationTable(int num){
        for(int i=1;i<=10;i++){
            System.out.print(num*i+" , ");
        }
    }
    public static int findHcf(int a,int b){
        while(b!=0){
            int temp = b;
            b= a%b;
            a=temp;
        }
        return a;
    }
    public static int findLcm(int a,int b){
        int hcf = findHcf(a,b);
        return (a*b)/hcf;
    }
}
