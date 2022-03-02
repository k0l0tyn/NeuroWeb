package NeuroWeb;

import java.util.function.UnaryOperator;

public class Neuron {
	float[] weights;
	float[] inputSignals;
	float netValue;
	float Y;
	float signalLenght;
	float weightLenght;
	float bias = 0;
	Neuron[] nextNeurons;
	UnaryOperator<Float> activateFunction = x -> {
		return x;
	};

	Neuron(float[] w) {
		weights = w.clone();
		calculateWeightLenght();
	}

	Neuron(float[] w, float b) {
		weights = w.clone();
		bias = b;
		calculateWeightLenght();
	}

	Neuron(float[] w, UnaryOperator<Float> actFun) {
		activateFunction = actFun;
		weights = w.clone();
		calculateWeightLenght();
	}

	Neuron(float[] w, float b, UnaryOperator<Float> actFun) {
		activateFunction = actFun;
		weights = w.clone();
		bias = b;
		calculateWeightLenght();
	}

	Neuron(int n) {
		generateRandomWeights(n);
		calculateWeightLenght();
	}

	Neuron(int n, float b) {
		generateRandomWeights(n);
		bias = b;
		calculateWeightLenght();
	}

	Neuron(int n, UnaryOperator<Float> actFun) {
		activateFunction = actFun;
		generateRandomWeights(n);
		calculateWeightLenght();
	}

	Neuron(int n, float b, UnaryOperator<Float> actFun) {
		activateFunction = actFun;
		generateRandomWeights(n);
		bias = b;
		calculateWeightLenght();
	}

	private void generateRandomWeights(int n) {// генерирует случайные веса в диапазоне [-10.0;10.0)
		weights = new float[n];
		for (int i = 0; i < n; i++) {
			weights[i] = (float) Math.random() / 5.0f - 0.1f;
			if(weights[i] == 0.0f) {
				weights[i] = 0.05f;
			}
		}
	}

	public float work(float[] u) {
		inputSignals = u;
		calculateSignalLenght();
		netValue = bias;
		for (int i = 0; i < inputSignals.length; i++) {
			netValue += weights[i] * inputSignals[i];
		}
		Y = activateFunction.apply(netValue);
		return Y;
	}

	private void calculateSignalLenght() {
		float buf = 0;
		for (int i = 0; i < inputSignals.length; i++) {
			buf += inputSignals[i] * inputSignals[i];
		}
		signalLenght = (float) Math.sqrt(buf);
	}

	private void calculateWeightLenght() {
		float buf = 0;
		for (int i = 0; i < weights.length; i++) {
			buf += weights[i] * weights[i];
		}
		weightLenght = (float) Math.sqrt(buf);
	}

}
