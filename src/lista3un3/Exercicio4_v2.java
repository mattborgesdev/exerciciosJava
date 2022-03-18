
package lista3un3;
import java.util.Scanner;
/**
 *
 * @author 207357
 */
public class Exercicio4_v2 {

    public static void main(String[] args) {
        Scanner imput = new Scanner(System.in);
        CalculoExercicio4_v2 mostrar = new CalculoExercicio4_v2();
        
        System.out.println("Digite o salário do funcionário");
        mostrar.salarioFun=imput.nextFloat();
        System.out.println("******************************");
        System.out.println("*  Código   |     Cargo      *");
        System.out.println("*   101     |     Gerente    *");
        System.out.println("*   102     |     Engenheiro *");
        System.out.println("*   103     |     Técnico    *");
        System.out.println("******************************");
        System.out.println("Digite o código do seu cargo de acordo com a tabela acima");
        mostrar.codigo=imput.nextInt();
        
        System.out.println("**********************************************************");
        System.out.println("O novo salário é: "+ mostrar.mostrarAumento());
    }
    
}
