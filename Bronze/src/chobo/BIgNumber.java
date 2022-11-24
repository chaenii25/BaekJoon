package chobo;

public class BIgNumber {
	
	public String solution(String number, int k) {
		int first_idx = 0;
		int last_idx = k;
		
		StringBuilder sb = new StringBuilder("");
		
		for(int i=0; i<number.length()-k; i++) {
			char max = 0;
			int max_idx = 0;
			
			for (int j=first_idx; j<last_idx; j++) {
				if(number.charAt(j)>max) {
					max = number.charAt(j);
					max_idx = j;
				}
			}
			
			sb.append(max);
			first_idx = max_idx+1;
			last_idx++;
		}
		
		return sb.toString();
	}
	
	public static void main(String[] args) {
		BIgNumber b = new BIgNumber();
		System.out.println(b.solution("9234", 4));
	}
}
