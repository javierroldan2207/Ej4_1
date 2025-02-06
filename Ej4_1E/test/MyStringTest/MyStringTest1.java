package MyStringTest;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.Test;

import MyString.MyString1;

class MyStringTest1 {

	@Test
	void testContarPalabras() {
		assertEquals(1,MyString1.contarPalabras("hola"));
		assertEquals(2,MyString1.contarPalabras("hola buenas"));
		assertEquals(0,MyString1.contarPalabras(null));
		assertEquals(0,MyString1.contarPalabras(""));

	}

	@Test
	void testContarLetrasDiferentes() {
		 assertEquals(0, MyString1.contarLetrasDiferentes("")); 
	     assertEquals(1, MyString1.contarLetrasDiferentes("aaa")); 
	     assertEquals(4, MyString1.contarLetrasDiferentes("Hola")); 
	     assertEquals(8, MyString1.contarLetrasDiferentes("Hola mundo!"));
	     assertEquals(0,MyString1.contarLetrasDiferentes(null));
	     assertEquals(0,MyString1.contarLetrasDiferentes(""));

	}


	@Test
	void testEsPalindroma() {
		assertTrue(MyString1.esPalindroma("ana")); 
        assertTrue(MyString1.esPalindroma("AnA")); 
        assertTrue(MyString1.esPalindroma("A Santa at NASA"));
        assertFalse(MyString1.esPalindroma("Hola")); 
        assertFalse(MyString1.esPalindroma(null));
        assertFalse(MyString1.esPalindroma(""));
	}
	
	@Test
	 void contarFrecuenciaPalabras() {
		Map<String, Integer> esperado = new HashMap<>(Map.of("mundo",2,"hola",1));
		
		assertTrue(esperado.equals(MyString1.contarFrecuenciaPalabras(" mundo hola mundo")));
		assertFalse(esperado.equals(MyString1.contarFrecuenciaPalabras("Buenas mundo hola mundo")));
		assertFalse(esperado.equals(MyString1.contarFrecuenciaPalabras(null)));
		assertFalse(esperado.equals(MyString1.contarFrecuenciaPalabras("")));
	}
	
	@Test
	void contarFrecuenciaLetras() {
		
		Map<Character, Integer> letras = new HashMap<>(Map.of('a',4,'b',1,'l',1));
		
		assertTrue(letras.equals(MyString1.contarFrecuenciaLetras("laa baa")));
		assertFalse(letras.equals(MyString1.contarFrecuenciaLetras("buenas tardes")));
		assertFalse(letras.equals(MyString1.contarFrecuenciaLetras(null)));
		assertFalse(letras.equals(MyString1.contarFrecuenciaLetras("")));
	}

	   
}
