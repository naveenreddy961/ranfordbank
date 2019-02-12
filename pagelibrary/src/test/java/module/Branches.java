package module;

import pagelibrary.Branchespage;

public class Branches 
{
	public static void Branches_dis()
	{
		if(Branchespage.branches.isDisplayed())
		{
			System.out.println("branches button will be displayed and click on btn");
		}
	}
	public static void NewBranches_dis()
	{
		if(Branchespage.newbranches.isDisplayed())
		{
			System.out.println("newbranches button will be displayed and click on btn");
		}
	}
	public static void branches_click()
	{
		Branchespage.branches.click();
	}
	public static void newBranches_click(String b,String add1,String add2,String add3,String area,String zip,String coun,String state,String city)
	{
		
		Branchespage.newbranches.click();
		Branchespage.branchname.sendKeys(b);
		Branchespage.add1.sendKeys(add1);
		Branchespage.add2.sendKeys(add2);
		Branchespage.add3.sendKeys(add3);
		Branchespage.area.sendKeys(area);
		
		Branchespage.zipcode.sendKeys(zip);
		Branchespage.country.sendKeys(coun);
		Branchespage.state.sendKeys(state);
		Branchespage.city.sendKeys(city);
		Branchespage.submit.click();
		
	}
}