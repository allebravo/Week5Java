
public class AsteriskLogger implements Logger{
	public void log(String str1) {
		System.out.println("***"+ str1 + "***");
}

public void error(String str2) {
	System.out.println("****************");
	System.out.println("***Error: "+ str2 + "***");
	System.out.println("****************");
}
}
