package com.startjava.lesson_1.cycle;

/*
  TODO:
  - Вывести на консоль числа от 0 до 20 с помощью цикла for;
  - Вывести на консоль числа от 6 до -6 с помощью цикла while,
    шаг итерации 2;
  - С помощью цикла do-while вывести на консоль сумму нечётных
    чисел от 10 до 20.
 */
public class Cycle {
	public static void main(String[] args) {
		for(int i = 0; i <= 20; i++) {
			System.out.print(i + " ");
		}

		System.out.println();

		int i = 6;
		while(i >= -6) {
			System.out.print(i + " ");
			i -= 2;
		}

		System.out.println();

		int a = 10;
		int sum = 0;
		do {
			if (a % 2 == 1) {
				sum += a;
			}
			a++;
		} while(a <= 20);

		System.out.println(sum);
	}
}