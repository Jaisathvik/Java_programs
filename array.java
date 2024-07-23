import java.util.Scanner;
public class array {
    public static void main(String[] args) {
        String[] sports = new String[]{"s","1. Soccer","2. Cricket","3. Field Hockey","4. Tennis","5. Volleyball","6. Table Tennis","7. Baseball","8. Golf","9. Basketball","10. American Football"};

      try( Scanner sc = new Scanner(System.in) ) {

        System.out.println("Enter a Number From 1 - 10"+" to See Which Sports Are The Most Popular: -");
        int num = sc.nextInt();
        if (num!=1 && num!=2 && num!=3 && num!=4 && num!=5 && num!=6 && num!=7 && num!=8 && num!=9 && num!=10){
        System.out.println("You Entered A Wrong Number --");
        }
        if (num==1){
        System.out.println(sports[1]);
        }
        if (num==2){
        System.out.println(sports[2]);
        }
        if (num==3){
        System.out.println(sports[3]);
        }
        if (num==4){
        System.out.println(sports[4]);
        }
        if (num==5){
        System.out.println(sports[5]);
        }
        if (num==6){
        System.out.println(sports[6]);
        }
        if (num==7){
        System.out.println(sports[7]);
        }
        if (num==8){
        System.out.println(sports[8]);
        }
        if (num==9){
        System.out.println(sports[9]);
        }
        if (num==10){
        System.out.println(sports[10]);
        }
        
    }

    }
    }
