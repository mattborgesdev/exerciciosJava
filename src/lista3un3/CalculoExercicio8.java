
package lista3un3;
import java.util.Scanner;
/**
 *
 * @author Wesley games
 */
public class CalculoExercicio8 {
    int i, idade, aux=0, contadoridade20, mediaidade, media, aux3=0,  mediaaltura20, contadorpeso, contadoridade;
    float peso, altura, mediapeso;
    
    Scanner imput = new Scanner(System.in);
    void mostrarRepeticao() {
        for (i=0;i<2;i++) {
            System.out.println("Digite o peso do jogador");
            peso=imput.nextFloat();
            if (peso>70)
                contadorpeso=contadorpeso+1;
            System.out.println("Digite a idade do jogador");
            idade=imput.nextInt();
                contadoridade=idade+1;
                mediaidade=contadoridade/i;
            if (idade<20)
                contadoridade20=contadoridade20+1;
            System.out.println("Digite a altura do jogador");
            altura=imput.nextFloat();
            if (idade<20)
                mediaaltura20+=idade;
               
        }
    mediapeso = i*(contadorpeso/100);
    }
    
}
