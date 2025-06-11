import java.util.Scanner;
//1.Kunal is allowed to go out with his friends only on the even days of a given month.
// Write a program to count the number of days he can go out in the month of August.


//2.Write a program to print the sum of negative numbers,
// sum of positive even numbers and the sum of positive odd numbers from a list of numbers (N) entered
// by the user. The list terminates when the user enters a zero.





public class Conditions_Day03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

//        int count=0;
//        for(int i=1;i<=28;i++){
//            if(i%2==0){
//                count++;
//            }
//        }
//        System.out.println("Kunal goes "+count+" days to play with frineds.");

        int sumNeg= 0;
        int sumEven=0;
        int sumOdd=0;

        while(true){
            System.out.print("Enter the Number & 0 to Stop: ");
            int number = in.nextInt();
            if(number==0){
                System.out.println("Quitting.");
                break;
            }
            if(number<0){
                sumNeg += number;
            }
            else if(number %2==0){
                    sumEven += number;
                }
            else{
                    sumOdd += number;
                }
            }
        System.out.println("Sum of negative numbers: " + sumNeg);
        System.out.println("Sum of positive even numbers: " + sumEven);
        System.out.println("Sum of positive odd numbers: " + sumOdd);
        }

    }
