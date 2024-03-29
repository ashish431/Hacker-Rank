package interview.preparation.kit;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
public class MerchantSock {


    // Complete the sockMerchant function below.
    static int sockMerchant(int n, int[] ar) {
    	int sock_counter=0;
    	Set<Integer> set=new HashSet<Integer>();
    	for(int i=0;i<n;i++)
    	{
    		if(set.contains(ar[i])) 			
    		{
    			set.remove(ar[i]);
    			sock_counter++;
    		}
    		else
    			set.add(ar[i]);
    	}
    	
    	return sock_counter;


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] ar = new int[n];

        String[] arItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arItem = Integer.parseInt(arItems[i]);
            ar[i] = arItem;
        }

        int result = sockMerchant(n, ar);
        //System.out.println(result);
        //bufferedWriter.write(String.valueOf(result));
        //bufferedWriter.newLine();

        //bufferedWriter.close();

        scanner.close();
    }
}
