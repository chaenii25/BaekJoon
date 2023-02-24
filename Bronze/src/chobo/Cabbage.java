package chobo;

import java.util.Scanner;

public class Cabbage {
	Scanner scanner = new Scanner(System.in);
	private boolean ca[][];
	private int width;
	private int length;
	private int num;
	private int x;
	private int y;
	
	public void getInfo() {
		width = scanner.nextInt();
		length = scanner.nextInt();
		num = scanner.nextInt();
	}

	public void getIndex() {
		x = scanner.nextInt();
		y = scanner.nextInt();
	}
}
