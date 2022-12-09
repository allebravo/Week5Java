


public class SpacedLogger implements Logger {

	public void log(String str1) {
		for(int i =0; i< str1.length(); i++) {
			System.out.print(str1.charAt(i)+ " ");
		}
		
	}

	public void error(String str2) {
		StringBuilder result = new StringBuilder();
		for(int i =0; i< str2.length(); i++) {
			result.append(str2.charAt(i)+  " ");
		}
		System.out.println("ERROR:"+ result.toString());
	}

}