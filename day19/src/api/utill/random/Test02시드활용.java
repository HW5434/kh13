package api.utill.random;

import java.text.DecimalFormat;
import java.util.Random;

public class Test02시드활용 {

	public static void main(String[] args) {
		
		long time = System.currentTimeMillis();
		System.out.println("time = " + time);
		long seed = time / 60000;
		System.out.println("seed = " + seed);
		
		Random r = new Random(seed);
		int otp = r.nextInt(1000000);
		DecimalFormat fmt = new DecimalFormat("0000000");
		System.out.println("otp = " + fmt.format(otp));
	}

}
