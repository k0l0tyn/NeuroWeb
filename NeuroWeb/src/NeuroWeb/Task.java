package NeuroWeb;

public interface Task {
	public default void printMassive(float[] m) {
		for (int i = 0; i < m.length - 1; i++) {
			System.out.print(" " + m[i] + ",");
		}
		System.out.print(" " + m[m.length-1]);
		
	}
}
