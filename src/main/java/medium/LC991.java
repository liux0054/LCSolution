//package medium;
//
//import java.util.HashSet;
//import java.util.LinkedList;
//import java.util.Queue;
//import java.util.Set;
//
//public class LC991 {
//    public int brokenCalc(int X, int Y) {
//        Queue<Integer> xQueue = new LinkedList<>();
//        Queue<Integer> stepQueue = new LinkedList<>();
//
//        if(X == Y){
//            return 0;
//        }
//
//        xQueue.add(X);
//        stepQueue.add(0);
//        Set<Integer> visited = new HashSet<>();
//        visited.add(X);
//
//        while(true){
//            int headX = xQueue.peek();
//            int headStep = stepQueue.peek();
//
//            if(headX < Y){
//                X = headX * 2;
//                if(!visited.contains(X)){
//                    if(X == Y){
//                        return headStep+1;
//                    }
//                    visited.add(X);
//                    xQueue.add(X);
//                    stepQueue.add(headStep+1);
//                }
//            }
//
//            X = headX - 1;
//            if(!visited.contains(X)){
//                if(X == Y){
//                    return headStep+1;
//                }
//                visited.add(X);
//                xQueue.add(X);
//                stepQueue.add(headStep+1);
//            }
//
//            xQueue.poll();
//            stepQueue.poll();
//        }
//    }
//}
