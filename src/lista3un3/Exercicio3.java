
package lista3un3;
import java.util.Scanner;
/**
 *
 * @author 207357
 */
public class Exercicio3 {

    public static void main(String[] args) {
        Scanner imput = new Scanner(System.in);
        CalculoExercicio3 mostrar = new CalculoExercicio3();
        
        System.out.println("O programa fará cálculos com números");
        System.out.println("Digite o 1º número: ");
        mostrar.n1=imput.nextFloat();
        System.out.println("Digite o 2º número: ");
        mostrar.n2=imput.nextFloat();
        
        System.out.println("*******************************************");
        System.out.println("As opções de operações são:");
        System.out.println("1. Média entre os números digitados.");
        System.out.println("2. Produto entre os números digitados.");
        System.out.println("3. DIvisão do primeiro pelo segundo.");
        System.out.println("4. Diferença do maior pelo menor.");
        System.out.println("*******************************************");
        System.out.println("Digite a opção desejada");
        mostrar.op=imput.nextInt();
        
        System.out.println("O resultado da opção desejada é: "+ mostrar.mostrarOpcao());
    }
    
}
