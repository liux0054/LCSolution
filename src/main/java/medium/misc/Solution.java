package medium.misc;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



    class Result {

        /*
         * Complete the 'countSum' function below.
         *
         * The function is expected to return a LONG_INTEGER.
         * The function accepts INTEGER_ARRAY numbers as parameter.
         */

        public static long countSum(List<Integer> numbers) {
// Write your code here
            long answer = 0;
            for(int number:numbers)
            {
                for(int i=1;i<=(int)Math.sqrt(number);i++)
                {
                    if(i%2==1 && number%i==0)
                    {
                        answer=answer+i;

                        if(number/i%2==1 && i*i!=number)
                        {
                            answer = answer+number/i;
                        }
                    }
                }
            }

            return answer;
        }

    }

    public class Solution {
        public static void main(String[] args) throws IOException {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

            int numbersCount = Integer.parseInt(bufferedReader.readLine().trim());

            List<Integer> numbers = IntStream.range(0, numbersCount).mapToObj(i -> {
                try {
                    return bufferedReader.readLine().replaceAll("\\s+$", "");
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            })
                .map(String::trim)
                .map(Integer::parseInt)
                .collect(toList());

            long result = Result.countSum(numbers);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();

            bufferedReader.close();
            bufferedWriter.close();
        }
    }

