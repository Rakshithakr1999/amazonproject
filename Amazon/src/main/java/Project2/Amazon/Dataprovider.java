package Project2.Amazon;

import org.testng.annotations.DataProvider;

public class Dataprovider 
{
	
	@DataProvider(name="Product")
	public Object[][] methodtolistproduct()
	{
		return new Object[][] {{"Shirt"}};
	}

}
