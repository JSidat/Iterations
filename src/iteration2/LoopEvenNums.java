package iteration2;

public class LoopEvenNums {

	public static void main(String[] args) {
		int i = 100;

		while (i <= 200) {
			if (i % 2 == 0) {
				System.out.println("-");
			} else {
				System.out.println("*");
			}
			i++;
		}

	}

}
