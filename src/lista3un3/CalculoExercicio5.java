
package lista3un3;
import java.util.Scanner;
import java.text.DecimalFormat;

public class CalculoExercicio5 {
    float n, resposta;
    int contador=0;
    Scanner imput = new Scanner(System.in);
    DecimalFormat df = new DecimalFormat("##########");
    
    void mostrarRepeticao() {
        while (contador<10) {
            contador=contador+1;
            System.out.println("Entre com 10 números. Será mostrado o triplo de cada um.");
            n=imput.nextFloat();
            resposta = n*3;
            System.out.println("O triplo do número digitado é: "+ df.format(resposta));
        }
    }
}
    