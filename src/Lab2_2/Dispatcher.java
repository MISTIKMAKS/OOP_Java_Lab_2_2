package Lab2_2;

import java.lang.Math;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Dispatcher {
    static int array_result_min(int[] A, int max, int min, int max_key, int min_key)
    {
        for (int i = 0; i < 10; i++)
        {
            if (A[i] < min)
            {
                min = A[i];
                min_key = i;
            }
        }
        return min_key;
    }
    static int array_result_max(int[] A, int max, int min, int max_key, int min_key)
    {
        for (int i = 0; i < 10; i++)
        {
            if (A[i] > max)
            {
                max = A[i];
                max_key = i;
            }
        }
        return max_key;
    }
    static int output(int[] A)
    {
    	System.out.print("Array: ");
        for (int i = 0; i < 10; i++)
        {
        	System.out.print("[" + i + "] " + A[i] + "   ");
        }
        return 1;
    }

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

        //-------Done-------
        int[] A = { 46, 22, 39, 45, 94, 69, 53, 23, 57, 79 };
        //-------Random-------
        //int Min_Rand = 0;
        //int Max_Rand = 100;
        //int[] A = new int[10];
        //for (int i = 0; i < A.length; i++)
        //{
        //    A[i] = ThreadLocalRandom.current().nextInt(Min_Rand, Max_Rand);
        //}
        //-------Input-------
        //int[] A = new int[10];
        //for (int i = 0; i < A.length; i++)
        //{
        //    System.out.print("A[" + i + "] = ");
        //    A[i] = scan.nextInt();
        //}

        int max = A[0];
        int min = A[0];
        int max_key = 0;
        int min_key = 0;
        System.out.println("Result(min): " + array_result_min(A, max, min, max_key, min_key));
        System.out.println("Result(max): " + array_result_max(A, max, min, max_key, min_key));
        System.out.println("" + output(A));
	}
}
