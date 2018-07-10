package testngFramework.testNGConcepts;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo {
	@DataProvider(name = "test_data")
	public Object[][] testData(){
		Object[][] data = {
				{1, "surya", "kukatpally"},
				{2, "srinivas", "KPHB"},
				{3, "teja", "lingampally"}};
		return data;
	}
	
	@Test(dataProvider = "test_data")
	public void testCaseOne(int id, String name, String address) {
		System.out.println("id: "+id+"\nname: "+name+"\naddress: "+address);
	}
	
}
