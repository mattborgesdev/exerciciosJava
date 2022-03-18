
package lista3un3;
import java.util.Scanner;

/**
 *
 * @author 207357
 */
public class Exercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner imput = new Scanner(System.in);
        CalculoExercicio2 mostrar = new CalculoExercicio2();
        
        System.out.println("Digite o salário do funcionário");
        mostrar.salarioFun=imput.nextFloat();
        
        System.out.println("O novo salário = "+ mostrar.calcRemuneracao());
    }
    
}
