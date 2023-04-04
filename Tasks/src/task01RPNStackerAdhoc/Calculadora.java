package task01RPNStackerAdhoc;

import java.util.Scanner;

public class Calculadora {

public static int calculadora(int x, char ope, int y) {
	Scanner input = new Scanner(System.in);

	int n = 0;

	switch (ope) {

	case '+':
		n = sum(x, y);
		break;
	case '-':
		n = sum(x, -y);
		break;
	case '*':
		n = mult(x, y);
		break;
	case '/':
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