import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        System.out.println("Enter the number: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        boolean isPrime = true;
        if (number < 2){
            isPrime = false;
        } else {
            for (int i= 2;i<=Math.sqrt(number);i++){
                if(number % i ==0){
                    isPrime = false;
                    break;
                } else isPrime = true;
            }
        }
        if (isPrime){
            System.out.println(number + " is prime");
        } else {
            System.out.println(number + " is not prime");
        }
    }
}
