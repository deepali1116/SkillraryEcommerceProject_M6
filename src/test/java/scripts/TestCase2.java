package scripts;

import org.testng.annotations.Test;
import pomPages.SkillraryDemoLoginPage;
import pomPages.SkillraryLoginPage;
import pomPages.TestingcatogaryPage;

import genericLibrary.BaseClass;

public class TestCase2 extends BaseClass {
	@Test
	public void tc2() throws Throwable
	{
		SkillraryLoginPage s=new SkillraryLoginPage(driver);
		s.greasbutton();
		s.skillrarydemoapplication();
		utilies.switchingtabs(driver);
		SkillraryDemoLoginPage sd=new SkillraryDemoLoginPage(driver);
		
	
		utilies.dropDown(sd.getCoursedd(),pdata.getPropertydata("courseadd"));
		Thread.sleep(2000);
		TestingcatogaryPage t=new TestingcatogaryPage(driver);
		utilies.dragAnddrop(driver, t.getSeleniumtraining(), t.getCarttab());
		
		
		
		
	}

}
