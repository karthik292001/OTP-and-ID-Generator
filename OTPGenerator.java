import java.util.Random;

public class OTPGenerator {

	public static void main(String[] args) {
		
		String otp=generateOTP();
		System.out.println("Generated OTP: "+otp);

	}
	
	public static String generateOTP() {
		
//		Length of the OTP to be generate
		int length=6;
		
//		Characters to be used in the OTP
		String numbers="0123456789";
		
//		Using StringBuffer to build OTP efficiently
		StringBuffer otp=new StringBuffer();
		
//		Generating random indices for the characters using Math.random()
		for(int i=0;i<length;i++) {
			int index=(int)(Math.random()*numbers.length());
			otp.append(numbers.charAt(index));		
		}
		
//		Returning OTP as string
		return new String(otp);
	}
	
}
