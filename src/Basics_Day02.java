import java.util.Scanner;
public class Basics_Day02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

       //Prime Numbers Main Method
//        System.out.print("Enter the lower Number: ");
//        int l = in.nextInt();
//        System.out.println();
//        System.out.print("Enter the Upper Number: ");
//        int u= in.nextInt();
//        for(int i=l;i<=u;i++){
//            if(isPrime(i)) {
//                System.out.print(i+", ");
//            }
//        }

        //Armstrong Number Main Method
//        System.out.print("Enter a number to Check is is Armstrong or not : ");
//        int arm= in.nextInt();
//        boolean res = isArm(arm);
//        if(res){
//            System.out.println(arm + " is a Armstrong Number.");
//        }
//        else{
//            System.out.println(arm + " is not a Armstrong Number.");
//        }

        //Fibonacci Series
//        System.out.print("Enter the number: ");
//        int fibo = in.nextInt();
//        fiboNacci(fibo);

        //Palindrome Main Mathod
//        System.out.print("Enter a number to check if it is Palindrome or not: ");
//        int pal = in.nextInt();
//        boolean resPal = palinDrome(pal);
//        if(resPal){
//            System.out.println(pal+" is Palindrome!");
//        }else{
//        System.out.println(pal+" is not Palindrome!");
//        }


    }
    //Prime Number Function
    static boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

    //Armstrong Number Function
    static boolean isArm(int n){
        int temp = n;
        int sum=0;
        while(n>0){
            int rem = n%10;
            sum += (rem*rem*rem);
            n /=10;
        }
        return sum == temp;
    }

    //Fibonacci Series
    static void fiboNacci(int n){
        int a=0;
        int b=1;
        for(int i=1;i<=n;i++){
            System.out.print(a+" , ");
            b=a+b;
            a=b;
        }
    }

    //Palindrome Check
    static boolean palinDrome(int n){
        int temp = n;
        int sum=0;
        while(n>0){
            int rem = n %10;
            sum = (sum*10)+rem;
            n /=10;
        }
        return sum==temp;
    }
}
