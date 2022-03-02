package NeuroWeb;

import java.util.Arrays;

public class Lr7Task1_9 implements Task {
	float[] buf;
	public Lr7Task1_9(NeuroWeb animals) {
			float[] test1 = { 4.0f, -1.0f, -1.0f, -1.0f, -1.0f };
			System.out.println("Тест первый.");
			test(test1, animals);
			Arrays.sort(buf);
			System.out.println("\nПобедитель - " + buf[2]);

			float[] test2 = { 2.0f, -1.0f, 2.0f, 2.0f, 1.0f };
			System.out.println("\nТест второй.");
			test(test2, animals);
			Arrays.sort(buf);
			System.out.println("\nПобедитель - " + buf[2]);

			float[] test3 = { 0.0f, 2.0f, -1.0f, -1.0f, 2.0f };
			System.out.println("\nТест третий.");
			test(test3, animals);
			Arrays.sort(buf);
			System.out.println("\nПобедитель - " + buf[2]);
		}

		private void test(float[] input, NeuroWeb animals) {
			System.out.print("Входной вектор:");
			printMassive(input);
			System.out.println();
			System.out.print("Выходной вектор:");
			buf = animals.go(input);
			printMassive(animals.go(input));
		}
	}

