package MyStringtest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import MyString.MyString1;

class MyString1Test {

	@Test
	void testContarPalabras() {
		assertEquals(1, MyString1.contarPalabras("Esto"));
	}

	@Test
	void testContarLetrasDiferentes() {
		assertEquals(2,MyString1.contarLetrasDiferentes("ae"));
	}

	@Test
	void testContarFrecuenciaPalabras() {
		fail("Not yet implemented");
	}

	@Test
	void testContarFrecuenciaLetras() {
		fail("Not yet implemented");
	}

	@Test
	void testEsPalindroma() {
		fail("Not yet implemented");
	}

}
