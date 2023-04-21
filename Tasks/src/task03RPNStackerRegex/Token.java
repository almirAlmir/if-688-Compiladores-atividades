package task03RPNStackerRegex;


/* *******************************************************************
 * Copyright (c) 2021 Universidade Federal de Pernambuco (UFPE).
 * 
 * This file is part of the Compilers course at UFPE.
 * 
 * During the 1970s and 1980s, Hewlett-Packard used RPN in all 
 * of their desktop and hand-held calculators, and continued to 
 * use it in some models into the 2020s. In computer science, 
 * reverse Polish notation is used in stack-oriented programming languages 
 * such as Forth, STOIC, PostScript, RPL and Joy.
 *  
 * Contributors: 
 *     Henrique Rebelo      initial design and implementation 
 *     http://www.cin.ufpe.br/~hemr/
 * ******************************************************************/


/**
 * @author Henrique Rebelo
 */
public class Token{

	public final TokenType type; // token type
	public final String lexeme; // token value
	
	public Token (TokenType type, String value){
		
		if (unexpectedChar(value)) {
            throw new IllegalArgumentException("Error: Unexpected character: "+value);
        }
		this.type = type;
		this.lexeme = value;
	}

	public boolean unexpectedChar(String s) {
		
		boolean regularExpression = Regex.isNum(s) || Regex.isOP(s);
		return !regularExpression; // substitui meu método anterior pelo auxliar da classe Regex
												// Utilizando Regular expressions
		
	}
	
	@Override
	public String toString() {
		return "Token [type=" + this.type + ", lexeme=" + this.lexeme + "]\n";
	}
	
	
}