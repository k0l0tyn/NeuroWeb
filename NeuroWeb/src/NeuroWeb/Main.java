package NeuroWeb;

public class Main {

	public static void main(String[] args) {
		int arg = 5;//Integer.parseInt(args[0]);
		switch (arg) {
		case (1):
			Lr7Task1_3 test1 = new Lr7Task1_3();
			break;
		case (2):
			Lr7Task1_7 test2 = new Lr7Task1_7(createNW7());
			break;
		case (3):
			Lr7Task1_8 test3 = new Lr7Task1_8(createNW7());
			break;
		case (4):
			Lr7Task1_9 test4 = new Lr7Task1_9(createNW7());
			break;
		case (5):
			Lr7Task2_1 test5 = new Lr7Task2_1();
			break;
		case (6):
			Lr7Task2_2 test6 = new Lr7Task2_2();
			break;
		case (7):
			Lr7Task1_10 test7 = new Lr7Task1_10(createNW10());
			break;
		}

	}

	static NeuroWeb createNW7() {
		Neuron[][] animals = new Neuron[1][3];
		float[] w1 = { 4.0f, 0.01f, 0.01f, -1.0f, -1.5f };
		animals[0][0] = new Neuron(w1);
		float[] w2 = { 2.0f, -1.0f, 2.0f, 2.5f, 2.0f };
		animals[0][1] = new Neuron(w2);
		float[] w3 = { -1.0f, 3.5f, 0.01f, -2.0f, 1.5f };
		animals[0][2] = new Neuron(w3);
		NeuroWeb classes = new NeuroWeb(animals);
		return classes;
	}

	static NeuroWeb createNW10() {
		Neuron[][] animals = new Neuron[1][5];
		float[] w1 = { 4.0f, 0.01f, 0.01f, -1.0f, -1.5f, 0.01f, 0.1f };
		animals[0][0] = new Neuron(w1);
		float[] w2 = { 2.0f, -1.0f, 2.0f, 2.5f, 2.0f, 0.01f, 1.0f };
		animals[0][1] = new Neuron(w2);
		float[] w3 = { -1.0f, 3.5f, 0.01f, -2.0f, 1.5f, 0.01f, 2.0f };
		animals[0][2] = new Neuron(w3);
		float[] w4 = { 0.01f, 0.01f, 0.01f, 0.01f, 0.01f, 2.0f, 2.0f };
		animals[0][3] = new Neuron(w4);
		float[] w5 = { 0.01f, 0.01f, 0.01f, 0.01f, 0.01f, -2.0f, 1.00f };
		animals[0][4] = new Neuron(w5);
		NeuroWeb classes = new NeuroWeb(animals);
		return classes;
	}

}
