// chettraj
// chettraj
// chettraj
// chettraj
// chettraj
// chettraj
/*
 * First and Last Names
 */

public class Homework3 {

	private int value1, value2, value3;

	public Homework3(int v1, int v2, int v3) {
		value1 = v1;
		value2 = v2;
		value3 = v3;
	}

	/* Call the static grade method in Homework3, passing this object as the
	 * parameter. Calling a static method looks like calling a method on a
	 * class (e.g. Math.random())
	 */
	public void grade() {
		Homework3.grade(this);


	}

	/* Calculate and return the sum of value1, value2, and value3
	 */
	public int sum() {
		int wow = value1 + value2 + value3;
		return wow;


	}

	/* Calculate and return the average of value1, value2, and value3
	 * Hint: the average of numbers can be fractional
	 */
	public double average() {
		double ave1 = value1 + value2 + value3;
		double aveF = ave1/3;
		return aveF;

	}

	/* Calculate and return the difference between the product and sum of
	 * value 1, value2, and value3
	 */
	 public int productSumDifference() {
		int yus = (value1*value2*value3) - (value1+value2+value3);
		return yus;
	 }

	 /* Calculate and return the sum of the squares of value1, value2, and
	  * value3
	  */
	  public int sumSquares() {
			int v11 = value1 * value1;
			int v22 = value2 * value2;
			int v33 = value3 * value3;
			int v112233 = v11 + v22 + v33;
			return v112233;

	  }

	  /* Tests to verify that your solutions work
	   * Do not submit your homework until this compiles and the words
	   * "All Pass" are printed
	   */
	  public static void main(String[] args) {
		  Homework3 hw3 = new Homework3(5, 10, 15);
		  hw3.grade();
	  }

	  public static void grade(Homework3 hw3) {
		  int exitCode = 0;

		  System.out.println("Pass 1");

		  if (hw3.sum() == 30) {
			  System.out.println("Pass 2");
		  } else {
			  System.out.println("Fail 2");
			  exitCode += 1;
		  }

		  if (hw3.average() == 10.0) {
			  System.out.println("Pass 3");
		  } else {
			  System.out.println("Fail 3");
			  exitCode += 1;
		  }

		  if (hw3.productSumDifference() == 720) {
			  System.out.println("Pass 4");
		  } else {
			  System.out.println("Fail 4");
			  exitCode += 1;
		  }

		  if (hw3.sumSquares() == 350) {
			  System.out.println("Pass 5");
		  } else {
			  System.out.println("Fail 5");
			  exitCode += 1;
		  }

		  if (exitCode == 0) {
			  System.out.println("All Pass");
		  } else {
			  System.out.println("Fail");
		  }

		  System.exit(exitCode);
	  }
}
