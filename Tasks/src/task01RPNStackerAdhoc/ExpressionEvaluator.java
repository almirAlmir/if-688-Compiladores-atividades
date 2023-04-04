package task01RPNStackerAdhoc;
import task01RPNStackerAdhoc.Main.Stack;
public class ExpressionEvaluator {

	public static int evaluator(String [] linhas) {
		
	Stack s = new Stack();
	int x;
	int y;
	char ope;
	for(int i=0; i <= linhas.length-1; i++) {
		
		if(linhas[i].equals("+")||
		   linhas[i].equals("*")||
		   linhas[i].equals("-")||
		   linhas[i].equals("/")) 
		{
			x = Integer.parseInt(s.pop());
			y = Integer.parseInt(s.pop());
			ope = linhas[i].charAt(0);
			s.push(Integer.toString(Calculadora.calculadora(x, ope, y)));
			
		}else {
			
			s.push(linhas[i]);
			continue;
		}
		
		
	}
		
	return Integer.parseInt(s.pop());	
	}
	
	
	
}
