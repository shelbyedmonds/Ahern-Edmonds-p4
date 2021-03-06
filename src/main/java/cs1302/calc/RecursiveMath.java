package cs1302.calc;
import java.lang.ArithmeticException;
/* Implement the Math interface using recursion here. For each method, replace
 * the throw statement with your implementation.
 */

/** This method implements the Math interface using recursion to carry out basic
 * math operations.
 *
 * @author Alec Ahern and Shelby Edmonds 
 */
public class RecursiveMath implements Math {

/** This method recursively implements an incrementing method.
 *
 * @param n int
 * @return int
 */
    public int inc(int n) {
        return n+1;
    } // inc

/** This method recursively implements a decrementing method.
 *
 * @param n int 
 * @return int
 */
    public int dec(int n) {
        if (n == 0) return 0;
	return n-1;
    } // dec

/** This method recursively implements an addition method.
 *
 * @param lhs int
 * @param rhs int
 * @return int
 */
    public int add(int lhs, int rhs) {
	if (rhs == 0) return lhs;
	return add(inc(lhs), dec(rhs));
    } // add

/** This method recursively implements  a subtraction method.
 *
 * @param lhs int
 * @param rhs int
 * @return int
 */
    public int sub(int lhs, int rhs) {
	if (rhs == 0) return lhs;
	return sub(dec(lhs), dec(rhs));
    } // sub

/** This method recursively implements a multiplication method.
 *
 * @param lhs int
 * @param rhs int
 * @return int
 */ 
    public int mul(int lhs, int rhs) {
	if (lhs == 0 || rhs == 0) return 0;
	else if (rhs == 1) return (lhs);
	return lhs + mul(lhs, dec(rhs));
    } // mul

/** This method recursively implements  a division method.
 *
 * @param lhs int
 * @param rhs int
 * @return int
 */
    public int div(int lhs, int rhs) {
	try{
	if(rhs==0){	
		throw new ArithmeticException();
	}
	}
	catch(ArithmeticException e){
		return 0;
	}
	if (lhs == 0) return 0;
	else if (lhs == rhs) return 1;
	else if (lhs < rhs) return 0;
	return 1 + div(lhs - rhs, rhs);
    	
	} // div

/** This method recursively implements a factorial method.
 *
 * @param n int
 * @return int
 */
    public int fac(int n) {
	if (n == 0) return 1;
	return (n * fac(dec(n)));
    } // fac

/** This method recursively implements  a power method.
 *
 * @param lhs int
 * @param rhs int
 * @return int
 */
    public int pow(int lhs, int rhs) {
	if (lhs == 0) return 0;
	if (rhs == 0) return 1;
	return lhs * pow(lhs, dec(rhs));
	
    } // pow

} // RecursiveMath
