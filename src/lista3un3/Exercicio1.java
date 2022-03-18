
package lista3un3;
import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {
        Scanner imput = new Scanner(System.in);
        CalculoExercicio1 mostrar = new CalculoExercicio1();
        
        System.out.println("Digite o 1º número");
        mostrar.n1=imput.nextFloat();
        System.out.println("Digite o 2º número");
        mostrar.n2=imput.nextFloat();
        
        System.out.println("O maior é: " +mostrar.comparaNumeros());
    }
    
}
