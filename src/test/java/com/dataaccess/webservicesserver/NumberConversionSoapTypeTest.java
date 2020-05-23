package com.dataaccess.webservicesserver;

import static org.junit.Assert.*;

import java.math.BigDecimal;
import java.math.BigInteger;

import org.junit.Test;

public class NumberConversionSoapTypeTest {

	@Test
	public void testNumberToWords() {
		NumberConversionSoapType convertir = new NumberConversion().getNumberConversionSoap();
		String result=convertir.numberToDollars(new BigDecimal("50.35"));
		System.out.println(result);
		
	}

	@Test
	public void testNumberToDollars() {
		NumberConversionSoapType convertir = new NumberConversion().getNumberConversionSoap();
		String result=convertir.numberToWords(new BigInteger("55"));
		System.out.println(result);
	}

}
