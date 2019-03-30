package ru.avalon.java.dev.j10.labs;

import ru.avalon.java.dev.j10.labs.initialization.FibonacciInitializer;
import ru.avalon.java.dev.j10.labs.initialization.RandomInitializer;
import ru.avalon.java.dev.j10.labs.sort.BubbleSort;
import ru.avalon.java.dev.j10.labs.sort.SelectionSort;

public class Main {

	public static void main(String[] args) {
		int[] arrayF = new int[20];
		int[] arrayR = new int[20];

		// инициализация и вывод в консоль последовательности Фибоначчи
		FibonacciInitializer fibonacciInitializer = new FibonacciInitializer();
		fibonacciInitializer.initialize(arrayF);
		System.out.println("20 первых элементов последовательности Фибоначчи");
		ArrayMaker.printOut(arrayF);

		// вывод суммы 20 значений
		System.out.println("Сумма первых 20 чисел последовательности Фибоначчи");
		System.out.println(ArrayMaker.value(arrayF));
		System.out.println(" ");

		// инициализация и вывод в консоль случайных чисел в диапазоне
		RandomInitializer randomInitializer = new RandomInitializer();
		randomInitializer.initialize(arrayR);

		System.out.println("Массив чисел в диапазоне от [-50;50]");
		ArrayMaker.printOut(arrayR);
		System.out.println(" ");

		// сортировка пузырьковым методом
		Sort bubble = new BubbleSort();
		bubble.sort(arrayR);
		System.out.println("Сортируем пузырьковым методом сортировки");
		ArrayMaker.printOut(arrayR);

		// инициализация и вывод в консоль случайных чисел в диапазоне
		randomInitializer.initialize(arrayR);
		System.out.println("Второй массив чисел в диапазоне от [-50;50]");
		ArrayMaker.printOut(arrayR);

		// сортировка вставкой
		Sort select = new SelectionSort();
		select.sort(arrayR);
		System.out.println("Сортируем методом вставки");
		ArrayMaker.printOut(arrayR);


	}
}
