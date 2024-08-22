import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PrincipalTest {
    @Test
    public void calcularFatorialTest(){
        int numero = 5;
        int esperado = 120;
        int resultado = Principal.calcularFatorial(numero);
        Assertions.assertEquals(esperado, resultado);
    }
}
