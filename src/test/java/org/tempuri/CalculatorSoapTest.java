package org.tempuri;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorSoapTest {
	CalculatorSoap calculadora = new Calculator().getCalculatorSoap();
	@Test
	public void testAdd() {
		int result = calculadora.add(5, 4);
		System.out.println("suma de 5+4: "+result);
		assertTrue(result==9);
	}

	@Test
	public void testSubtract() {
		int result = calculadora.subtract(5, 4);
		System.out.println("resta de 5-4: "+result);
		assertTrue(result==1);
	}

	@Test
	public void testMultiply() {
		int result = calculadora.multiply(5, 4);
		System.out.println("multiplicacion de 5x4: "+result);
		assertTrue(result==20);
	}

	@Test
	public void testDivide() {
		int result = calculadora.divide(10, 5);
		System.out.println("divicion de 5/4: "+result);
		assertTrue(result==2);
	}

}
