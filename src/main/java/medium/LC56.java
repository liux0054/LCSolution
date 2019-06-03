package medium;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class LC56 {
    public int[][] merge(int[][] intervals) {
        Map<Integer, List<Integer>> connected = new HashMap<>();
        for(int i=0; i<intervals.length; i++){
            for(int j=i+1; j<intervals.length; j++) {
                if(!(intervals[i][1] < intervals[j][0] || intervals[j][1] < intervals[i][0])){
                    putInMap(i, j, connected);
                }
            }
        }


        boolean[] visited = new boolean[intervals.length];
        List<int[]> tempAns = new ArrayList<>();
        for(int i=0; i<intervals.length; i++){
            if(!visited[i]){
                tempAns.add(dfs(i, connected, visited, intervals));
            }
        }

        int[][] answer = new int[tempAns.size()][2];
        for(int i=0; i<tempAns.size(); i++){
            for(int j=0; j<2; j++){
                answer[i][j] = tempAns.get(i)[j];
            }
        }
        return answer;
    }

    private void putInMap(int i, int j, Map<Integer, List<Integer>> connected){
        if(connected.containsKey(i)){
            connected.get(i).add(j);
        }else{
            List value = new ArrayList();
            value.add(j);
            connected.put(i, value);
        }

        if(connected.containsKey(j)){
            connected.get(j).add(i);
        }else{
            List value = new ArrayList();
            value.add(i);
            connected.put(j, value);
        }
    }

    private int[] dfs(int i, Map<Integer, List<Integer>> connected, boolean[] visited, int[][] intervals){
        visited[i] = true;
        int min = intervals[i][0];
        int max = intervals[i][1];
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(i);
        while(!queue.isEmpty()){
            int head = queue.poll();
            if(connected.containsKey(head)){
                for(int neighbor : connected.get(head)){
                    if(!visited[neighbor]){
                        queue.offer(neighbor);
                        visited[neighbor] = true;
                        min = Math.min(min, intervals[neighbor][0]);
                        max = Math.max(max, intervals[neighbor][1]);
                    }
                }
            }
        }
        return new int[]{min, max};
    }
}
