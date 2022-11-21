package chobo;

import java.util.Scanner;

public class Share {

	public static void main(String[] args) {
		long sum=0;
		Scanner sc = new Scanner(System.in);
		long N = sc.nextInt();
		
		for(long i=1; i<N; i++) {
			sum += i*N + i;
		}
		
		System.out.println(sum);
	}

}
