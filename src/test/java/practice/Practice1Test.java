package practice;

import org.testng.annotations.Test;

public class Practice1Test {

	@Test
	public void test1() {
		String browser = System.getProperty("br");
		String url = System.getProperty("ur");
		System.out.println("Practice1");
		System.out.println(browser);
		System.out.println(url);
	}
	
}
