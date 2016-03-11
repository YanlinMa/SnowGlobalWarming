/*======================================
  class MergeSortTester

  ALGORITHM:
  <INSERT YOUR DISTILLATION OF ALGO HERE>

  BIG-OH CLASSIFICATION OF ALGORITHM:
  <INSERT YOUR EXECUTION TIME CATEGORIZATION OF MERGESORT HERE>

  Mean execution times for dataset of size n:
  Batch size: <# of times each dataset size was run>
  n=1       time: 
  n=10      time: 
  n=100     time: 
  ...
  n=<huge>  time: 

  ANALYSIS:
  <INSERT YOUR RESULTS ANALYSIS HERE>
  ======================================*/

public class MergeSortTester 
{

    /******************************
     * execution time analysis 
     * <INSERT YOUR DESCRIPTION HERE OF 
     *  YOUR APPARATUS FOR GENERATING EXECUTION 
     *  TIME DATA...>
     ******************************/

    public static long timer(int[] a) {
	long start = System.nanoTime();
	MergeSort.sort(a);
	long end = System.nanoTime();
	return end - start;
    }

    public static void main( String[] args ) 
    {

	int[] ten = new int[10];
	int[] hun = new int[100];
	int[] thou = new int[1000];
	int[] tenThou = new int[10000];
	int[] hunThou = new int[100000];
	int[] milli = new int[1000000];

	long sum1 = 0;
	long sum2 = 0;
	long sum3 = 0;
	long sum4 = 0;
	long sum5 = 0;
	long sum6 = 0;

	int counter = 100; //number of repeated executions
	while (counter > 0) {

	    sum1 += timer(ten);
	    sum2 += timer(hun);
	    sum3 += timer(thou);
	    sum4 += timer(tenThou);
	    sum5 += timer(hunThou);
	    sum6 += timer(milli);

	    counter --;
	}

	System.out.println("Average time for n=10: " + sum1/10.0);
	System.out.println("Average time for n=100: " + sum2/10.0);
	System.out.println("Average time for n=1000: " + sum3/10.0);
	System.out.println("Average time for n=10000: " + sum4/10.0);
	System.out.println("Average time for n=100000 " + sum5/10.0);
	System.out.println("Average time for n=1000000 " + sum6/10.0);

    }//end main

}//end class
