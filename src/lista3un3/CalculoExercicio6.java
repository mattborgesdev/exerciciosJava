
package lista3un3;
import java.util.Scanner;

public class CalculoExercicio6 {
    int aux, n, i;
    Scanner imput = new Scanner(System.in);
    
    void mostrarRepeticao() {
        for (i=0;i<12;i++) {
            System.out.println("Digite um número.");
            n=imput.nextInt();
            aux+=n;
        }
        System.out.println("A soma é: "+aux);
    }
}
