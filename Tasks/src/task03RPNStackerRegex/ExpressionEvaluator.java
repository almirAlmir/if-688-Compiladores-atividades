package task03RPNStackerRegex;
import task03RPNStackerRegex.Main.Stack;
import task03RPNStackerRegex.Token;
import java.util.Arrays;

public class ExpressionEvaluator {

	public static int evaluator(String [] linhas) {
		
	Token [] tokens = new Token[linhas.length];
	for(int i = 0; i<tokens.length; i++) {
		
		if(!(linhas[i].equals("+")||
		     linhas[i].equals("*")||
		     linhas[i].equals("-")||
		     linhas[i].equals("/"))) {
			
			tokens[i] = new Token(TokenType.NUM, linhas[i]);
		}else {
			
			switch(linhas[i]) {
			
				case "-":
					tokens[i] = new Token(TokenType.MINUS, linhas[i]);
					break;
				case "+":
					tokens[i] = new Token(TokenType.PLUS, linhas[i]);
					break;
				case "/":
					tokens[i] = new Token(TokenType.SLASH, linhas[i]);
					break;
				case "*":
					tokens[i] = new Token(TokenType.STAR, linhas[i]);
					break;
				default:
					continue;
			}
			
		}
	}
	System.out.print(Arrays.toString(tokens));
	
	Stack s = new Stack();
	int x;
	int y;
	//String ope;
	for(int i=0; i <= linhas.length-1; i++) {
		
		if(!tokens[i].type.equals(TokenType.NUM)){
			x = Integer.parseInt(s.pop());
			y = Integer.parseInt(s.pop());
			//ope = linhas[i].charAt(0);
			s.push(Integer.toString(Calculadora.calculadora(x, tokens[i].type, y)));
			
		}else {
			
			s.push(tokens[i].lexeme);
			continue;
		}
		
		
	}
		
	return Integer.parseInt(s.pop());	
	}
	
	
	
}