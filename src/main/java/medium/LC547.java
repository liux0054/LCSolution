package medium;

public class LC547 {
    public int findCircleNum(int[][] M) {
       int[] friendLeader = new int[M.length];
       for(int i=0; i<friendLeader.length; i++){
           friendLeader[i] = i;
       }

       for(int i=0; i<M.length; i++){
           for(int j=i+1; j<M.length; j++){
               if(M[i][j] == 1){
                   int k = i;
                   int l = j;
                   while(friendLeader[k] != k){
                       k = friendLeader[k];
                   }
                   while(friendLeader[l] != l){
                       l = friendLeader[l];
                   }
                   friendLeader[l] = k;
               }
           }
       }

       int answer = 0;
       for(int i=0; i<friendLeader.length; i++){
           if(friendLeader[i] == i){
               answer++;
           }
       }
       return answer;
    }
}
