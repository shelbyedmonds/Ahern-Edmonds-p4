package cs1302.calc;

/* Implement the Math interface using recursion here. For each method, replace
 * the throw statement with your implementation.
 */

/**
 * REPLACE ME WITH ACTUAL JAVADOC FOR THIS CLASS.
 *
 * @author AUTHOR
 */
public class RecursiveMath implements Math {

	public int inc(int n) {
        return n+1;
    } // inc

    public int dec(int n) {
        if (n == 0) return 0;
	return n-1;
    } // dec

    public int add(int lhs, int rhs) {
	if (rhs == 0) return lhs;
	return add(inc(lhs), dec(rhs));
    } // add

    public int sub(int lhs, int rhs) {
	if (rhs == 0) return lhs;
	return sub(dec(lhs), dec(rhs));
    } // sub

    public int mul(int lhs, int rhs) {
	if (lhs == 0 || rhs == 0) return 0;
	else if (rhs == 1) return (lhs);
	return lhs + mul(lhs, dec(rhs));
    } // mul

    public int div(int lhs, int rhs) {
	if (lhs == 0) return 0;
	else if (lhs == rhs) return 1;
	else if (lhs < rhs) return 0;
	return 1 + div(lhs - rhs, rhs);
    } // div

    public int fac(int n) {
	if (n == 0) return 1;
	return (n * fac(dec(n)));
    } // fac

    public int pow(int lhs, int rhs) {
	if (lhs == 0) return 0;
	if (rhs == 0) return 1;
	return lhs * pow(lhs, dec(rhs));
	
    } // pow

} // RecursiveMath
