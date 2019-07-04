package misc.hackerrank;


import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the extraLongFactorials function below.
    static void extraLongFactorials(int n) {
        int maxCellNumber = 100000000;
        int[] answer = new int[635];
        answer[0] = 1;
        for(int i=1; i<=n; i++){
            for(int j=0; j<answer.length; j++){
                answer[j] = answer[j] * i;
            }
            for(int j=0; j<answer.length-1; j++){
                if(answer[j] >= maxCellNumber){
                    answer[j+1] = answer[j] / maxCellNumber;
                    answer[j] = answer[j] % maxCellNumber;
                }
            }
        }

        int j=answer.length-1;
        while(answer[j] == 0){
            j--;
        }
        for(int i=j; i>=0; i--){
            System.out.print(answer[i]);
        }
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        extraLongFactorials(n);

        scanner.close();
    }
}
