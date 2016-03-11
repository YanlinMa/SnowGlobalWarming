/*======================================
  class MergeSortTester

  ALGORITHM:
  MergeSort contains two functions. Merge() compares respective elements of two lists
  and determines which is smaller and places them into another ordered list.
  Sort() initially splits the large array into halves until it reaches a point in which
  the smallest lists contain only one element, and then merges the smaller arrays back 
  together into the largest array, which should by now already be sorted.

  BIG-OH CLASSIFICATION OF ALGORITHM:
  O(nlogn)

  Mean execution times for dataset of size n:
  Batch size: 100
  n=1       time: 53838.8
  n=10      time: 16838.3
  n=100     time: 72759.5
  ...
  n=<huge>  time: 8.487531867E8

  Utilizing a different computer:
  Mean execution times for dataset of size n:
  Batch size: 100
  n=1       time: 245900
  n=10      time: 20200
  n=100     time: 100500
  n=1000    time: 1063900
  n=10000   time: 1.49395E7
  n=100000  time: 1.1895E8
  n=1000000 time: 1.2629411E9
  
  ANALYSIS:
  The sort() part of MergeSort runs in logn time, since it splits the list in half
  and recursively runs on halves of the list after each turn.
  The merge() part of MergeSort runs in n time, since it needs to compare
  all the respective elements of two lists until at least one of them is exhausted.
  The time gets increasing larger as the data sets get larger,
  with the exception of the first, n=1, case.

  DOES OUR DATA SHOW THIS?
  When taken with a large enough grain of salt, the nlog(n) time is shown by out data. 
  Although it is not as clean as one might like, when graphing the points and then 
  transcribing the line y=nlog(n) on to the same plane, similarities in growth can be found.
  ======================================*/

public class MergeSortTester 
{

    /******************************
     * execution time analysis 
     *   Set start time variable, run MergeSort, set end time variable.
     *	 Subtract end time from start time to get result.
     *   Make arrays of different lengths and give them values to be sorted using MergeSort.
     *   Time their executions and find the averages.
     ******************************/

    public static long timer(int[] a) {
	long start = System.nanoTime();
	MergeSort.sort(a);
	long end = System.nanoTime();
	return end - start;
    }

    public static void main( String[] args ) 
    {

	int[] one = new int[1];
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
	long sum7 = 0;

	int counter = 100; //number of repeated executions
	while (counter > 0) {

	    sum1 += timer(one);
	    sum2 += timer(ten);
	    sum3 += timer(hun);
	    sum4 += timer(thou);
	    sum5 += timer(tenThou);
	    sum6 += timer(hunThou);
	    sum7 += timer(milli);

	    counter --;
	}

	System.out.println("Average time for n=1: " + sum1/10.0);
	System.out.println("Average time for n=10: " + sum2/10.0);
	System.out.println("Average time for n=100: " + sum3/10.0);
	System.out.println("Average time for n=1000: " + sum4/10.0);
	System.out.println("Average time for n=10000: " + sum5/10.0);
	System.out.println("Average time for n=100000 " + sum6/10.0);
	System.out.println("Average time for n=1000000 " + sum7/10.0);

    }//end main

}//end class
