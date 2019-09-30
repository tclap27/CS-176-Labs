package edu.monmouth.cs176.s1218375;

public class RunnerTest {

	public static void main(String[] args) {
		RunnerList runners = new RunnerList();
		
		// 1. get total count of Registered runners. Print the value
		Integer total = runners.totalRunners();
		System.out.println("Total Runners: " + total);
		
		
		// 2. get total count of t-shirts for size XS, S, M, L, XL, 2XL, 3XL
		//    print individual size counts
		Integer XS = runners.getTshirtCount("XS");
		Integer S = runners.getTshirtCount("S");
		Integer M = runners.getTshirtCount("M");
		Integer L = runners.getTshirtCount("L");
		Integer XL = runners.getTshirtCount("XL");
		Integer TwoXL = runners.getTshirtCount("2XL");
		Integer ThreeXL = runners.getTshirtCount("3XL");

		System.out.println("Total Number of XS t-shirts: " + runners.getTshirtCount("XS"));
		System.out.println("Total Number of S t-shirts: " + runners.getTshirtCount("S"));
		System.out.println("Total Number of M t-shirts: " + runners.getTshirtCount("M"));
		System.out.println("Total Number of L t-shirts: " + runners.getTshirtCount("L"));
		System.out.println("Total Number of XL t-shirts: " + runners.getTshirtCount("XL"));
		System.out.println("Total Number of 2XL t-shirts: " + runners.getTshirtCount("2XL"));
		System.out.println("Total Number of 3XL t-shirts: " + runners.getTshirtCount("3XL"));
		 
		// 3. get sum of t-shirt sizes
		//    print to verify the count adds up value in 1. above
		System.out.print("Sum of t-shirt sizes: ");
		System.out.print(XS + S + M + L + XL + TwoXL + ThreeXL);
		
		System.out.println("");
		
		// 4. Select a valid runner to delete 
		//    if found print "runner deleted" and total runners count
		//    else not found
		
		// 4a. Select a runner to delete 
		//    if found print "runner deleted" and total runners count
		//    else not found
		
		// Hint: Can we complete a method here to do steps 4 and 4a?
		
		boolean update = runners.deleteRunner("5");
		if(update)
		{
			System.out.println("Runner Deleted");
			System.out.println("Totals Runners Count: " + runners.totalRunners());
		}
		else
		{
			System.out.println("Runner not found");
		}
		
		//test method here for countshirtsizes
		
	}

}
