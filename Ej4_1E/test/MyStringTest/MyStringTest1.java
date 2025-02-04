package MyStringTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import MyString.MyString1;

class MyStringTest1 {

	@Test
	void testContarPalabras() {
		assertEquals(1,MyString1.contarPalabras("hola"));
	}

	@Test
	void testContarLetrasDiferentes() {
		 assertEquals(0, MyString1.contarLetrasDiferentes("")); 
	     assertEquals(1, MyString1.contarLetrasDiferentes("aaa")); 
	     assertEquals(4, MyString1.contarLetrasDiferentes("Hola")); 
	     assertEquals(8, MyString1.contarLetrasDiferentes("Hola mundo!"));
	    
	}


	@Test
	void testEsPalindroma() {
		assertTrue(MyString1.esPalindroma("ana")); 
        assertTrue(MyString1.esPalindroma("AnA")); 
        assertTrue(MyString1.esPalindroma("A Santa at NASA"));
        assertFalse(MyString1.esPalindroma("Hola")); 
	}

}
