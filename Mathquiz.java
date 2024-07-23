import java.util.Scanner;
public class Mathquiz {
    public static void main(String[] args) {
        System.out.println("");
        System.out.println("This is a short math quiz to test your knowledge --"+" You will have to answer five questions: --");
        System.out.println("");
        boolean correctAnswer = true;
        boolean wrongAnswer = false;
        try ( Scanner sc = new Scanner(System.in) ) {
        System.out.println("Question #1:");
        System.out.println("");
        System.out.println("17 * 4");
        int num = sc.nextInt();
        if (num==68) {
            System.out.println("");
            System.out.println(correctAnswer);  
            System.out.println("");     
        }
        if (num!=68) {
            System.out.println("");
            System.out.println(wrongAnswer);
            System.out.println("");
            System.out.println("The Answer was "+17*4);
            System.out.println("");
        }
        System.out.println("Question #2:");
        System.out.println("");
            System.out.println("49 / 7");
            int tum = sc.nextInt();
            if (tum==7) {
                System.out.println("");
                System.out.println(correctAnswer);  
                System.out.println("");     
            }
            if (tum!=7) {
                System.out.println("");
                System.out.println(wrongAnswer);
                System.out.println("");
                System.out.println("The Answer was "+49/7);
                System.out.println("");
            }
            System.out.println("Question #3:");
            System.out.println("");
            System.out.println("223 + 462");
            int bum = sc.nextInt();
            if (bum==685) {
                System.out.println("");
                System.out.println(correctAnswer);    
                System.out.println("");   
            }
            if (bum!=685) {
                System.out.println("");
                System.out.println(wrongAnswer);
                System.out.println("");
                System.out.println("The Answer was "+(223+462));
                System.out.println("");
            }
            System.out.println("Question #4:");
            System.out.println("972 - 833");
            int dum = sc.nextInt();
            if (dum==139) {
                System.out.println("");
                System.out.println(correctAnswer);  
                System.out.println("");     
            }
            if (dum!=139) {
                System.out.println(wrongAnswer);
                System.out.println("");
                System.out.println("The Answer was "+(972-833));
                System.out.println("");
            }
            System.out.println("Question #5:");
            System.out.println("");
            System.out.println("64 + 2 * 90");
            int wum = sc.nextInt();
            if (wum==244) {
                System.out.println("");
                System.out.println(correctAnswer);       
                System.out.println("");
            }
            if (wum!=244) {
                System.out.println(wrongAnswer);
                System.out.println("");
                System.out.println("The Answer was "+(64+2*90));
                System.out.println("");
            }
            System.out.println("");
            System.out.println("Congratulations, "+"You completed the quiz! --");
            System.out.println("");
        }
    }
        }
            
    