package chobo;

import java.util.Scanner;

public class WordClock {

	public static void main(String[] args) {
		String[] list = {" o' clcock",
				"one","two","three","four","five","six","seven",
				"eight","nine","ten","eleven","twelve","thirteen","fourteen",
				"quarter ","sixteen","seventeen","eighteen","nineteen",
				"twenty","twenty one", "twenty two", "twenty three",
				"twenty four", "twenty five", "twenty six","twenty seven",
				"twenty eight", "twenty nine", "half "};
		String link = "past ";
		
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int m = sc.nextInt();
		sc.close();
		if(m>30) {
			m=60-m; link="to ";
			if(h==12) h=1;
			else h++;
			}
		
		switch (m) {
		case 0:
			System.out.println(list[h]+list[m]);
			break;
		case 1:
			System.out.println(list[m]+" minute "+link+list[h]);
			break;
		case 15: case 30:
			System.out.println(list[m]+link+list[h]);
			break;
		default:
			System.out.println(list[m]+" minutes "+link+list[h]);
			break;
		}
	}
}
