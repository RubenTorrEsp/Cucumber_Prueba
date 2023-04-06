import org.example.Calculadora;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CalculadoraTests {

    Calculadora calculadora = new Calculadora();

    @Test
    @DisplayName("Funcionamiento correcto de la suma")
    public void sumaResultadoCorrecto(){
        //Arrange
        int numero1 = 3;
        int numero2 = 4;
        int resultadoEsperado = 7;

        //Act
        int resultadoReal = calculadora.suma(numero1,numero2);

        //Assert
        Assertions.assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    @DisplayName("Funcionamiento correcto de la resta")
    public void restaResultadoCorrecto(){
        int resultadoReal = calculadora.suma(3, 4);
        Assertions.assertEquals(7, resultadoReal);
    }

    @Test
    @DisplayName("Funcionamiento correcto de la multiplicacion")
    public void multiplicacionResultadoCorrecto(){
        int resultadoReal = calculadora.suma(3, 4);
        Assertions.assertEquals(7, resultadoReal);
    }

    @Test
    @DisplayName("El resultado de la multiplicación no es nulo")
    public void multiplicacionResultNotNull(){
        boolean resultadoReal = calculadora.isNull(calculadora.multiplicacion(3, 4));
        Assertions.assertFalse(resultadoReal);
    }

    @Test
    @DisplayName("El resultado de la multiplicación es nulo")
    public void multiplicacionResultNull(){
        boolean resultadoReal = calculadora.isNull(calculadora.multiplicacion(0, 4));
        Assertions.assertTrue(resultadoReal);
    }

}
