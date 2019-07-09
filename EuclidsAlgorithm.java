/**
 * 
 * @author Luke McCann
 *
 * Finds the greatest common denominator of two integers.
 */
public class EuclidsAlgorithm 
{

	public static void main(String[] args)
	{
		System.out.println("Non recursive GCD: " + calculateGCD(20, 8));
		System.out.println(calculateGCD("Non recursive GCD: " + 100, 2));
		System.out.println("Non recursive GCD: " + calculateGCD(52, 21));

		System.out.println("Recursive GCD: " + calculateGCD(20, 8));
		System.out.println("Recursive GCD: " + calculateGCD(100, 2));
		System.out.println("Recursive GCD: " + calculateGCD(52, 21));
	}
	
	/**
	 * For two integers a and b, where a > b, divide by b.
	 * if the remainder r == 0 then stop, GCD = b.
	 * else set a to b, b to r, and repeat at step 1 until r == 0
	 * @param a
	 * @param b
	 */
	private static int calculateGCD(int a, int b)
	{
		while(b != 0)
		{
			int tmp = a;
			a = b;
			b = tmp % b;
		}
		return a;
	}

	private static int recursiveGCD(int a, int b)
	{
		if(b == 0)
		{
			return b;
		}
		else 
		{
			return recursiveGCD(b, a % b)
		}
	}
}
