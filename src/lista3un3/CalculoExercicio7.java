
package lista3un3;
import java.util.Scanner;

public class CalculoExercicio7 {
    int aux, n, i;
    float resultado;
    Scanner imput = new Scanner(System.in);
    
    void mostrarRepeticao() {
        for (i=0;i<13;i++) {
            System.out.println("Digite um número.");
            n=imput.nextInt();
            aux+=n;
        }
        resultado=aux/i;
        System.out.println("A média é: "+resultado);
    } 
}
