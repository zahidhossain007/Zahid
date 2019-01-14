import org.openqa.selenium.By;

public class Practice {
	Shared s = new Shared();
	public void facebooksignUp() throws InterruptedException {
		s.openBrowser();
		s.myGet("http://www.facebook.com");
		System.out.println("Started test in Facebook.......");
		s.verifyPageTitle();
		s.verifyPageUrl();
		s.type(s.dr.findElement(By.id("u_0_c")),"Bittech");
		s.closeBroser();
		System.out.println("Ended test in Facebook.......");
	}
	
	public void targetCategoryVerify() throws InterruptedException {
	s.openBrowser();
	s.myGet("http://www.target.com");
	System.out.println("Started test in Target......");
	s.verifyPageTitle();
	s.verifyPageUrl();
	s.type(s.dr.findElement(By.name("searchTerm")),"Toys");
	s.closeBroser();
	System.out.println("Ended test in Target.......");

}
}