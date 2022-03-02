package NeuroWeb;

public class NeuroWeb {
	Neuron[][] neurons;
	float epsilon = 0.001f;

	NeuroWeb(Neuron[][] n) {
		neurons = n.clone();
	}

	NeuroWeb(int[] size) {
		neurons = new Neuron[size.length - 1][];
		for (int i = 1; i < size.length; i++) {
			neurons[i-1] = new Neuron[size[i]];
			for(int j=0;j<size[i];j++) {
				neurons[i][j] = new Neuron(size[i-1]);
			}
		}
	}
	
	NeuroWeb(int[] size, Neuron progenon) {
		neurons = new Neuron[size.length - 1][];
		for (int i = 1; i < size.length; i++) {
			neurons[i-1] = new Neuron[size[i]];
			for(int j=0;j<size[i];j++) {
				neurons[i][j] = new Neuron(size[i-1], progenon.bias, progenon.activateFunction);
			}
		}
	}

	public float[] go(float[] entireSignals) {
		float[] input = entireSignals, output = new float[neurons[0].length];

		for (int i = 0; i < neurons.length; i++) {
			output = new float[neurons[i].length];
			for (int j = 0; j < neurons[i].length; j++) {
				output[j] = neurons[i][j].work(input);
			}
			input = output.clone();
		}
		return input;
	}
	
/*	public NeuroWeb learnYouself(float[][][] idealData) {
		for(int i = 0;i<idealData.length;i++) {
			if(idealData[i][1]-go(idealData[i][0]) > eps) {
				
			}
			
		}
		return this;
	}*/
}
