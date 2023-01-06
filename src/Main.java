import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Linear Equation Resolver");
        System.out.println("Given a equation as 'a * x +b = c, please enter constants: ");
        System.out.println("a: ");
        double a= scanner.nextDouble();
        System.out.println("b: ");
        double b= scanner.nextDouble();
        System.out.println("c: ");
        double c= scanner.nextDouble();
        if (a!=0){
            double ans= (c-b)/a;
            System.out.println("Equation pass with x= "+ ans);
        }else if(b==c){
            System.out.println("The solution is all x");
        }else{
            System.out.println("No solution");
        }
    }
}