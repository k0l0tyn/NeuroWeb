package NeuroWeb;

public class Lr7Task1_10 implements Task {
	public Lr7Task1_10(NeuroWeb animals) {
		float[] test1 = { 4.0f, -1.0f, -1.0f, -1.0f, -1.0f, 10.0f, 10.0f };
		System.out.println("Тест первый.");
		test(test1, animals);

		float[] test2 = { 2.0f, -1.0f, 2.0f, 2.0f, 1.0f, 2.0f, 2.0f };
		System.out.println("\n\nТест второй.");
		test(test2, animals);

		float[] test3 = { 0.0f, 2.0f, -1.0f, -1.0f, 2.0f, 0.5f, 1.5f };
		System.out.println("\n\nТест третий.");
		test(test3, animals);
	}

	private void test(float[] input, NeuroWeb animals) {
		System.out.print("Входной вектор:");
		printMassive(input);
		System.out.println();
		System.out.print("Выходной вектор:");
		printMassive(animals.go(input));
	}
}
