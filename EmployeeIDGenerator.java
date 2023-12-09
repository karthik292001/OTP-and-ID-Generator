import java.util.Random;

public class EmployeeIDGenerator {

	public static void main(String[] args) {
		
		String id=generateID();
		System.out.println("Generated Employee ID: "+id);

	}
	
	public static String generateID() {
		
//		Length of ID to be generate
		int length=8;
		
//		Characters to be used to generate ID
		String characters="ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
		
//		Using StringBuffer to build ID efficiently
		StringBuffer id=new StringBuffer();
		
//		Generating random indices for characters using Math.random()
		for(int i=0;i<length;i++) {
			int index=(int)(Math.random()*characters.length());
			id.append(characters.charAt(index));
		}
		
//		Returning ID as String
		return new String(id);
		
	}

}