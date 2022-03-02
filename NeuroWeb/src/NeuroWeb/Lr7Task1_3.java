package NeuroWeb;

public class Lr7Task1_3 implements Task {
	private void endurance(float[] flower, float webResult) {
		System.out.print("Следовательно цветок нейрону ");
		if (Math.abs(webResult) < 0.2f * (Math.abs(flower[0]) + Math.abs(flower[1]))) {
			System.out.print("безразличен");
		} else {
			if (webResult < 0) {
				System.out.print("не понравился");
			} else {
				System.out.print("понравился");
			}
		}
		System.out.println("\n");

	}

	public Lr7Task1_3() {
		Neuron flower = new Neuron(2);
		System.out.println("Установленные предпочтения:\nПо аромату - " + flower.weights[0] + "\nПо яркости - "
				+ flower.weights[1] + "\n\nПомните - значения весов и значения цветков сгенерированны случайно\n");
		float[] colourfullButScentless = { (float) (Math.random() * 6 - 3), (float) (Math.random() * 7 + 3) };
		float[] fragrantButColorless = { (float) (Math.random() * 7 + 3), (float) (Math.random() * 6 - 3) };
		float[] scentlessAndColorless = { (float) (Math.random() * 6 - 3), (float) (Math.random() * 6 - 3) };
		float[] nosyAndColorfull = { (float) (Math.random() * -7 - 3), (float) (Math.random() * 7 + 3) };
		float buf = flower.work(colourfullButScentless);
		System.out.println("Тест первый. Яркий, но лишенный запаха цветок.\nПараметры цветка:\nЗапах - "
				+ colourfullButScentless[0] + "\nОкрас - " + colourfullButScentless[1]);
		System.out.println("Результат работы нейрона:" + buf);
		endurance(colourfullButScentless, buf);
		buf = flower.work(fragrantButColorless);
		System.out.println("Тест второй. Яркий, но лишенный запаха цветок.\nПараметры цветка:\nЗапах - "
				+ fragrantButColorless[0] + "\nОкрас - " + fragrantButColorless[1]);
		System.out.println("Результат работы нейрона:" + buf);
		endurance(fragrantButColorless, buf);
		buf = flower.work(scentlessAndColorless);
		System.out.println("Тест третий. Яркий, но лишенный запаха цветок.\nПараметры цветка:\nЗапах - "
				+ scentlessAndColorless[0] + "\nОкрас - " + scentlessAndColorless[1]);
		System.out.println("Результат работы нейрона:" + buf);
		endurance(scentlessAndColorless, buf);
		buf = flower.work(nosyAndColorfull);
		System.out.println("Тест четвертый. Яркий, но лишенный запаха цветок.\nПараметры цветка:\nЗапах - "
				+ nosyAndColorfull[0] + "\nОкрас - " + nosyAndColorfull[1]);
		System.out.println("Результат работы нейрона:" + buf);
		endurance(nosyAndColorfull, buf);
	}
}
