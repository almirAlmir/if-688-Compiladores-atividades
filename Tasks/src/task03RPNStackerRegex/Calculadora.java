package task03RPNStackerRegex;

import java.util.Scanner;

public class Calculadora {

public static int calculadora(int x, TokenType ope, int y) {
	Scanner input = new Scanner(System.in);

	int n = 0;

	switch (ope) {

	case PLUS:
		n = sum(x, y);
		break;
	case MINUS:
		n = sum(x, -y);
		break;
	case STAR:
		n = mult(x, y);
		break;
	case SLASH:
		n = mult(x, 1 / y);
		break;
	default:
		System.out.println("Operaçao nao reconhecida pelo Software");
	}
	input.close();
	return n;
}

public static int sum(int x,int y) {

	return x + y;
}

public static int mult(int x, int y) {

	return x * y;
}

}
