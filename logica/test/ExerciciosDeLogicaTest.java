package br.edu.unifacisa.p2.logica.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

import br.edu.unifacisa.p2.logica.ExerciciosDeLogica;

class ExerciciosDeLogicaTest {

  @Test
  void testSomaArray() {
    int[] numeros = new int[] {2, 3, 6, 7};
    assertEquals(18, ExerciciosDeLogica.somaArray(numeros));
  }

  @Test
  void testGetMaior() {
    int[] numeros = new int[] {2, 3, 6, 7, 1, 4};
    assertEquals(7, ExerciciosDeLogica.getMaior(numeros));
  }

  @Test
  void testGetMenor() {
    int[] numeros = new int[] {2, 3, 6, 7, 1, 4};
    assertEquals(1, ExerciciosDeLogica.getMenor(numeros));
  }

  @Test
  void testGetMedia() {
    int[] numeros = new int[] {2, 3, 6, 7, 1, 4};
    assertEquals(3.8, ExerciciosDeLogica.getMedia(numeros), 0.1);
  }

  @Test
  void testInverteArray() {
    String[] nomes = new String[] {"a", "b", "c"};
    assertArrayEquals(new String[] {"c", "b", "a"}, ExerciciosDeLogica.inverteArray(nomes));
  }

  @Test
  void testInverteLista() {
    List<String> nomes = Arrays.asList("a", "b", "c");
    assertArrayEquals(new String[] {"c", "b", "a"}, ExerciciosDeLogica.inverteLista(nomes).toArray(new String[nomes.size()]));
  }

  @Test
  void testJunta() {
    List<String> nomes = Arrays.asList("a", "b", "c");
    assertEquals("a,b,c", ExerciciosDeLogica.junta(nomes, ","));
  }

  @Test
  void testSubstitui() {
    String mensagem = "Para <<NOME>>: <<NOME>>, espero você na reunião.";
    assertEquals("Para Ana: Ana, espero você na reunião.", ExerciciosDeLogica.substitui(mensagem, "<<NOME>>", "Ana"));
  }

  @Test
  void testEhNumero() {
    assertTrue(ExerciciosDeLogica.ehNumero("9"));
    assertTrue(ExerciciosDeLogica.ehNumero("123"));
    assertFalse(ExerciciosDeLogica.ehNumero("123b"));
    assertFalse(ExerciciosDeLogica.ehNumero("x123b"));
  }

  @Test
  void testValidaCEP() {
    assertTrue(ExerciciosDeLogica.validaCEP("58100-000"));
    assertFalse(ExerciciosDeLogica.validaCEP("58100000"));
    assertFalse(ExerciciosDeLogica.validaCEP("5810000011"));
    assertTrue(ExerciciosDeLogica.validaCEP("78102-011"));
  }

  @Test
  void testisCPF() {
    /* 
     * Um CPF válido tem:
     * - 9 números separados por .
     * - 2 dígitos verificadores
     */
    assertTrue(ExerciciosDeLogica.validaCPF("443.344.420-05"));// , ExerciciosDeLogica.imprimeCPF("443.344.420-05"));
    assertTrue(ExerciciosDeLogica.validaCPF("776.863.620-19"));// ,ExerciciosDeLogica.imprimeCPF("776.863.620-19"));
    assertTrue(ExerciciosDeLogica.validaCPF("847.153.580-77"));// ,ExerciciosDeLogica.imprimeCPF("847.153.580-77"));
    // CPFs inválidos
//    assertFalse(ExerciciosDeLogica.validaCPF("443.344.420-06"));// ,ExerciciosDeLogica.imprimeCPF("443.344.420-06"));
//    assertFalse(ExerciciosDeLogica.validaCPF("776.863.620-18"));// ,ExerciciosDeLogica.imprimeCPF("776.863.620-18"));
	
    // Não são válidos CPFs formados por números iguais
//    assertFalse(ExerciciosDeLogica.validaCPF("000.000.000-00"));// ,ExerciciosDeLogica.imprimeCPF("000.000.000-00"));	
//    assertFalse(ExerciciosDeLogica.validaCPF("111.111.111-11"));// ,ExerciciosDeLogica.imprimeCPF("111.111.111-11"))
//    assertFalse(ExerciciosDeLogica.validaCPF("222.222.222-22"));// ,ExerciciosDeLogica.imprimeCPF("222.222.222-22"));	
//    assertFalse(ExerciciosDeLogica.validaCPF("333.333.333-33"));// ,ExerciciosDeLogica.imprimeCPF("333.333.333-33"));
  }

  @Test
  void testFatorial() {
    assertEquals(1, ExerciciosDeLogica.fatorial(0));
    assertEquals(1, ExerciciosDeLogica.fatorial(1));
    assertEquals(2, ExerciciosDeLogica.fatorial(2));
    assertEquals(120, ExerciciosDeLogica.fatorial(5));
  }

  @Test
  void testFibonacci() {
    assertEquals(0, ExerciciosDeLogica.fibonacci(0));
    assertEquals(1, ExerciciosDeLogica.fibonacci(1));
    assertEquals(1, ExerciciosDeLogica.fibonacci(2));
    assertEquals(2, ExerciciosDeLogica.fibonacci(3));
    assertEquals(3, ExerciciosDeLogica.fibonacci(4));
    assertEquals(5, ExerciciosDeLogica.fibonacci(5));
    assertEquals(8, ExerciciosDeLogica.fibonacci(6));
    assertEquals(13, ExerciciosDeLogica.fibonacci(7));
  }
}
