package com.ranford.pagelibrary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import module.Branches;
import module.login_module;
import pagelibrary.Branchespage;
import pagelibrary.LoginPage;

public class Step_def
{

	WebDriver driver;
public Step_def()
{
	this.driver=Hooks.driver;
}
@Given("launch the site")
public void launch_the_site()
{
	driver.get("http://183.82.100.55/ranford1/home.aspx");
}

@When("enter the username with {string} and password with {string} and click on login")
public void enter_the_username_with_and_password_with_and_click_on_login(String username, String password) 
{
   PageFactory.initElements(driver, LoginPage.class);
	login_module.login_exe(username, password);
}

@Then("Branches should be display")
public void branches_should_be_display() 
{
	PageFactory.initElements(driver, Branches.class);
	Branches.Branches_dis();
	Branches.branches_click();
	
}

@Then("close the site")
public void close_the_site()
{
   driver.close();
}

@Then("newbranch btn will be displayed")
public void newbranch_btn_will_be_displayed() 
{
	//PageFactory.initElements(driver, Branches.class);
	//Branches.NewBranches_dis();
	
}

@When("click on newbranch btn and create new branch with {string} and {string} and {string} and {string} and {string} and {string} and {string} and {string} and {string}  and click on submit")
public void click_on_newbranch_btn_and_create_new_branch_with_and_and_and_and_and_and_and_and_and_click_on_submit(String BranchName, String Address1, String Address2, String Address3, String Area, String Zipcode, String Country, String State, String City)
{
	PageFactory.initElements(driver, Branches.class);
	Branches.newBranches_click(BranchName, Address1, Address2,Address3,Area, Zipcode,Country, State, City);
}

@Then("branch will created sucessfully")
public void branch_will_created_sucessfully() 
{
   
}
}
