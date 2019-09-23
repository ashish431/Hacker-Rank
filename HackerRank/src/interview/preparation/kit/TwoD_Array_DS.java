package interview.preparation.kit;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class TwoD_Array_DS {

	// Complete the hourglassSum function below.
	static int hourglassSum(int[][] arr) {
		int max_sum = 0;
		for (int i = 0; i < 4; i++) {
			/*
			 * int sum = 0; int row1 = arr[i][i] + arr[i][i + 1] + arr[i][i + 2]; int row2 =
			 * arr[i + 1][i + 1]; int row3 = arr[i + 2][i] + arr[i + 2][i + 1] + arr[i +
			 * 2][i + 2]; sum = row1 + row2 + row3; System.out.println("Sum[" + i + "]" +
			 * "[" + i + "] : " + sum); if (i == 0) max_sum = sum; else { if (max_sum < sum)
			 * max_sum = sum; } System.out.println("Max Sum : " + max_sum);
			 */

			for (int j = 0; j < 4; j++) {
				int sum = 0;
				int row1 = arr[i][j] + arr[i][j + 1] + arr[i][j + 2];
				int row2 = arr[i + 1][j + 1];
				int row3 = arr[i + 2][j] + arr[i + 2][j + 1] + arr[i + 2][j + 2];
				sum = row1 + row2 + row3;
				System.out.println("Sum[" + i + "]" + "[" + j + "] : " + sum);

				if (i == 0 && j==0)
					max_sum = sum;
				else {
					if (max_sum < sum) {
						System.out.println("In else if");
						max_sum = sum;
					}
				}
				System.out.println("Max Sum : " + max_sum);

			}
		}

		return max_sum;

	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		// BufferedWriter bufferedWriter = new BufferedWriter(new
		// FileWriter(System.getenv("OUTPUT_PATH")));

		int[][] arr = new int[6][6];

		for (int i = 0; i < 6; i++) {
			String[] arrRowItems = scanner.nextLine().split(" ");
			scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

			for (int j = 0; j < 6; j++) {
				int arrItem = Integer.parseInt(arrRowItems[j]);
				arr[i][j] = arrItem;
			}
		}

		int result = hourglassSum(arr);
		System.out.println(result);
		// bufferedWriter.write(String.valueOf(result));
		// bufferedWriter.newLine();

		// bufferedWriter.close();

		scanner.close();
	}
}
