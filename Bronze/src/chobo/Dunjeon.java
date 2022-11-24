package chobo;

public class Dunjeon {
	int max;
	boolean[] visited;
		
		public void bt(int count, int k, int[][] dungeons) {
			for(int i=0; i<dungeons.length; i++) {
				if(!visited[i] && dungeons[i][0]<=k) {
					visited[i] = true;
					bt(count+1, k-dungeons[i][1], dungeons);
					visited[i] = false;
				}
			}
			max = Math.max(max, count);
		}
		
	    public int solution(int k, int[][] dungeons) {
	    	visited = new boolean[dungeons.length];
	    	bt(0, k, dungeons);
	        return max;
	    }
}
