package br.edu.unifacisa.p2.romanos.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import  br.edu.unifacisa.p2.romanos.Romanos ;


class  RomanosTest {

@Test
void testParaRomanos() {
	assertEquals(" I ", Romanos.paraRomanos(1));
	assertEquals(" V ", Romanos.paraRomanos(5));
	assertEquals(" X ", Romanos.paraRomanos(10));
	assertEquals(" L ", Romanos.paraRomanos(50));
	assertEquals(" C ", Romanos.paraRomanos(100));
	assertEquals(" D ", Romanos.paraRomanos(500));
	assertEquals(" M ", Romanos.paraRomanos(1000));
	assertEquals(" MCMLXXXII ", Romanos.paraRomanos(1982));
}

@Test
void testParaDecimal() {
	assertEquals(1, Romanos.paraDecimal(" I "));
	assertEquals(5, Romanos.paraDecimal(" V "));
	assertEquals(10, Romanos.paraDecimal(" X "));
	assertEquals(50, Romanos.paraDecimal(" L "));
	assertEquals(100, Romanos.paraDecimal(" C "));
	assertEquals(500, Romanos.paraDecimal(" D "));
	assertEquals(1000, Romanos.paraDecimal(" M "));
	assertEquals(1982, Romanos.paraDecimal(" MCMLXXXII "));
}

	}
