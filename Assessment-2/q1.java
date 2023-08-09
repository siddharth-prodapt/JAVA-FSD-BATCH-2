interface AdvancedArithmetic{
	int divisor_sum(int n);
}

class MyCalculator implements AdvancedArithmetic{
	@Override
	public int divisor_sum(int n) {
		int sum = 0;
		for(int i=1; i<=n; i++) {
			if(n%i == 0) {
				sum=sum+i;
			}
		}
		return sum;
	}
}
public class q1 {
	public static void main(String[] args) {
		MyCalculator ob = new MyCalculator();
		System.out.println(ob.divisor_sum(6));
	}
}
