import java.math.BigInteger;
class MultipleOfHundredNumbers{
	public static void main(String args[]){
		BigInteger mul = BigInteger.ONE;
		for(int i=1;i<=100;i++){
			mul = mul.multiply(BigInteger.valueOf(i));
		}
		System.out.println(mul);
	}
}