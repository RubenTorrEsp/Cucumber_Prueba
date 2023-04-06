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
        int resultadoReal = calculadora.multiplicacion(3, 4);
        Assertions.assertEquals(12, resultadoReal);
    }

    @Test
    @DisplayName("Funcionamiento correcto de la division")
    public void divisionResultadoCorrecto(){
        int resultadoReal = calculadora.divisionEntera(9, 4);
        Assertions.assertEquals(2, resultadoReal);
    }

    @Test
    @DisplayName("Funcionamiento correcto del resto de division")
    public void restoDivisionResultadoCorrecto(){
        int resultadoReal = calculadora.restoDivision(9, 4);
        Assertions.assertEquals(1, resultadoReal);
    }

    @Test
    @DisplayName("El resultado de la suma no es nulo")
    public void sumaResultNotNull(){
        boolean resultadoReal = calculadora.isNull(calculadora.suma(3, 4));
        Assertions.assertFalse(resultadoReal);
    }

    @Test
    @DisplayName("El resultado de la suma es nulo")
    public void sumaResultNull(){
        boolean resultadoReal = calculadora.isNull(calculadora.suma(-4, 4));
        Assertions.assertTrue(resultadoReal);
    }

    @Test
    @DisplayName("El resultado de la resta no es nulo")
    public void restaResultNotNull(){
        boolean resultadoReal = calculadora.isNull(calculadora.resta(3, 4));
        Assertions.assertFalse(resultadoReal);
    }

    @Test
    @DisplayName("El resultado de la resta es nulo")
    public void restaResultNull(){
        boolean resultadoReal = calculadora.isNull(calculadora.resta(4, 4));
        Assertions.assertTrue(resultadoReal);
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

    @Test
    @DisplayName("El resultado de la division no es nulo")
    public void divisionResultNotNull(){
        boolean resultadoReal = calculadora.isNull(calculadora.divisionEntera(5, 4));
        Assertions.assertFalse(resultadoReal);
    }

    @Test
    @DisplayName("El resultado de la division es nulo")
    public void divisionResultNull(){
        boolean resultadoReal = calculadora.isNull(calculadora.divisionEntera(0, 4));
        Assertions.assertTrue(resultadoReal);
    }

    @Test
    @DisplayName("El resultado del resto de division no es nulo")
    public void restoDivisionResultNotNull(){
        boolean resultadoReal = calculadora.isNull(calculadora.restoDivision(6, 4));
        Assertions.assertFalse(resultadoReal);
    }

    @Test
    @DisplayName("El resultado del resto de division es nulo")
    public void restoDivisionResultNull(){
        boolean resultadoReal = calculadora.isNull(calculadora.restoDivision(8, 4));
        Assertions.assertTrue(resultadoReal);
    }


}
