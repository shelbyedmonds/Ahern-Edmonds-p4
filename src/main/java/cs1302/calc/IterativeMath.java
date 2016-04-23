package cs1302.calc;
import java.lang.ArithmeticException;

/* Implement the Math interface using iteration here. For each method, replace
 * the throw statement with your implementation.
 */

/** This class implements the Math interface using iteration for basic 
 * math functions.
 *
 * @author Alec Ahern and Shelby Edmonds
 */
public class IterativeMath implements Math {

/**This method implements an iterative incrementation method.
 *
 * @param n int
 * @return int
 */
    public int inc(int n) {
	n++;
	return n;
    } // inc

/**This method implements an iterative decrementation method.
 *
 * @param n int
 * @return int
 */
    public int dec(int n) {
	if(n==0) return 0;
	n--;
	return n;
    } // dec

/**This method implements an iterative addition method.
 *
 * @param lhs int
 * @param rhs int
 * @return int
 */
    public int add(int lhs, int rhs) {
        int sum = 0;
	for (int i = 0; i < lhs; i++) {
		sum = inc(sum);
	}
	for (int j = 0; j < rhs; j++) {
		sum = inc(sum);	
	}
	return sum;
    } // add

/**This method implements an iterative subtration method.
 *
 * @param lhs int
 * @param rhs int
 * @return int
 */
    public int sub(int lhs, int rhs) {
        int tot = lhs;
	for (int i = 0; i < rhs; i++) {
		tot = dec(tot);
	}
	return tot;
    } // sub

/**This method implements an iterative multiplication method.
 *
 * @param lhs int 
 * @param rhs int
 * @return int
 */
    public int mul(int lhs, int rhs) {
    	int product = 0;
	for (int i = 0; i < rhs; i++) {
		for (int j = 0; j < lhs; j++) {
			product = inc(product);
		}
	}
	return product;
    } // mul

/**This method implements an iterative division method.
 *
 * @param lhs int
 * @param rhs int
 * @return int
 */
    public int div(int lhs, int rhs) {
	try{
		if (rhs == 0) {
			throw new ArithmeticException();
		}
	}
	catch(ArithmeticException e){
		return 0;
	}
	if(lhs==0) return 0;
	if(lhs<rhs) return 0;
	int total = lhs;
	int num = 0;
	boolean greaterThanZero = true;
	while (greaterThanZero) {
		total = sub(total, rhs);
		if (total > 0) {
			num = inc(num);
			if (total < rhs) greaterThanZero = false;
		}
		else if (total == 0) {
			num = inc(num);
			greaterThanZero = false;
		}
		else {
			greaterThanZero = false;
		}
	}
	return num;
	
    } // div

/**This method implements an iterative factorial method.
 *
 * @param n int
 * @return int
 */
    public int fac(int n) {
        if(n==0) return 1;
	int fac = n;
	for (int i = (n - 1); i > 0; i--) {
		fac = mul(fac, i);
	}
	return fac;
    } // fac

/**This method implements an iterative power method.
 *
 * @param lhs int
 * @param rhs int
 * @return int
 */
    public int pow(int lhs, int rhs) {
        if (rhs==0) return 1;
	int pow = lhs;
	for (int i = 0; i < rhs-1; i++) {
		pow = mul(pow, lhs);

	}
	return pow;
		
    } // pow

} // IterativeMath

