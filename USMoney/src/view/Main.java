package view;

import model.USMoney;

public class Main {

	public static void main(String[] args) {

		USMoney valor1, valor2, soma;

		valor1 = new USMoney(0, 101);
		valor2 = new USMoney(0, 0);

		soma = valor1.plus(valor2);

		System.out.println(soma.toString());

	}

}
