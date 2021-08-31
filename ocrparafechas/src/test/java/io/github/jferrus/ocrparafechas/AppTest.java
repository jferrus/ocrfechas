package io.github.jferrus.ocrparafechas;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AppTest
{
    
	@Test
    public void numerosConEspaciosQuitados()
    {
    	App app = new App();
    	
    	String esperado = "4642542347778895949";
    	String real = app.getImgText("imagenes/numeros.png");	
    	
    	assertEquals(esperado, real);
    }
	
	@Test
    public void numerosSinEspacios()
    {
    	App app = new App();
    	
    	String esperado = "77581328354584142977";
    	String real = app.getImgText("imagenes/num2.png");
    	
    	assertEquals(esperado, real);
    }
	
	@Test
    public void fecha1()
    {
    	App app = new App();
    	
    	String esperado = "01/09/2021";
    	String real = app.getImgText("imagenes/fecha1.png");
    	
    	assertEquals(esperado, real);
    }
	
	@Test
    public void fecha2()
    {
    	App app = new App();
    	
    	String esperado = "25/02/1993";
    	String real = app.getImgText("imagenes/fecha2.png");
    	
    	assertEquals(esperado, real);
    }
	
	@Test
    public void fecha3()
    {
    	App app = new App();
    	
    	String esperado = "13/12/1817";
    	String real = app.getImgText("imagenes/fecha3.png");
    	
    	assertEquals(esperado, real);
    }
    

   
}
