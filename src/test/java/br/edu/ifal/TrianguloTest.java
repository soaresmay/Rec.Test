package br.edu.ifal;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

/**
 * TrianguloTest
 */
public class TrianguloTest {

    Triangulo T1;
    Triangulo T2;
    Triangulo T3;
    

    @Before
    public void inicializacao() {
        
    T1 = new Triangulo(2, 3, 4);
    T2 = new Triangulo(0, 0, 0);
    T3 = new Triangulo(4, 4, 4);
    

    }
    
    @Test
    public void deveRetornarIlegalParaLadosIguaisAZero(){
        String validadeRetornada =  T2.getTipo(T2);
        String validadeEsperada = "Ilegal";
        assertEquals(validadeEsperada, validadeRetornada);
    }
     
    @Test
    public void deveRetornarEscalenoParaTodosOsLadosDiferentes(){
        String validadeRetornada =  T1.getTipo(T1);
        String validadeEsperada = "Escaleno";
        assertEquals(validadeEsperada,validadeRetornada);
    }

    @Test
    public void deveRetornarEquilateroParaTodosOsLadosIguais(){
        String validadeRetornada =  T3.getTipo(T3);
        String validadeEsperada = "Equilatero";
        assertEquals(validadeEsperada,validadeRetornada);
    }
    
@Test
public void deveRetornarIlegalSe
   



    



}