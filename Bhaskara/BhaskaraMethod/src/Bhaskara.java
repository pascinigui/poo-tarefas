import java.util.Scanner;

public class Bhaskara {
    public static void main (String[] args) {
    double deltaVar, R1, R2;
    double a, b, c;

    Scanner scan = new Scanner (System.in); 

    System.out.print("\nDigite o valor de A: ");  
    a = scan.nextDouble();

    System.out.print("Digite o valor de B: ");  
    b = scan.nextDouble(); 

    System.out.print("Digite o valor de C: ");  
    c = scan.nextDouble(); 
    
    deltaVar = (b * b) - (4 * a * c);
    R1 = (-b + Math.sqrt(deltaVar))/(2*a);
    R2 = (-b + Math.sqrt(deltaVar))/(2*a);

    if (a==0 || deltaVar<0) {
        System.out.println("\nNão é possível efetuar o calculo.");
    }else
        {
            System.out.println("\nCalculo R1 = "+R1+"");
            System.out.println("Calculo R2 = "+R2+"\n");
        }
    }
}