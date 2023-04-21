package task03RPNStackerRegex;


import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.*;
import java.util.List;

public class Main {
	static String str = "src/task03RPNStackerRegex/Calc1.stk";
	//Adicionei um errorExample.stk no pacote pra testar o caso de Unexpected Character
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		List<String> linhas = Files.readAllLines(Paths.get(str), Charset.defaultCharset());
		String [] l = linhas.toArray(new String[linhas.size()]);
		
		
		
		int r = ExpressionEvaluator.evaluator(l);
		
		System.out.println("\n\n"+r);
		
		
	}
	
public static class Stack{
		
		Node top;
		
	public Stack() {
		this.top = null;
		
	}
	
	public void push(String value) {
		
		Node insertingNow = new Node(value);
		insertingNow.under = top;
		top = insertingNow;
		
	}
	
	public String pop() {
		String removingNow;
		
		if(top != null) {
		removingNow = top.value;
		top = top.under;
		
		}else{
			removingNow = "";
			System.out.print("isEmpty\n");
				}
		
		
		return removingNow;
		
			}
		
	}

public static class Node{
	
	String value;
	Node under;
	
	public Node(String value) {
		
		this.value = value;
		this.under = null;
		
	}
	
}



}
