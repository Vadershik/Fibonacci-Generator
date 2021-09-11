package com.vader;

/* В самом моём коде есть проблема с результатом.
 * Дело в том что в самой переменной int есть ограничения в диапозоне чисел, 
 * из-за этого при больших кол-во чисел он начинает чередовать как-то отрицательные и положительные значения */

import com.vader.lib.Fibonacci;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		System.out.print("Сколько нужно чисел > ");
		int n = in.nextInt();
		Fibonacci.gen(n); //Сам генератор записывает все значения в файл
	}
}
