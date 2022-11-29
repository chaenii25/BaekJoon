package chobo;

import java.util.*;
class Solution {
    public int solution(int n, int[][] lighthouse) {
        int answer = 0;
        ArrayList<Integer> lighted[] = new ArrayList[n];
        
        for (int i = 0; i < n; i++) {
            lighted[i] = new ArrayList<Integer>();
        }
        
        for (int i = 0; i < n - 1; i++) {
            lighted[lighthouse[i][0] - 1].add(lighthouse[i][1] - 1);
            lighted[lighthouse[i][1] - 1].add(lighthouse[i][0] - 1);
        }

        Queue<Integer> queue = new LinkedList<Integer>();
        for (int i = 0; i < n; i++) {
            if (lighted[i].size() == 1) queue.offer(i);
        }

        while (!queue.isEmpty()) {
            int num = queue.poll();
            
            if (lighted[num].size() == 0) continue;
         
            int lightOn = lighted[num].get(0);
            
            if (lighted[lightOn].size() == 0) continue;
            for (int i = 0; i < lighted[lightOn].size(); i++) {
                int next = lighted[lightOn].get(i);
                lighted[next].remove(lighted[next].indexOf(lightOn));
                if (lighted[next].size() == 1) queue.offer(next);
            }
            lighted[lightOn].clear();
            answer++;
        }

        return answer;
    }
}

public class LitghtHouse {
	

}
