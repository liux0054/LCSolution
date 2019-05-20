package medium.lc201tolc400;

import java.util.PriorityQueue;

public class LC378 {
    public int kthSmallest(int[][] matrix, int k) {
       int maxSizeOfQueue = matrix[0].length * matrix[0].length - k + 1;
        PriorityQueue<Integer> queue = new PriorityQueue<>();

       for(int[] row : matrix){
           for(int number : row){
               if(queue.size() < maxSizeOfQueue){
                   queue.add(number);
               }
               else{
                   if(number > queue.peek()){
                       queue.poll();
                       queue.add(number);
                   }
               }
           }
       }
       return queue.peek();
    }
}
