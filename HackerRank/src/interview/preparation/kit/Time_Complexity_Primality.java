package interview.preparation.kit;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Time_Complexity_Primality {

    // Complete the primality function below.
    static String primality(int number) {
        if (number < 2) return "Not prime";
        if (number == 2) return "Prime";
        if (number % 2 == 0) return "Not prime";
        for (int i=3; (i*i) <= number; i+=2) {
            if (number % i == 0 ) return "Not prime";
        }
        return "Prime";

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int p = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int pItr = 0; pItr < p; pItr++) {
            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            String result = primality(n);

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
	
}
