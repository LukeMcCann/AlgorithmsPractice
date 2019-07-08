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
		System.out.println(calculateGCD(20, 8));
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
}
