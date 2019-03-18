package RunnerClass;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BaseClass.TestBase;
import Modulecheck.Modules;

public class Loginclass extends TestBase {
	
	public Loginclass(){
		super();
		
}

	@BeforeMethod
	public void setUp() throws InterruptedException {
		parameter();
		Loginclass d1 = new Loginclass();
	}
	
	
	@Test
	public void mainclass()
	{
		Modules d1 = new Modules();
		d1.Language();
		d1.favorites();
		Assert.assertTrue(d1.Defaultlink(), " label is missing on the page");
		Assert.assertTrue(d1.VerifyFavoriteModules2(), " label is missing on the page");
		d1.Process();
		Assert.assertTrue(d1.VerifyProcessvalues2(), " label is missing on the page");
		
	}

}
