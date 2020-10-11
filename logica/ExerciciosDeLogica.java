package br.edu.unifacisa.p2.logica;

import java.util.Collections;
import java.util.List;
import java.util.function.BooleanSupplier;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExerciciosDeLogica {
  public static int somaArray(int[] numeros) {
	  int soma = 0;
		for (int i : numeros) {
			soma += i;
		}
		return soma;
  }
  
  public static int getMaior(int[] numeros) {
	  int maior = 0;
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] > i) {
				maior = numeros[i];
			}
		}
    return maior;
  }
  
  public static int getMenor(int[] numeros) {
	  int menor = 0;
		for (int i = 1; i < numeros.length; i++) {
			if (numeros[i] == 1) {
				menor = numeros[i];
			}
		}
  		return menor;
  }
  
  public static double getMedia(int[] numeros) {
	  int soma = numeros.length;
		double media = 0.0;
		for (int i = 0; i < soma; i++) {
			media += numeros[i];
		}
		return media / soma;

	}
  
  public static String[] inverteArray(String[] nomes) {
	  int tamanho = nomes.length;
	  String[] inverteArray = new String[tamanho];

	  for (int i = 0; i < inverteArray.length; i++) {
		  tamanho--;
		  inverteArray[i] = nomes[tamanho];
          }
          return inverteArray;

  }
  
  public static List<String> inverteLista(List<String> nomes) {
	  Collections.reverse(nomes);
		return nomes;
	  		
  }
  
  public static String junta(List<String> nomes, String caractere) {
	  String juntar = String.join(caractere, nomes);
	  return juntar;
	
  }
  
  public static String substitui(String mensagem, String localizar, String substituir) {
	  mensagem = new String(mensagem.replaceAll(localizar, substituir));
	  
	  return mensagem;
		
	}
  public static boolean ehNumero(String valor) {
		char[] caractere = valor.toCharArray();
		boolean resposta = true;
		for(int i = 0; i < valor.length(); i++) {
			if(!Character.isDigit(caractere[i])) {
				  return false;
			  }
	}
	
	return resposta;  
  }
  
  public static boolean validaCEP(String cep) {
	  String padrao = "\\d{5}[-]\\d{2}";

		Pattern p = Pattern.compile(padrao);

		Matcher m2 = p.matcher(cep);

		if (m2.find()) {
			return true;
		} else {
			return false;
		}
  }
  
  public static boolean validaCPF(String cpf) {
	  String padrao = "/^\\d{3}\\.\\d{3}\\.\\d{3}\\-\\d{2}$/";
		Pattern p = Pattern.compile(padrao);

		Matcher m2 = p.matcher(cpf);

		if (m2.find()) {
			return false;
		} else {
			return true;
	  }
  }
  
  public static long fatorial(int n) {
	  if (n ==  0 ) {
			return  1 ;
		}
		return n * fatorial (n -  1 );
  }
  
  public static int fibonacci(int n) {
	  if (n < 2) {
			return n;
		} else {
			return fibonacci(n - 1) + fibonacci(n - 2);
		}
  }

}

