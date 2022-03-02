package NeuroWeb;

public class Lr7Task1_3 implements Task {
	private void endurance(float[] flower, float webResult) {
		System.out.print("������������� ������ ������� ");
		if (Math.abs(webResult) < 0.2f * (Math.abs(flower[0]) + Math.abs(flower[1]))) {
			System.out.print("�����������");
		} else {
			if (webResult < 0) {
				System.out.print("�� ����������");
			} else {
				System.out.print("����������");
			}
		}
		System.out.println("\n");

	}

	public Lr7Task1_3() {
		Neuron flower = new Neuron(2);
		System.out.println("������������� ������������:\n�� ������� - " + flower.weights[0] + "\n�� ������� - "
				+ flower.weights[1] + "\n\n������� - �������� ����� � �������� ������� �������������� ��������\n");
		float[] colourfullButScentless = { (float) (Math.random() * 6 - 3), (float) (Math.random() * 7 + 3) };
		float[] fragrantButColorless = { (float) (Math.random() * 7 + 3), (float) (Math.random() * 6 - 3) };
		float[] scentlessAndColorless = { (float) (Math.random() * 6 - 3), (float) (Math.random() * 6 - 3) };
		float[] nosyAndColorfull = { (float) (Math.random() * -7 - 3), (float) (Math.random() * 7 + 3) };
		float buf = flower.work(colourfullButScentless);
		System.out.println("���� ������. �����, �� �������� ������ ������.\n��������� ������:\n����� - "
				+ colourfullButScentless[0] + "\n����� - " + colourfullButScentless[1]);
		System.out.println("��������� ������ �������:" + buf);
		endurance(colourfullButScentless, buf);
		buf = flower.work(fragrantButColorless);
		System.out.println("���� ������. �����, �� �������� ������ ������.\n��������� ������:\n����� - "
				+ fragrantButColorless[0] + "\n����� - " + fragrantButColorless[1]);
		System.out.println("��������� ������ �������:" + buf);
		endurance(fragrantButColorless, buf);
		buf = flower.work(scentlessAndColorless);
		System.out.println("���� ������. �����, �� �������� ������ ������.\n��������� ������:\n����� - "
				+ scentlessAndColorless[0] + "\n����� - " + scentlessAndColorless[1]);
		System.out.println("��������� ������ �������:" + buf);
		endurance(scentlessAndColorless, buf);
		buf = flower.work(nosyAndColorfull);
		System.out.println("���� ���������. �����, �� �������� ������ ������.\n��������� ������:\n����� - "
				+ nosyAndColorfull[0] + "\n����� - " + nosyAndColorfull[1]);
		System.out.println("��������� ������ �������:" + buf);
		endurance(nosyAndColorfull, buf);
	}
}
