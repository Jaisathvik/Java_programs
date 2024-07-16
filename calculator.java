import java.util.Scanner;
public class calculator {
    
    public static void main(String[] args) {
        int n1;
        int n2;
        int n3;
        int cal;
        int quotient;
        int remainder;
        System.out.println("Enter 2 numbers:-");
        Scanner r=new Scanner(System.in);
        System.out.println("Enter First Number:-");
        n1=r .nextInt();
        System.out.println("Enter the Second Number:-");
        n2=r .nextInt();
        System.out.println("Pick an Operation:-");
        System.out.println("1 - Add");
        System.out.println("2 - Subtract");
        System.out.println("3 - Multiply");
        System.out.println("4 - Divide");
        System.out.println("Enter the Operations Number");
        Scanner s=new Scanner(System.in);
        n3=s .nextInt();

        if (n3==1) {
            cal=n1+n2;
            System.out.println("Sum Of Both Numbers:- "+cal);
            }
            else if (n3==2) {
                cal=n1-n2;
                System.out.println("Difference Of Both Numbers:- "+cal);

            }
            else if (n3==3) {
                cal=n1*n2;
                System.out.println("Product Of Both Numbers:- "+cal);
            }
            else if (n3==4) {
                quotient=n1/n2;
                remainder=n1%n2;
                System.out.println("Quotient Of Both Numbers:- "+quotient);
                System.out.println("Remainder Of Both Numbers:- "+remainder);
            }       
        }
}
