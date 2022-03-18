
package lista3un3;

/**
 *
 * @author 207357
 */
public class CalculoExercicio4_v2 {
    float salarioFun;
    int codigo;
    
    public float mostrarAumento() {
    switch (codigo)
        {
            case 101:
            {
                return salarioFun*1.1f;
        }
            case 102:
            {
                return salarioFun*1.2f;
        }
            case 103:
        {
                return salarioFun*1.3f;
        }
            default:
                return salarioFun*1.4f;
        }
    }
}
