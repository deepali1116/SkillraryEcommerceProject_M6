package scripts;

import org.testng.annotations.Test;
import pomPages.SkillraryLoginPage;
import pomPages.SkillraryDemoLoginPage;
import pomPages.AddtoCartPage;

import genericLibrary.BaseClass;

public class TestCase1  extends BaseClass {
	@Test
	public void tc1() throws InterruptedException
	{
		SkillraryLoginPage s=new SkillraryLoginPage(driver);
		s.greasbutton();
		s.skillrarydemoapplication();
		utilies.switchingtabs(driver);
		SkillraryDemoLoginPage sd=new SkillraryDemoLoginPage(driver);
		utilies.mouseHover(driver,sd.getCousretab());
		sd.seleniumtrainingtab();
		
		
		AddtoCartPage ap=new AddtoCartPage(driver);
		utilies.doubleClick(driver, ap.getAddbtn());
		ap.carttocartbtn();
		utilies.alertPopup(driver);
		
		
		
		
	}

}

