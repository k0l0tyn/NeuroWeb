package NeuroWeb;

public class Lr7Task1_8 implements Task {

	public Lr7Task1_8(NeuroWeb animals) {
		float[] test1 = { 4.0f, -1.0f, -1.0f, -0.9f, -1.0f };
		System.out.print("Тест 1.\nВектор входных сигналов");
		test(test1, animals);
		float[] test2 = { 8.0f, -6.0f, -3.0f, -5.0f, -9.0f };
		System.out.print("Тест 2.\nВектор входных сигналов");
		test(test2, animals);
	}

	private void test(float[] input, NeuroWeb animals) {
		printMassive(input);
		System.out.print("\nРезультат работы:");
		printMassive(animals.go(input));
		float[] buf = { animals.neurons[0][0].weightLenght, animals.neurons[0][1].weightLenght,
				animals.neurons[0][2].weightLenght };
		System.out.println("\nДлины веторов запомненных сигналов нейронов:");
		printMassive(buf);
		System.out.println("\nДлина вектора входных сигналов: " + animals.neurons[0][0].signalLenght + "\n");
	}
}
