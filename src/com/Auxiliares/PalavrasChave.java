
package com.Auxiliares;

public class PalavrasChave {

  private static final String CHAR   = "char";
  private static final String ELSE = "else";
  private static final String FALSE = "false";
  private static final String INT   = "int";
  private static final String IF   = "if";
  private static final String MAIN = "main";
  private static final String OUT = "out";
  private static final String PRINTF   = "printf";
  private static final String RETURN = "return";
  private static final String STATIC = "static";
  private static final String VOID   = "void";
  private static final String WHILE = "while";
  private static final String NULL = "null";
  private static final String PUBLIC = "public";
  private static final String DOUBLE = "double";
  private static final String PRIVATE = "private";
    
  public static boolean isPalavraChave(StringBuffer palavra) {

    String palavra1 = palavra.toString();
	
    if ( palavra1.equals(CHAR) || palavra1.equals(ELSE) || palavra1.equals(FALSE) || palavra1.equals(INT) || palavra1.equals(IF)
      || palavra1.equals(MAIN) || palavra1.equals(OUT) || palavra1.equals(PRINTF) || palavra1.equals(RETURN)
      || palavra1.equals(STATIC) || palavra1.equals(VOID) || palavra1.equals(WHILE) || palavra1.equals(NULL)
            || palavra1.equals(PUBLIC) || palavra1.equals(DOUBLE) || palavra1.equals(PRIVATE)) {
	
      return true;
  
    }	
	
    return false;
	
  }
	
  public static int tipoPalavraChave(StringBuffer palavra) {
		
    String palavra1 = palavra.toString();
	
    int resultado;
	
    if ( palavra1.equals(CHAR) ) {
    	
      resultado = Token.CHAR;
      
    } else if (palavra1.equals(ELSE)) {

      resultado = Token.ELSE;

    } else if (palavra1.equals(FALSE)) {
  
      resultado = Token.FALSE;

    } else if (palavra1.equals(INT)) {
  
      resultado = Token.INT;
	
    } else if (palavra1.equals(IF)) {
  
      resultado = Token.IF;
  	
    } else if (palavra1.equals(MAIN)) {
    
      resultado = Token.MAIN;
    	
    } else if (palavra1.equals(OUT)) {
       
      resultado = Token.OUT;
    	
    } else if (palavra1.equals(PRINTF)) {
        
      resultado = Token.PRINTF;
    	
    } else if (palavra1.equals(RETURN)) {
       
      resultado = Token.RETURN;
    	
    } else if (palavra1.equals(STATIC)) {
        
      resultado = Token.STATIC;
    	
    } else if (palavra1.equals(VOID)) {
        
      resultado = Token.VOID;
    	
    }else if (palavra1.equals(NULL)) {
      resultado = Token.NULL;

    }
    else if (palavra1.equals(PUBLIC)) {
      resultado = Token.PUBLIC;

    }
    else if (palavra1.equals(DOUBLE)) {
      resultado = Token.DOUBLE;

    }
    else if (palavra1.equals(PRIVATE)) {
      resultado = Token.PRIVATE;

    } else {
        
      resultado = Token.WHILE;
    	
    }

    return resultado;
	
  }

}
