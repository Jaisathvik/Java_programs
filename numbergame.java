import java.util.Scanner;

public class numbergame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = 1 + (int) (100 
                                * Math.random());
        int k = 5;
        int i, guess;

        System.out.println(" A number is chosen "
        +" Between 1 and 100 "
        +" Guess the Number "
        +" Within 5 attempts. ");

        for (i=0; i < k; i++) {
            System.out.println(" Guess the Number ");

            guess = sc.nextInt();
        
        if (number == guess) {

            System.out.println(" Congratulations"
            + "You Guessed the Number! ");
            break;
        }
        else if (number > guess
        && i !=k-1) {
            System.out.println("The Number is Greater than " + guess);
        }
        else if (number < guess
        && i !=k-1) {
            System.out.println("The Number is Less than " + guess);
        }
    }
    if (i == k) {
        System.out.println(
            "You have exhausted "+" 5 trials.");

        System.out.println("The number was "+ number);

    }
}}
