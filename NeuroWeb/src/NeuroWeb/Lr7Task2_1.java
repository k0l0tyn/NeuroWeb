package NeuroWeb;

import java.util.function.UnaryOperator;

public class Lr7Task2_1 implements Task {
	public Lr7Task2_1() {
		UnaryOperator<Float> bias = x -> {
			if (x >= 0) {
				return 1.0f;
			}
			return -1.0f;
		};
		Neuron[][] buf = new Neuron[2][];
		buf[0] = new Neuron[2];
		buf[1] = new Neuron[1];
		float[] w1 = { 1.0f, 1.0f };
		buf[0][0] = new Neuron(w1, -0.5f, bias);
		float[] w2 = { -1.0f, -1.0f };
		buf[0][1] = new Neuron(w2, 1.5f, bias);
		float[] w3 = { 1.0f, 1.0f };
		buf[1][0] = new Neuron(w3, -1.5f, bias);
		NeuroWeb xor = new NeuroWeb(buf);
		float[] u = { 1.0f, 1.0f };
		System.out.print("1 1 -> ");
		printMassive(xor.go(u));
		u[1] = 0.0f;
		System.out.print("\n1 0 -> ");
		printMassive(xor.go(u));
		u[0] = 0.0f;
		u[1] = 1.0f;
		System.out.print("\n0 1 -> ");
		printMassive(xor.go(u));
		u[1] = 0.0f;
		System.out.print("\n0 0 -> ");
		printMassive(xor.go(u));
		System.out.println("\nСледовательно данный персептрон правильно моделирует xor");
	}
}
