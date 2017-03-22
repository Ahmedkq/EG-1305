import java.math.BigInteger;

public class Chess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


BigInteger totalGrain = BigInteger.valueOf(1);

BigInteger grain = BigInteger.valueOf(1);

for ( int i = 1; i < 64; i++){
			grain = grain.multiply(BigInteger.valueOf(2));
totalGrain = totalGrain.add(grain);
}

		
		
		
		
		
	

System.out.println(grain + " Grains on last square");
System.out.println( totalGrain + " Total Grains used");

}
}