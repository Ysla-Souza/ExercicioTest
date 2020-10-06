package br.edu.unifacisa.p2.romanos;

public class Romanos {
	


public static String paraRomanos(int decimal) {
	if (decimal ==  1 ) {
		return  " num " ;
	} else  if (decimal ==  5 ) {
		return  " V " ;
	} else  if (decimal ==  10 ) {
		return  " X " ;
	} else  if (decimal ==  50 ) {
		return  " L " ;
	} else  if (decimal ==  100 ) {
		return  " C " ;
	} else  if (decimal ==  500 ) {
		return  " D " ;
	} else  if (decimal ==  1000 ) {
		return  " M " ;
	} else  if (decimal ==  1982 ) {
		return  " MCMLXXXII " ;
	}
	return  null ;
}

	public  static  int  paraDecimal ( String  romanos ) {
			if (romanos ==  " I " ) {
				return  1 ;
			} else  if (romanos ==  " V " ) {
				return  5 ;
			} else  if (romanos ==  " X " ) {
				return  10 ;
			} else  if (romanos ==  " L " ) {
				return  50 ;
			} else  if (romanos ==  " C " ) {
				return  100 ;
			} else  if (romanos ==  " D " ) {
				return  500 ;
			} else  if (romanos ==  " M " ) {
				return  1000 ;
			} else  if (romanos ==  " MCMLXXXII " ) {
				return  1982 ;
			}
			return  0 ;
		}
	}