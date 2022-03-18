
package lista3un3;

/**
 *
 * @author 207357
 */
public class CalculoExercicio3 {
    float n1, n2;
    int op;
    
    public float mostrarOpcao() {
        switch (op) {
            case 1: {
                return ((n1+n2)/2);
            }
            case 2: {
                return n1*n2;
            }
            case 3: {
                return n1/n2;
            }
            case 4: {
                if (n1>n2) 
                    return n1-n2;
                else if (n2>n1)
                    return n2-n1;
                else
                    return n1+n2-n1-n2;
            }
        }
        return 0;
    }
}
