
package lista3un3;

/**
 *
 * @author 207357
 */
public class CalculoExercicio4 {
    float salarioFun;
    int codigo;
    
    public float mostrarAumento() {
        if (codigo == 101){
            return salarioFun*1.1f;
        }else if (codigo == 102) {
            return salarioFun*1.2f;
        }else if (codigo == 103) {
            return salarioFun*1.3f;
        } else {
            return salarioFun*1.4f;
        }
    }
}
