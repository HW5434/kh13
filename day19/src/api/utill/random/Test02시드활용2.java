package api.utill.random;

import java.text.DecimalFormat;
import java.util.Random;

public class Test02시드활용2 {

	public static void main(String[] args) {
		
		long time = System.currentTimeMillis();
		System.out.println("time = " + time);
		long seed = time / 60000;
		System.out.println("seed = " + seed);
		
		String user1 = "khacademy";
		String user2 = "student";
		
		Random r1 = new Random(user1.hashCode() + seed);
		Random r2 = new Random(user2.hashCode() + seed);
		
		int otp1 = r1.nextInt(1000000);
		int otp2 = r2.nextInt(1000000);

		Random r = new Random(seed);
		DecimalFormat fmt = new DecimalFormat("0000000");
		System.out.println("otp1 = " + fmt.format(otp1));
		System.out.println("otp2 = " + fmt.format(otp2));
	}

}
//123